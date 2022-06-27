package com.example.chemicalculators;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class CalCal5 extends AppCompatActivity {
    int eNo;
    String eG;
    String eP;
    String eSym;
    String eName;
    String eType;
    double eMass;
    String eMelt;
    String eBoil;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_cal3);
        EditText eNoString = (EditText) findViewById(R.id.editTextNumber);
        ImageButton searchButton = (ImageButton) findViewById(R.id.imageButton);
        Button button = (Button) findViewById(R.id.button);
        Button SymPage = (Button) findViewById(R.id.ToOtherPage);
        final TextView outESymbol = (TextView) findViewById(R.id.elementSymbol);
        final TextView outEName = (TextView) findViewById(R.id.elementName);
        final TextView outEMass = (TextView) findViewById(R.id.AtomicMassValue);
        final TextView outEType = (TextView) findViewById(R.id.elementType);
        final TextView outEG = (TextView) findViewById(R.id.elementGroup);
        final TextView outEP = (TextView) findViewById(R.id.elementPeriod);
        final TextView outEMP = (TextView) findViewById(R.id.MPValue);
        final TextView outEBP = (TextView) findViewById(R.id.BPValue);

        searchButton.setOnClickListener(view -> {
            eNo = Integer.parseInt(eNoString.getText().toString());
            switch(eNo) {
                    case 1:
                        eSym = "H"; eName = "Hydrogen";
                        eMass = 1.00797;
                        eType = "Nonmetal";
                        eG = "1";
                        eP = "1";
                        eMelt = "-259.14";
                        eBoil = "-252.87";
                        break;
                    case 2:
                        eSym = "He";
                        eName = "Helium";
                        eMass = 4.0026;
                        eType = "Noble Gas";
                        eG = "18";
                        eP = "1";
                        eMelt = "-272.20";
                        eBoil = "-268.634";
                        break;
                    case 3:
                        eSym = "Li";
                        eName = "Lithium";
                        eMass = 6.941;
                        eType = "Alkali Metal";
                        eG = "1";
                        eP = "2";
                        eMelt = "180.54";
                        eBoil = "1347";
                        break;
                    case 4:
                        eSym = "Be";
                        eName = "Beryllium";
                        eMass = 9.0122;
                        eType = "Alkaline Earth Metal";
                        eG = "2";
                        eP = "2";
                        eMelt = "1278";
                        eBoil = "1347";
                        break;
                    case 5:
                        eSym = "B";
                        eName = "Boron";
                        eMass = 10.811;
                        eType = "Metalloid";
                        eG = "13";
                        eP = "2";
                        eMelt = "2300";
                        eBoil = "3658";
                        break;
                    case 6:
                        eSym = "C";
                        eName = "Carbon";
                        eMass = 12.0107;
                        eType = "Nonmetal";
                        eG = "14";
                        eP = "2";
                        eMelt = "3527";
                        eBoil = "4827";
                        break;
                    case 7:
                        eSym = "N";
                        eName = "Nitrogen";
                        eMass = 14.0067;
                        eType = "Nonmetal";
                        eG = "15";
                        eP = "2";
                        eMelt = "-209.86";
                        eBoil = "-195.8";
                        break;
                    case 8:
                        eSym = "O";
                        eName = "Oxygen";
                        eMass = 15.9994;
                        eType = "Nonmetal";
                        eG = "15";
                        eP = "2";
                        eMelt = "-218.4";
                        eBoil = "-182.96";
                        break;
                    case 9:
                        eSym = "F";
                        eName = "Fluorine";
                        eMass = 18.9984;
                        eType = "Halogen";
                        eG = "17";
                        eP = "2";
                        eMelt = "-219.62";
                        eBoil = "-188.14";
                        break;
                    case 10:
                        eSym = "Ne";
                        eName = "Neon";
                        eMass = 20.1797;
                        eType = "Noble Gas";
                        eG = "18";
                        eP = "2";
                        eMelt = "-248.67";
                        eBoil = "-246.05";
                        break;
                    case 11:
                        eSym = "Na";
                        eName = "Sodium";
                        eMass = 22.9897;
                        eType = "Alkali Metal";
                        eG = "1";
                        eP = "3";
                        eMelt = "97.81";
                        eBoil = "882.9";
                        break;
                    case 12:
                        eSym = "Mg";
                        eName = "Magnesium";
                        eMass = 24.305;
                        eType = "Alkaline Earth Metal";
                        eG = "2";
                        eP = "3";
                        eMelt = "648.8";
                        eBoil = "1090";
                        break;
                    case 13:
                        eSym = "Al";
                        eName = "Aluminum";
                        eMass = 26.9815;
                        eType = "Post-Transition Metal";
                        eG = "13";
                        eP = "3";
                        eMelt = "660.37";
                        eBoil = "2467";
                        break;
                    case 14:
                        eSym = "Si";
                        eName = "Silicon";
                        eMass = 28.0855;
                        eType = "Metalloid";
                        eG = "14";
                        eP = "3";
                        eMelt = "1687";
                        eBoil = "3538";
                        break;
                    case 15:
                        eSym = "P";
                        eName = "Phosphorus";
                        eMass = 30.9738;
                        eType = "Nonmetal";
                        eG = "15";
                        eP = "3";
                        eMelt = "44.1";
                        eBoil = "280";
                        break;
                    case 16:
                        eSym = "S";
                        eName = "Sulfur";
                        eMass = 32.065;
                        eType = "Nonmetal";
                        eG = "16";
                        eP = "3";
                        eMelt = "113";
                        eBoil = "444.67";
                        break;
                    case 17:
                        eSym = "Cl";
                        eName = "Chlorine";
                        eMass = 35.453;
                        eType = "Halogen";
                        eG = "17";
                        eP = "3";
                        eMelt = "-100.98";
                        eBoil = "-33.97";
                        break;
                    case 18:
                        eSym = "Ar";
                        eName = "Argon";
                        eMass = 39.948;
                        eType = "Noble Gas";
                        eG = "18";
                        eP = "3";
                        eMelt = "-189.37";
                        eBoil = "-185.86";
                        break;
                    case 19:
                        eSym = "K";
                        eName = "Potassium";
                        eMass = 39.0983;
                        eType = "Alkali Metal";
                        eG = "1";
                        eP = "4";
                        eMelt = "63.65";
                        eBoil = "774";
                        break;
                    case 20:
                        eSym = "Ca";
                        eName = "Calcium";
                        eMass = 40.078;
                        eType = "Alkaline Earth Metal";
                        eG = "2";
                        eP = "4";
                        eMelt = "839";
                        eBoil = "1484";
                        break;
                    case 21:
                        eSym = "Sc";
                        eName = "Scandium";
                        eMass = 44.9559;
                        eType = "Transition Metal";
                        eG = "3";
                        eP = "4";
                        eMelt = "1541";
                        eBoil = "2831";
                        break;
                    case 22:
                        eSym = "Ti";
                        eName = "Titanium";
                        eMass = 47.867;
                        eType = "Transition Metal";
                        eG = "4";
                        eP = "4";
                        eMelt = "1660";
                        eBoil = "3287";
                        break;
                    case 23:
                        eSym = "V";
                        eName = "Vanadium";
                        eMass = 50.9415;
                        eType = "Transition Metal";
                        eG = "5";
                        eP = "4";
                        eMelt = "1887";
                        eBoil = "3377";
                        break;
                    case 24:
                        eSym = "Cr";
                        eName = "Chromium";
                        eMass = 51.9559;
                        eType = "Transition Metal";
                        eG = "6";
                        eP = "4";
                        eMelt = "1857";
                        eBoil = "2672";
                        break;
                    case 25:
                        eSym = "Mn";
                        eName = "Manganese";
                        eMass = 54.938;
                        eType = "Transition Metal";
                        eG = "7";
                        eP = "4";
                        eMelt = "1244";
                        eBoil = "1962";
                        break;
                    case 26:
                        eSym = "Fe";
                        eName = "Iron";
                        eMass = 55.845;
                        eType = "Transition Metal";
                        eG = "8";
                        eP = "4";
                        eMelt = "1535";
                        eBoil = "2750";
                        break;
                    case 27:
                        eSym = "Co";
                        eName = "Cobalt";
                        eMass = 58.9332;
                        eType = "Transition Metal";
                        eG = "9";
                        eP = "4";
                        eMelt = "1495";
                        eBoil = "2870";
                        break;
                    case 28:
                        eSym = "Ni";
                        eName = "Nickel";
                        eMass = 58.6934;
                        eType = "Transition Metal";
                        eG = "10";
                        eP = "4";
                        eMelt = "1453";
                        eBoil = "2732";
                        break;
                    case 29:
                        eSym = "Cu";
                        eName = "Copper";
                        eMass = 63.546;
                        eType = "Transition Metal";
                        eG = "11";
                        eP = "4";
                        eMelt = "1083.4";
                        eBoil = "2567";
                        break;
                    case 30:
                        eSym = "Zn";
                        eName = "Zinc";
                        eMass = 65.39;
                        eType = "Transition Metal";
                        eG = "12";
                        eP = "4";
                        eMelt = "419.58";
                        eBoil = "907";
                        break;
                    case 31:
                        eSym = "Ga";
                        eName = "Gallium";
                        eMass = 69.723;
                        eType = "Post-Transition Metal";
                        eG = "13";
                        eP = "4";
                        eMelt = "29.78";
                        eBoil = "2403";
                        break;
                    case 32:
                        eSym = "Ge";
                        eName = "Germanium";
                        eMass = 72.64;
                        eType = "Metalloid";
                        eG = "14";
                        eP = "4";
                        eMelt = "937.4";
                        eBoil = "2830";
                        break;
                    case 33:
                        eSym = "As";
                        eName = "Arsenic";
                        eMass = 74.9216;
                        eType = "Metalloid";
                        eG = "15";
                        eP = "4";
                        eMelt = "817";
                        eBoil = "616";
                        break;
                    case 34:
                        eSym = "Se";
                        eName = "Selenium";
                        eMass = 78.96;
                        eType = "Nonmetal";
                        eG = "16";
                        eP = "4";
                        eMelt = "217";
                        eBoil = "684.9";
                        break;
                    case 35:
                        eSym = "Br";
                        eName = "Bromine";
                        eMass = 79.904;
                        eType = "Halogen";
                        eG = "17";
                        eP = "4";
                        eMelt = "-7.3";
                        eBoil = "58.78";
                        break;
                    case 36:
                        eSym = "Kr";
                        eName = "Krypton";
                        eMass = 83.8;
                        eType = "Noble Gas";
                        eG = "18";
                        eP = "4";
                        eMelt = "-156.6";
                        eBoil = "-152.30";
                        break;
                    case 37:
                        eSym = "Rb";
                        eName = "Rubidium";
                        eMass = 85.4678;
                        eType = "Alkali Metal";
                        eG = "1";
                        eP = "5";
                        eMelt = "39.0";
                        eBoil = "688";
                        break;
                    case 38:
                        eSym = "Sr";
                        eName = "Strontium";
                        eMass = 87.62;
                        eType = "Alkaline Earth Metal";
                        eG = "2";
                        eP = "5";
                        eMelt = "769";
                        eBoil = "1384";
                        break;
                    case 39:
                        eSym = "Y";
                        eName = "Yttrium";
                        eMass = 88.9059;
                        eType = "Transition Metal";
                        eG = "3";
                        eP = "5";
                        eMelt = "1522";
                        eBoil = "3338";
                        break;
                    case 40:
                        eSym = "Zr";
                        eName = "Zirconium";
                        eMass = 91.224;
                        eType = "Transition Metal";
                        eG = "4";
                        eP = "5";
                        eMelt = "1852";
                        eBoil = "4377";
                        break;
                    case 41:
                        eSym = "Nb";
                        eName = "Niobium";
                        eMass = 92.964;
                        eType = "Transition Metal";
                        eG = "5";
                        eP = "5";
                        eMelt = "2468";
                        eBoil = "4742";
                        break;
                    case 42:
                        eSym = "Mo";
                        eName = "Molybdenum";
                        eMass = 95.94;
                        eType = "Transition Metal";
                        eG = "6";
                        eP = "5";
                        eMelt = "2617";
                        eBoil = "4612";
                        break;
                    case 43:
                        eSym = "Tc";
                        eName = "Technetium";
                        eMass = 98;
                        eType = "Transition Metal";
                        eG = "7";
                        eP = "5";
                        eMelt = "2172";
                        eBoil = "4877";
                        break;
                    case 44:
                        eSym = "Ru";
                        eName = "Ruthenium";
                        eMass = 101.07;
                        eType = "Transition Metal";
                        eG = "8";
                        eP = "5";
                        eMelt = "2310";
                        eBoil = "3900";
                        break;
                    case 45:
                        eSym = "Rh";
                        eName = "Rhodium";
                        eMass = 12.9055;
                        eType = "Transition Metal";
                        eG = "9";
                        eP = "5";
                        eMelt = "1966";
                        eBoil = "3727";
                        break;
                    case 46:
                        eSym = "Pd";
                        eName = "Palladium";
                        eMass = 106.42;
                        eType = "Transition Metal";
                        eG = "10";
                        eP = "5";
                        eMelt = "1552";
                        eBoil = "3140";
                        break;
                    case 47:
                        eSym = "Ag";
                        eName = "Silver";
                        eMass = 107.8682;
                        eType = "Transition Metal";
                        eG = "11";
                        eP = "5";
                        eMelt = "961.93";
                        eBoil = "2212";
                        break;
                    case 48:
                        eSym = "Cd";
                        eName = "Cadmium";
                        eMass = 112.411;
                        eType = "Transition Metal";
                        eG = "12";
                        eP = "5";
                        eMelt = "320.9";
                        eBoil = "765";
                        break;
                    case 49:
                        eSym = "In";
                        eName = "Indium";
                        eMass = 114.818;
                        eType = "Post-Transition Metal";
                        eG = "13";
                        eP = "5";
                        eMelt = "156.17";
                        eBoil = "2080";
                        break;
                    case 50:
                        eSym = "Sn";
                        eName = "Tin";
                        eMass = 118.71;
                        eType = "Post-Transition Metal";
                        eG = "14";
                        eP = "5";
                        eMelt = "231.97";
                        eBoil = "2270";
                        break;
                    case 51:
                        eSym = "Sb";
                        eName = "Antimony";
                        eMass = 121.76;
                        eType = "Metalloid";
                        eG = "15";
                        eP = "5";
                        eMelt = "630.74";
                        eBoil = "1635";
                        break;
                    case 52:
                        eSym = "Te";
                        eName = "Tellurium";
                        eMass = 127.6;
                        eType = "Metalloid";
                        eG = "16";
                        eP = "5";
                        eMelt = "449.5";
                        eBoil = "989.8";
                        break;
                    case 53:
                        eSym = "I";
                        eName = "Iodine";
                        eMass = 126.9045;
                        eType = "Halogen";
                        eG = "17";
                        eP = "5";
                        eMelt = "113.5";
                        eBoil = "184.35";
                        break;
                    case 54:
                        eSym = "Xe";
                        eName = "Xenon";
                        eMass = 131.293;
                        eType = "Noble Gas";
                        eG = "18";
                        eP = "5";
                        eMelt = "-111.9";
                        eBoil = "-107.1";
                        break;
                    case 55:
                        eSym = "Cs";
                        eName = "Cesium";
                        eMass = 132.9055;
                        eType = "Alkali Metal";
                        eG = "1";
                        eP = "6";
                        eMelt = "28.40";
                        eBoil = "678.4";
                        break;
                    case 56:
                        eSym = "Ba";
                        eName = "Barium";
                        eMass = 137.327;
                        eType = "Alkaline Earth Metal";
                        eG = "2";
                        eP = "6";
                        eMelt = "729";
                        eBoil = "1637";
                        break;
                    case 57:
                        eSym = "La";
                        eName = "Lanthanum";
                        eMass = 138.9055;
                        eType = "Lanthanide";
                        eG = "n/a";
                        eP = "6";
                        eMelt = "921";
                        eBoil = "3457";
                        break;
                    case 58:
                        eSym = "Ce";
                        eName = "Cerium";
                        eMass = 140.9077;
                        eType = "Lanthanide";
                        eG = "n/a";
                        eP = "6";
                        eMelt = "799";
                        eBoil = "3426";
                        break;
                    case 59:
                        eSym = "Pr";
                        eName = "Praseodymium";
                        eMass = 140.9077;
                        eType = "Lanthanide";
                        eG = "n/a";
                        eP = "6";
                        eMelt = "931";
                        eBoil = "3512";
                        break;
                    case 60:
                        eSym = "Nd";
                        eName = "Neodymium";
                        eMass = 144.24;
                        eType = "Lanthanide";
                        eG = "n/a";
                        eP = "6";
                        eMelt = "1021";
                        eBoil = "3058";
                        break;
                    case 61:
                        eSym = "Pm";
                        eName = "Promethium";
                        eMass = 145;
                        eType = "Lanthanide";
                        eG = "n/a";
                        eP = "6";
                        eMelt = "1168";
                        eBoil = "2727";
                        break;
                    case 62:
                        eSym = "Sm";
                        eName = "Samarium";
                        eMass = 150.36;
                        eType = "Lanthanide";
                        eG = "n/a";
                        eP = "6";
                        eMelt = "1077";
                        eBoil = "1791";
                        break;
                    case 63:
                        eSym = "Eu";
                        eName = "Europium";
                        eMass = 151.964;
                        eType = "Lanthanide";
                        eG = "n/a";
                        eP = "6";
                        eMelt = "822";
                        eBoil = "1597";
                        break;
                    case 64:
                        eSym = "Gd";
                        eName = "Gadolinium";
                        eMass = 157.25;
                        eType = "Lanthanide";
                        eG = "n/a";
                        eP = "6";
                        eMelt = "1313";
                        eBoil = "3266";
                        break;
                    case 65:
                        eSym = "Tb";
                        eName = "Gadolinium";
                        eMass = 157.25;
                        eType = "Lanthanide";
                        eG = "n/a";
                        eP = "6";
                        eMelt = "1356";
                        eBoil = "3123";
                        break;
                    case 66:
                        eSym = "Dy";
                        eName = "Dysprosium";
                        eMass = 162.5;
                        eType = "Lanthanide";
                        eG = "n/a";
                        eP = "6";
                        eMelt = "1412";
                        eBoil = "2562";
                        break;
                    case 67:
                        eSym = "Ho";
                        eName = "Holmium";
                        eMass = 164.9303;
                        eType = "Lanthanide";
                        eG = "n/a";
                        eP = "6";
                        eMelt = "1474";
                        eBoil = "2695";
                        break;
                    case 68:
                        eSym = "Er";
                        eName = "Erbium";
                        eMass = 167.259;
                        eType = "Lanthanide";
                        eG = "n/a";
                        eP = "6";
                        eMelt = "1529";
                        eBoil = "1947";
                        break;
                    case 69:
                        eSym = "Tm";
                        eName = "Thulium";
                        eMass = 168.9342;
                        eType = "Lanthanide";
                        eG = "n/a";
                        eP = "6";
                        eMelt = "1545";
                        eBoil = "1947";
                        break;
                    case 70:
                        eSym = "Yb";
                        eName = "Ytterbium";
                        eMass = 173.04;
                        eType = "Lanthanide";
                        eG = "n/a";
                        eP = "6";
                        eMelt = "824";
                        eBoil = "1193";
                        break;
                    case 71:
                        eSym = "Lu";
                        eName = "Lutetium";
                        eMass = 174.967;
                        eType = "Lanthanide";
                        eG = "3";
                        eP = "6";
                        eMelt = "1663";
                        eBoil = "3395";
                        break;
                    case 72:
                        eSym = "Hf";
                        eName = "Hafnium";
                        eMass = 178.49;
                        eType = "Transition Metal";
                        eG = "4";
                        eP = "6";
                        eMelt = "2230";
                        eBoil = "5197";
                        break;
                    case 73:
                        eSym = "Ta";
                        eName = "Tantalum";
                        eMass = 180.9479;
                        eType = "Transition Metal";
                        eG = "5";
                        eP = "6";
                        eMelt = "2230";
                        eBoil = "5197";
                        break;
                    case 74:
                        eSym = "W";
                        eName = "Tungsten";
                        eMass = 183.84;
                        eType = "Transition Metal";
                        eG = "6";
                        eP = "6";
                        eMelt = "3407";
                        eBoil = "5657";
                        break;
                    case 75:
                        eSym = "Re";
                        eName = "Rhenium";
                        eMass = 186.207;
                        eType = "Transition Metal";
                        eG = "7";
                        eP = "6";
                        eMelt = "3180";
                        eBoil = "5627";
                        break;
                    case 76:
                        eSym = "Os";
                        eName = "Osmium";
                        eMass = 190.23;
                        eType = "Transition Metal";
                        eG = "8";
                        eP = "6";
                        eMelt = "3054";
                        eBoil = "5027";
                        break;
                    case 77:
                        eSym = "Ir";
                        eName = "Iridium";
                        eMass = 196.9665;
                        eType = "Transition Metal";
                        eG = "9";
                        eP = "6";
                        eMelt = "2410";
                        eBoil = "4130";
                        break;
                    case 78:
                        eSym = "Pt";
                        eName = "Platinum";
                        eMass = 192.217;
                        eType = "Transition Metal";
                        eG = "10";
                        eP = "6";
                        eMelt = "1772";
                        eBoil = "3827";
                        break;
                    case 79:
                        eSym = "Au";
                        eName = "Gold";
                        eMass = 195.078;
                        eType = "Transition Metal";
                        eG = "11";
                        eP = "6";
                        eMelt = "1064.43";
                        eBoil = "2807";
                        break;
                    case 80:
                        eSym = "Hg";
                        eName = "Mercury";
                        eMass = 200.59;
                        eType = "Transition Metal";
                        eG = "12";
                        eP = "6";
                        eMelt = "-38.87";
                        eBoil = "356.58";
                        break;
                    case 81:
                        eSym = "Tl";
                        eName = "Thallium";
                        eMass = 207.3833;
                        eType = "Post-Transition Metal";
                        eG = "13";
                        eP = "6";
                        eMelt = "303.5";
                        eBoil = "1457";
                        break;
                    case 82:
                        eSym = "Pb";
                        eName = "Lead";
                        eType = "Post-Transition Metal";
                        eMass = 207.2;
                        eG = "15";
                        eP = "6";
                        eMelt = "327.50";
                        eBoil = "1740";
                        break;
                    case 83:
                        eSym = "Bi";
                        eName = "Bismuth";
                        eMass = 208.9804;
                        eType = "Post-Transition Metal";
                        eG = "15";
                        eP = "6";
                        eMelt = "271.3";
                        eBoil = "1610";
                        break;
                    case 84:
                        eSym = "Po";
                        eName = "Polonium";
                        eMass = 209;
                        eType = "Metalloid";
                        eG = "16";
                        eP = "6";
                        eMelt = "254";
                        eBoil = "1610";
                        break;
                    case 85:
                        eSym = "At";
                        eName = "Astatine";
                        eMass = 210;
                        eType = "Halogen";
                        eG = "17";
                        eP = "6";
                        eMelt = "302";
                        eBoil = "337";
                        break;
                    case 86:
                        eSym = "Rn";
                        eName = "Radon";
                        eMass = 222;
                        eType = "Noble Gas";
                        eG = "18";
                        eP = "6";
                        eMelt = "-71";
                        eBoil = "-61.8";
                        break;
                    case 87:
                        eSym = "Fr";
                        eName = "Francium";
                        eMass = 223;
                        eType = "Alkali Metal";
                        eG = "1";
                        eP = "7";
                        eMelt = "27";
                        eBoil = "677";
                        break;
                    case 88:
                        eSym = "Ra";
                        eName = "Radium";
                        eMass = 226;
                        eType = "Alkaline Earth Metal";
                        eG = "2";
                        eP = "7";
                        eMelt = "700";
                        eBoil = "1140";
                        break;
                    case 89:
                        eSym = "Ac";
                        eName = "Actinium";
                        eMass = 227;
                        eType = "Actinide";
                        eG = "n/a";
                        eP = "7";
                        eMelt = "1047";
                        eBoil = "3197";
                        break;
                    case 90:
                        eSym = "Th";
                        eName = "Thorium";
                        eMass = 232.0381;
                        eType = "Actinide";
                        eG = "n/a";
                        eP = "7";
                        eMelt = "1750";
                        eBoil = "4787";
                        break;
                    case 91:
                        eSym = "Pa";
                        eName = "Protactinium";
                        eMass = 231.0359;
                        eType = "Actinide";
                        eG = "n/a";
                        eP = "7";
                        eMelt = "1840";
                        eBoil = "4027";
                        break;
                    case 92:
                        eSym = "U";
                        eName = "Uranium";
                        eMass = 238.0289;
                        eType = "Actinide";
                        eG = "n/a";
                        eP = "7";
                        eMelt = "1132.3";
                        eBoil = "3745";
                        break;
                    case 93:
                        eSym = "Np";
                        eName = "Neptunium";
                        eMass = 237;
                        eType = "Actinide";
                        eG = "n/a";
                        eP = "7";
                        eMelt = "640";
                        eBoil = "3902";
                        break;
                    case 94:
                        eSym = "Pu";
                        eName = "Plutonium";
                        eMass = 244;
                        eType = "Actinide";
                        eG = "n/a";
                        eP = "7";
                        eMelt = "641";
                        eBoil = "3232";
                        break;
                    case 95:
                        eSym = "Am";
                        eName = "Americium";
                        eMass = 243;
                        eType = "Actinide";
                        eG = "n/a";
                        eP = "7";
                        eMelt = "1172";
                        eBoil = "2607";
                        break;
                    case 96:
                        eSym = "Cm";
                        eName = "Curium";
                        eMass = 247;
                        eType = "Actinide";
                        eG = "n/a";
                        eP = "7";
                        eMelt = "1337";
                        eBoil = "n/a";
                        break;
                    case 97:
                        eSym = "Bk";
                        eName = "Berkelium";
                        eMass = 247;
                        eType = "Actinide";
                        eG = "n/a";
                        eP = "7";
                        eMelt = "1047";
                        eBoil = "n/a";
                        break;
                    case 98:
                        eSym = "Cf";
                        eName = "Californium";
                        eMass = 251;
                        eType = "Actinide";
                        eG = "n/a";
                        eP = "7";
                        eMelt = "897";
                        eBoil = "n/a";
                        break;
                    case 99:
                        eSym = "Es";
                        eName = "Einsteinium";
                        eMass = 252;
                        eType = "Actinide";
                        eG = "n/a";
                        eP = "7";
                        eMelt = "857";
                        eBoil = "n/a";
                        break;
                    case 100:
                        eSym = "Fm";
                        eName = "Fermium";
                        eMass = 257;
                        eType = "Actinide";
                        eG = "n/a";
                        eP = "7";
                        eMelt = "n/a";
                        eBoil = "n/a";
                        break;
                    case 101:
                        eSym = "Md";
                        eName = "Mendelevium";
                        eMass = 258;
                        eType = "Actinide";
                        eG = "n/a";
                        eP = "7";
                        eMelt = "n/a";
                        eBoil = "n/a";
                        break;
                    case 102:
                        eSym = "No";
                        eName = "Nobelium";
                        eMass = 259;
                        eType = "Actinide";
                        eG = "n/a";
                        eP = "7";
                        eMelt = "n/a";
                        eBoil = "n/a";
                        break;
                    case 103:
                        eSym = "Lr";
                        eName = "Lawrencium";
                        eMass = 262;
                        eType = "Actinide";
                        eG = "3";
                        eP = "7";
                        eMelt = "n/a";
                        eBoil = "n/a";
                        break;
                    case 104:
                        eSym = "Rf";
                        eName = "Rutherfordium";
                        eMass = 261;
                        eType = "Transition Metal";
                        eG = "4";
                        eP = "7";
                        eMelt = "n/a";
                        eBoil = "n/a";
                        break;
                    case 105:
                        eSym = "Db";
                        eName = "Dubnium";
                        eMass = 262;
                        eType = "Transition Metal";
                        eG = "5";
                        eP = "7";
                        eMelt = "n/a";
                        eBoil = "n/a";
                        break;
                    case 106:
                        eSym = "Sg";
                        eName = "Seaborgium";
                        eMass = 266;
                        eType = "Transition Metal";
                        eG = "6";
                        eP = "7";
                        eMelt = "n/a";
                        eBoil = "n/a";
                        break;
                    case 107:
                        eSym = "Bh";
                        eName = "Bohrium";
                        eMass = 264;
                        eType = "Transition Metal";
                        eG = "7";
                        eP = "7";
                        eMelt = "n/a";
                        eBoil = "n/a";
                        break;
                    case 108:
                        eSym = "Hs";
                        eName = "Hassium";
                        eMass = 277;
                        eType = "Transition Metal";
                        eG = "8";
                        eP = "7";
                        eMelt = "n/a";
                        eBoil = "n/a";
                        break;
                    case 109:
                        eSym = "Mt";
                        eName = "Meitnerium";
                        eMass = 268;
                        eType = "Transition Metal";
                        eG = "9";
                        eP = "7";
                        eMelt = "n/a";
                        eBoil = "n/a";
                        break;
                    case 110:
                        eSym = "Ds";
                        eName = "Darmstadtium";
                        eMass = 261.9;
                        eType = "Transition Metal";
                        eG = "10";
                        eP = "7";
                        eMelt = "n/a";
                        eBoil = "n/a";
                        break;
                    case 111:
                        eSym = "Rg";
                        eName = "Roentgenium";
                        eMass = 271.8;
                        eType = "Transition Metal";
                        eG = "11";
                        eP = "7";
                        eMelt = "n/a";
                        eBoil = "n/a";
                        break;
                    case 112:
                        eSym = "Cn";
                        eName = "Copernicium";
                        eMass = 285;
                        eType = "Transition Metal";
                        eG = "12";
                        eP = "7";
                        eMelt = "n/a";
                        eBoil = "n/a";
                        break;
                    case 113:
                        eSym = "Nh";
                        eName = "Nihonium";
                        eMass = 286;
                        eType = "Post-Transition Metal";
                        eG = "13";
                        eP = "7";
                        eMelt = "n/a";
                        eBoil = "n/a";
                        break;
                    case 114:
                        eSym = "Fl";
                        eName = "Flerovium";
                        eMass = 289;
                        eType = "Post-Transition Metal";
                        eG = "14";
                        eP = "7";
                        eMelt = "n/a";
                        eBoil = "n/a";
                        break;
                    case 115:
                        eSym = "Mc";
                        eName = "Moscovium";
                        eMass = 288;
                        eType = "Post-Transition Metal";
                        eG = "15";
                        eP = "7";
                        eMelt = "n/a";
                        eBoil = "n/a";
                        break;
                    case 116:
                        eSym = "Lv";
                        eName = "Livermorium";
                        eMass = 293;
                        eType = "Post-Transition Metal";
                        eG = "16";
                        eP = "7";
                        eMelt = "n/a";
                        eBoil = "n/a";
                        break;
                    case 117:
                        eSym = "Ts";
                        eName = "Tennessine";
                        eMass = 260.9;
                        eType = "Halogen";
                        eG = "17";
                        eP = "7";
                        eMelt = "n/a";
                        eBoil = "n/a";
                        break;
                    case 118:
                        eSym = "Og";
                        eName = "Oganesson";
                        eMass = 294;
                        eType = "Noble Gas";
                        eG = "18";
                        eP = "7";
                        eMelt = "n/a";
                        eBoil = "n/a";
                        break;
                    default:
                        eSym = "-";
                        eName = "None";
                        eMass = 0;
                        eType = "None";
                        eG = "0";
                        eP = "0";
                        eMelt = "None";
                        eBoil = "None";
                        break;
                }
            outESymbol.setText(eSym);
            outEName.setText(eName);
            outEType.setText(eType);
            outEMass.setText(String.valueOf(eMass));
            outEG.setText(eG);
            outEP.setText(eP);
            outEMP.setText(eMelt);
            outEBP.setText(eBoil);

            Toast.makeText(CalCal5.this, "Finding Success", Toast.LENGTH_SHORT).show();
        });

        button.setOnClickListener(view -> {
            Intent p = new Intent(CalCal5.this, MainActivity.class);
            startActivity(p);
        });

        SymPage.setOnClickListener(view -> {
            Intent p = new Intent(CalCal5.this, CalCal4.class);
            startActivity(p);
        });
    }
}
