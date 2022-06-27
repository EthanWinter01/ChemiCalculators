package com.example.chemicalculators;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CalCal4 extends AppCompatActivity {
    int eNo;
    double eMass;
    String eG, eP, eSym, eName, eType, eMelt, eBoil;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_cal4);
        final EditText eSymString = (EditText) findViewById(R.id.elementSymbol);
        ImageButton searchButton = (ImageButton) findViewById(R.id.imageButton);
        Button button = (Button) findViewById(R.id.button8);
        Button AtomNumPage = (Button) findViewById(R.id.ToOtherPage);
        final TextView outENum = (TextView) findViewById(R.id.infoAN);
        final TextView outEName = (TextView) findViewById(R.id.elementName);
        final TextView outEMass = (TextView) findViewById(R.id.AtomicMassValue);
        final TextView outEType = (TextView) findViewById(R.id.elementType);
        final TextView outEG = (TextView) findViewById(R.id.elementGroup);
        final TextView outEP = (TextView) findViewById(R.id.elementPeriod);
        final TextView outEMP = (TextView) findViewById(R.id.MPValue);
        final TextView outEBP = (TextView) findViewById(R.id.BPValue);

        searchButton.setOnClickListener(view -> {
            eSym = eSymString.getText().toString();
            switch(eSym) {
                case "H":
                    eNo = 1;    eName = "Hydrogen"; eMass = 1.00797;    eType = "Nonmetal";
                    eG = "1";   eP = "1";           eMelt = "-259.14";  eBoil = "-252.87";
                    break;
                case "He":
                    eNo = 2;    eName = "Helium";   eMass = 4.0026;     eType = "Noble Gas";
                    eG = "18";  eP = "1";           eMelt = "-272.20";  eBoil = "-268.634";
                    break;
                case "Li":
                    eNo = 3;    eName = "Lithium";  eMass = 6.941;      eType = "Alkali Metal";
                    eG = "1";   eP = "2";           eMelt = "180.54";   eBoil = "1347";
                    break;
                case "Be":
                    eNo = 4;    eName = "Beryllium";eMass = 9.0122;     eType = "Alkaline Earth Metal";
                    eG = "2";   eP = "2";           eMelt = "1278";     eBoil = "1347";
                    break;
                case "B":
                    eNo = 5;    eName = "Boron";    eMass = 10.811;     eType = "Metalloid";
                    eG = "13";  eP = "2";           eMelt = "2300";     eBoil = "3658";
                    break;
                case "C":
                    eNo = 6;    eName = "Carbon";   eMass = 12.0107;    eType = "Nonmetal";
                    eG = "14";  eP = "2";           eMelt = "3527";     eBoil = "4827";
                    break;
                case "N":
                    eNo = 7;    eName = "Nitrogen"; eMass = 14.0067;    eType = "Nonmetal";
                    eG = "15";  eP = "2";           eMelt = "-209.86";  eBoil = "-195.8";
                    break;
                case "O":
                    eNo = 8;    eName = "Oxygen";   eMass = 15.9994;    eType = "Nonmetal";
                    eG = "15";  eP = "2";           eMelt = "-218.4";   eBoil = "-182.96";
                    break;
                case "F":
                    eNo = 9;    eName = "Fluorine"; eMass = 18.9984;    eType = "Halogen";
                    eG = "17";  eP = "2";           eMelt = "-219.62";  eBoil = "-188.14";
                    break;
                case "Ne":
                    eNo = 10;   eName = "Neon";     eMass = 20.1797;    eType = "Noble Gas";
                    eG = "18";  eP = "2";           eMelt = "-248.67";  eBoil = "-246.05";
                    break;
                case "Na":
                    eNo = 11;   eName = "Sodium";   eMass = 22.9897;    eType = "Alkali Metal";
                    eG = "1";   eP = "3";           eMelt = "97.81";    eBoil = "882.9";
                    break;
                case "Mg":
                    eNo = 11;   eName = "Magnesium";eMass = 24.305;     eType = "Alkaline Earth Metal";
                    eG = "2";   eP = "3";           eMelt = "648.8";    eBoil = "1090";
                    break;
                case "Al":
                    eNo = 13;   eName = "Aluminum"; eMass = 26.9815;    eType = "Post-Transition Metal";
                    eG = "13";  eP = "3";           eMelt = "660.37";   eBoil = "2467";
                    break;
                case "Si":
                    eNo = 14;   eName = "Silicon";  eMass = 28.0855;    eType = "Metalloid";
                    eG = "14";  eP = "3";           eMelt = "1687";     eBoil = "3538";
                    break;
                case "P":
                    eNo = 15;   eName = "Phosphorus";eMass = 30.9738;    eType = "Nonmetal";
                    eG = "15";  eP = "3";           eMelt = "44.1";     eBoil = "280";
                    break;
                case "S":
                    eNo = 16;   eName = "Sulfur";   eMass = 32.065;     eType = "Nonmetal";
                    eG = "16";  eP = "3";           eMelt = "113";      eBoil = "444.67";
                    break;
                case "Cl":
                    eNo = 17;   eName = "Chlorine"; eMass = 35.453;     eType = "Halogen";
                    eG = "17";  eP = "3";           eMelt = "-100.98";  eBoil = "-33.97";
                    break;
                case "Ar":
                    eNo = 18;   eName = "Argon";    eMass = 39.948;     eType = "Noble Gas";
                    eG = "18";  eP = "3";           eMelt = "-189.37";  eBoil = "-185.86";
                    break;
                case "K":
                    eNo = 19;   eName = "Potassium";eMass = 39.0983;    eType = "Alkali Metal";
                    eG = "1";   eP = "4";           eMelt = "63.65";    eBoil = "774";
                    break;
                case "Ca":
                    eNo = 20;   eName = "Calcium";  eMass = 40.078;     eType = "Alkaline Earth Metal";
                    eG = "2";   eP = "4";           eMelt = "839";      eBoil = "1484";
                    break;
                case "Sc":
                    eNo = 21;   eName = "Scandium"; eMass = 44.9559;    eType = "Transition Metal";
                    eG = "3";   eP = "4";           eMelt = "1541";     eBoil = "2831";
                    break;
                case "Ti":
                    eNo = 22;   eName = "Titanium"; eMass = 47.867;     eType = "Transition Metal";
                    eG = "4";   eP = "4";           eMelt = "1660";     eBoil = "3287";
                    break;
                case "V":
                    eNo = 23;   eName = "Vanadium"; eMass = 50.9415;    eType = "Transition Metal";
                    eG = "5";   eP = "4";           eMelt = "1887";     eBoil = "3377";
                    break;
                case "Cr":
                    eNo = 24;   eName = "Chromium"; eMass = 51.9559;    eType = "Transition Metal";
                    eG = "6";   eP = "4";           eMelt = "1857";     eBoil = "2672";
                    break;
                case "Mn":
                    eNo = 25;   eName = "Manganese";eMass = 54.938;     eType = "Transition Metal";
                    eG = "7";   eP = "4";           eMelt = "1244";     eBoil = "1962";
                    break;
                case "Fe":
                    eNo = 26;   eName = "Iron";     eMass = 55.845;     eType = "Transition Metal";
                    eG = "8";   eP = "4";           eMelt = "1535";     eBoil = "2750";
                    break;
                case "Co":
                    eNo = 27;   eName = "Cobalt";   eMass = 58.9332;    eType = "Transition Metal";
                    eG = "9";   eP = "4";           eMelt = "1495";     eBoil = "2870";
                    break;
                case "Ni":
                    eNo = 28;   eName = "Nickel";   eMass = 58.6934;    eType = "Transition Metal";
                    eG = "10";  eP = "4";           eMelt = "1453";     eBoil = "2732";
                    break;
                case "Cu":
                    eNo = 28;   eName = "Copper";   eMass = 63.546;     eType = "Transition Metal";
                    eG = "11";  eP = "4";           eMelt = "1083.4";   eBoil = "2567";
                    break;
                case "Zn":
                    eNo = 30;   eName = "Zinc";     eMass = 65.39;      eType = "Transition Metal";
                    eG = "12";  eP = "4";           eMelt = "419.58";   eBoil = "907";
                    break;
                case "Ga":
                    eNo = 31;   eName = "Gallium";  eMass = 69.723;     eType = "Post-Transition Metal";
                    eG = "13";  eP = "4"            eMelt = "29.78";    eBoil = "2403";
                    break;
                case "Ge":
                    eNo = 32;   eName = "Germanium";eMass = 72.64;      eType = "Metalloid";
                    eG = "14";  eP = "4";           eMelt = "937.4";    eBoil = "2830";
                    break;
                case "As":
                    eNo = 33;   eName = "Arsenic";  eMass = 74.9216;    eType = "Metalloid";
                    eG = "15";  eP = "4";           eMelt = "817";      eBoil = "616";
                    break;
                case "Se":
                    eNo = 34;   eName = "Selenium"; eMass = 78.96;      eType = "Nonmetal";
                    eG = "16";  eP = "4";           eMelt = "217";      eBoil = "684.9";
                    break;
                case "Br":
                    eNo = 35;   eName = "Bromine";  eMass = 79.904;     eType = "Halogen";
                    eG = "17";  eP = "4";           eMelt = "-7.3";     eBoil = "58.78";
                    break;
                case "Kr":
                    eNo = 36;
                    eName = "Krypton";
                    eMass = 83.8;
                    eType = "Noble Gas";
                    eG = "18";
                    eP = "4";
                    eMelt = "-156.6";
                    eBoil = "-152.30";
                    break;
                case "Rb":
                    eNo = 37;
                    eName = "Rubidium";
                    eMass = 85.4678;
                    eType = "Alkali Metal";
                    eG = "1";
                    eP = "5";
                    eMelt = "39.0";
                    eBoil = "688";
                    break;
                case "Sr":
                    eNo = 38;
                    eName = "Strontium";
                    eMass = 87.62;
                    eType = "Alkaline Earth Metal";
                    eG = "2";
                    eP = "5";
                    eMelt = "769";
                    eBoil = "1384";
                    break;
                case "Y":
                    eNo = 39;
                    eName = "Yttrium";
                    eMass = 88.9059;
                    eType = "Transition Metal";
                    eG = "3";
                    eP = "5";
                    eMelt = "1522";
                    eBoil = "3338";
                    break;
                case "Zr":
                    eNo = 40;
                    eName = "Zirconium";
                    eMass = 91.224;
                    eType = "Transition Metal";
                    eG = "4";
                    eP = "5";
                    eMelt = "1852";
                    eBoil = "4377";
                    break;
                case "Nb":
                    eNo = 41;
                    eName = "Niobium";
                    eMass = 92.964;
                    eType = "Transition Metal";
                    eG = "5";
                    eP = "5";
                    eMelt = "2468";
                    eBoil = "4742";
                    break;
                case "Mo":
                    eNo = 42;
                    eName = "Molybdenum";
                    eMass = 95.94;
                    eType = "Transition Metal";
                    eG = "6";
                    eP = "5";
                    eMelt = "2617";
                    eBoil = "4612";
                    break;
                case "Tc":
                    eNo = 43;
                    eName = "Technetium";
                    eMass = 98;
                    eType = "Transition Metal";
                    eG = "7";
                    eP = "5";
                    eMelt = "2172";
                    eBoil = "4877";
                    break;
                case "Ru":
                    eNo = 44;
                    eName = "Ruthenium";
                    eMass = 101.07;
                    eType = "Transition Metal";
                    eG = "8";
                    eP = "5";
                    eMelt = "2310";
                    eBoil = "3900";
                    break;
                case "Rh":
                    eNo = 45;
                    eName = "Rhodium";
                    eMass = 12.9055;
                    eType = "Transition Metal";
                    eG = "9";
                    eP = "5";
                    eMelt = "1966";
                    eBoil = "3727";
                    break;
                case "Pd":
                    eNo = 46;
                    eName = "Palladium";
                    eMass = 106.42;
                    eType = "Transition Metal";
                    eG = "10";
                    eP = "5";
                    eMelt = "1552";
                    eBoil = "3140";
                    break;
                case "Ag":
                    eNo = 47;
                    eName = "Silver";
                    eMass = 107.8682;
                    eType = "Transition Metal";
                    eG = "11";
                    eP = "5";
                    eMelt = "961.93";
                    eBoil = "2212";
                    break;
                case "Cd":
                    eNo = 48;
                    eName = "Cadmium";
                    eMass = 112.411;
                    eType = "Transition Metal";
                    eG = "12";
                    eP = "5";
                    eMelt = "320.9";
                    eBoil = "765";
                    break;
                case "In":
                    eNo = 49;
                    eName = "Indium";
                    eMass = 114.818;
                    eType = "Post-Transition Metal";
                    eG = "13";
                    eP = "5";
                    eMelt = "156.17";
                    eBoil = "2080";
                    break;
                case "Sn":
                    eNo = 50;
                    eName = "Tin";
                    eMass = 118.71;
                    eType = "Post-Transition Metal";
                    eG = "14";
                    eP = "5";
                    eMelt = "231.97";
                    eBoil = "2270";
                    break;
                case "Sb":
                    eNo = 51;
                    eName = "Antimony";
                    eMass = 121.76;
                    eType = "Metalloid";
                    eG = "15";
                    eP = "5";
                    eMelt = "630.74";
                    eBoil = "1635";
                    break;
                case "Te":
                    eNo = 52;
                    eName = "Tellurium";
                    eMass = 127.6;
                    eType = "Metalloid";
                    eG = "16";
                    eP = "5";
                    eMelt = "449.5";
                    eBoil = "989.8";
                    break;
                case "I":
                    eNo = 53;
                    eName = "Iodine";
                    eMass = 126.9045;
                    eType = "Halogen";
                    eG = "17";
                    eP = "5";
                    eMelt = "113.5";
                    eBoil = "184.35";
                    break;
                case "Xe":
                    eNo = 54;
                    eName = "Xenon";
                    eMass = 131.293;
                    eType = "Noble Gas";
                    eG = "18";
                    eP = "5";
                    eMelt = "-111.9";
                    eBoil = "-107.1";
                    break;
                case "Cs":
                    eNo = 55;
                    eName = "Cesium";
                    eMass = 132.9055;
                    eType = "Alkali Metal";
                    eG = "1";
                    eP = "6";
                    eMelt = "28.40";
                    eBoil = "678.4";
                    break;
                case "Ba":
                    eNo = 56;
                    eName = "Barium";
                    eMass = 137.327;
                    eType = "Alkaline Earth Metal";
                    eG = "2";
                    eP = "6";
                    eMelt = "729";
                    eBoil = "1637";
                    break;
                case "La":
                    eNo = 57;
                    eName = "Lanthanum";
                    eMass = 138.9055;
                    eType = "Lanthanide";
                    eG = "n/a";
                    eP = "6";
                    eMelt = "921";
                    eBoil = "3457";
                    break;
                case "Ce":
                    eNo = 58;
                    eName = "Cerium";
                    eMass = 140.9077;
                    eType = "Lanthanide";
                    eG = "n/a";
                    eP = "6";
                    eMelt = "799";
                    eBoil = "3426";
                    break;
                case "Pr":
                    eNo = 59;
                    eName = "Praseodymium";
                    eMass = 140.9077;
                    eType = "Lanthanide";
                    eG = "n/a";
                    eP = "6";
                    eMelt = "931";
                    eBoil = "3512";
                    break;
                case "Nd":
                    eNo = 60;
                    eName = "Neodymium";
                    eMass = 144.24;
                    eType = "Lanthanide";
                    eG = "n/a";
                    eP = "6";
                    eMelt = "1021";
                    eBoil = "3058";
                    break;
                case "Pm":
                    eNo = 61;
                    eMass = 145;
                    eType = "Lanthanide";
                    eG = "n/a";
                    eP = "6";
                    eMelt = "1168";
                    eBoil = "2727";
                    break;
                case "Sm":
                    eNo = 62;
                    eName = "Samarium";
                    eMass = 150.36;
                    eType = "Lanthanide";
                    eG = "n/a";
                    eP = "6";
                    eMelt = "1077";
                    eBoil = "1791";
                    break;
                case "Eu":
                    eNo = 63;
                    eName = "Europium";
                    eMass = 151.964;
                    eType = "Lanthanide";
                    eG = "n/a";
                    eP = "6";
                    eMelt = "822";
                    eBoil = "1597";
                    break;
                case "Gd":
                    eNo = 64;
                    eName = "Gadolinium";
                    eMass = 157.25;
                    eType = "Lanthanide";
                    eG = "n/a";
                    eP = "6";
                    eMelt = "1313";
                    eBoil = "3266";
                    break;
                case "Tb":
                    eNo = 65;
                    eName = "Gadolinium";
                    eMass = 157.25;
                    eType = "Lanthanide";
                    eG = "n/a";
                    eP = "6";
                    eMelt = "1356";
                    eBoil = "3123";
                    break;
                case "Dy":
                    eNo = 60;
                    eName = "Dysprosium";
                    eMass = 162.5;
                    eType = "Lanthanide";
                    eG = "n/a";
                    eP = "6";
                    eMelt = "1412";
                    eBoil = "2562";
                    break;
                case "Ho":
                    eNo = 67;
                    eName = "Holmium";
                    eMass = 164.9303;
                    eType = "Lanthanide";
                    eG = "n/a";
                    eP = "6";
                    eMelt = "1474";
                    eBoil = "2695";
                    break;
                case "Er":
                    eNo = 68;
                    eName = "Erbium";
                    eMass = 167.259;
                    eType = "Lanthanide";
                    eG = "n/a";
                    eP = "6";
                    eMelt = "1529";
                    eBoil = "1947";
                    break;
                case "Tm":
                    eNo = 69;
                    eName = "Thulium";
                    eMass = 168.9342;
                    eType = "Lanthanide";
                    eG = "n/a";
                    eP = "6";
                    eMelt = "1545";
                    eBoil = "1947";
                    break;
                case "Yb":
                    eNo = 70;
                    eName = "Ytterbium";
                    eMass = 173.04;
                    eType = "Lanthanide";
                    eG = "n/a";
                    eP = "6";
                    eMelt = "824";
                    eBoil = "1193";
                    break;
                case "Lu":
                    eNo = 71;
                    eName = "Lutetium";
                    eMass = 174.967;
                    eType = "Lanthanide";
                    eG = "3";
                    eP = "6";
                    eMelt = "1663";
                    eBoil = "3395";
                    break;
                case "Hf":
                    eNo = 72;
                    eName = "Hafnium";
                    eMass = 178.49;
                    eType = "Transition Metal";
                    eG = "4";
                    eP = "6";
                    eMelt = "2230";
                    eBoil = "5197";
                    break;
                case "Ta":
                    eNo = 73;
                    eName = "Tantalum";
                    eMass = 180.9479;
                    eType = "Transition Metal";
                    eG = "5";
                    eP = "6";
                    eMelt = "2230";
                    eBoil = "5197";
                    break;
                case "W":
                    eNo = 74;
                    eName = "Tungsten";
                    eMass = 183.84;
                    eType = "Transition Metal";
                    eG = "6";
                    eP = "6";
                    eMelt = "3407";
                    eBoil = "5657";
                    break;
                case "Re":
                    eNo = 75;
                    eName = "Rhenium";
                    eMass = 186.207;
                    eType = "Transition Metal";
                    eG = "7";
                    eP = "6";
                    eMelt = "3180";
                    eBoil = "5627";
                    break;
                case "Os":
                    eNo = 76;
                    eName = "Osmium";
                    eMass = 190.23;
                    eType = "Transition Metal";
                    eG = "8";
                    eP = "6";
                    eMelt = "3054";
                    eBoil = "5027";
                    break;
                case "Ir":
                    eNo = 77;
                    eName = "Iridium";
                    eMass = 196.9665;
                    eType = "Transition Metal";
                    eG = "9";
                    eP = "6";
                    eMelt = "2410";
                    eBoil = "4130";
                    break;
                case "Pt":
                    eNo = 78;
                    eName = "Platinum";
                    eMass = 192.217;
                    eType = "Transition Metal";
                    eG = "10";
                    eP = "6";
                    eMelt = "1772";
                    eBoil = "3827";
                    break;
                case "Au":
                    eNo = 79;
                    eName = "Gold";
                    eMass = 195.078;
                    eType = "Transition Metal";
                    eG = "11";
                    eP = "6";
                    eMelt = "1064.43";
                    eBoil = "2807";
                    break;
                case "Hg":
                    eNo = 80;
                    eName = "Mercury";
                    eMass = 200.59;
                    eType = "Transition Metal";
                    eG = "12";
                    eP = "6";
                    eMelt = "-38.87";
                    eBoil = "356.58";
                    break;
                case "Tl":
                    eNo = 81;
                    eName = "Thallium";
                    eMass = 207.3833;
                    eType = "Post-Transition Metal";
                    eG = "13";
                    eP = "6";
                    eMelt = "303.5";
                    eBoil = "1457";
                    break;
                case "Pb":
                    eNo = 82;
                    eName = "Lead";
                    eType = "Post-Transition Metal";
                    eMass = 207.2;
                    eG = "15";
                    eP = "6";
                    eMelt = "327.50";
                    eBoil = "1740";
                    break;
                case "Bi":
                    eNo = 83;
                    eName = "Bismuth";
                    eMass = 208.9804;
                    eType = "Post-Transition Metal";
                    eG = "15";
                    eP = "6";
                    eMelt = "271.3";
                    eBoil = "1610";
                    break;
                case "Po":
                    eNo = 84;
                    eName = "Polonium";
                    eMass = 209;
                    eType = "Metalloid";
                    eG = "16";
                    eP = "6";
                    eMelt = "254";
                    eBoil = "1610";
                    break;
                case "At":
                    eNo = 85;
                    eName = "Astatine";
                    eMass = 210;
                    eType = "Halogen";
                    eG = "17";
                    eP = "6";
                    eMelt = "302";
                    eBoil = "337";
                    break;
                case "Rn":
                    eNo = 86;
                    eName = "Radon";
                    eMass = 222;
                    eType = "Noble Gas";
                    eG = "18";
                    eP = "6";
                    eMelt = "-71";
                    eBoil = "-61.8";
                    break;
                case "Fr":
                    eNo = 87;
                    eName = "Francium";
                    eMass = 223;
                    eType = "Alkali Metal";
                    eG = "1";
                    eP = "7";
                    eMelt = "27";
                    eBoil = "677";
                    break;
                case "Ra":
                    eNo = 88;
                    eName = "Radium";
                    eMass = 226;
                    eType = "Alkaline Earth Metal";
                    eG = "2";
                    eP = "7";
                    eMelt = "700";
                    eBoil = "1140";
                    break;
                case "Ac":
                    eNo = 89;
                    eName = "Actinium";
                    eMass = 227;
                    eType = "Actinide";
                    eG = "n/a";
                    eP = "7";
                    eMelt = "1047";
                    eBoil = "3197";
                    break;
                case "Th":
                    eNo = 90;
                    eName = "Thorium";
                    eMass = 232.0381;
                    eType = "Actinide";
                    eG = "n/a";
                    eP = "7";
                    eMelt = "1750";
                    eBoil = "4787";
                    break;
                case "Pa":
                    eNo = 91;
                    eName = "Protactinium";
                    eMass = 231.0359;
                    eType = "Actinide";
                    eG = "n/a";
                    eP = "7";
                    eMelt = "1840";
                    eBoil = "4027";
                    break;
                case "U":
                    eNo = 92;
                    eName = "Uranium";
                    eMass = 238.0289;
                    eType = "Actinide";
                    eG = "n/a";
                    eP = "7";
                    eMelt = "1132.3";
                    eBoil = "3745";
                    break;
                case "Np":
                    eNo = 93;
                    eName = "Neptunium";
                    eMass = 237;
                    eType = "Actinide";
                    eG = "n/a";
                    eP = "7";
                    eMelt = "640";
                    eBoil = "3902";
                    break;
                case "Pu":
                    eNo = 94;
                    eName = "Plutonium";
                    eMass = 244;
                    eType = "Actinide";
                    eG = "n/a";
                    eP = "7";
                    eMelt = "641";
                    eBoil = "3232";
                    break;
                case "Am":
                    eNo = 95;
                    eName = "Americium";
                    eMass = 243;
                    eType = "Actinide";
                    eG = "n/a";
                    eP = "7";
                    eMelt = "1172";
                    eBoil = "2607";
                    break;
                case "Cm":
                    eNo = 96;
                    eName = "Curium";
                    eMass = 247;
                    eType = "Actinide";
                    eG = "n/a";
                    eP = "7";
                    eMelt = "1337";
                    eBoil = "n/a";
                    break;
                case "Bk":
                    eNo = 97;
                    eName = "Berkelium";
                    eMass = 247;
                    eType = "Actinide";
                    eG = "n/a";
                    eP = "7";
                    eMelt = "1047";
                    eBoil = "n/a";
                    break;
                case "Cf":
                    eNo = 98;
                    eName = "Californium";
                    eMass = 251;
                    eType = "Actinide";
                    eG = "n/a";
                    eP = "7";
                    eMelt = "897";
                    eBoil = "n/a";
                    break;
                case "Es":
                    eNo = 99;
                    eName = "Einsteinium";
                    eMass = 252;
                    eType = "Actinide";
                    eG = "n/a";
                    eP = "7";
                    eMelt = "857";
                    eBoil = "n/a";
                    break;
                case "Fm":
                    eNo = 100;
                    eName = "Fermium";
                    eMass = 257;
                    eType = "Actinide";
                    eG = "n/a";
                    eP = "7";
                    eMelt = "n/a";
                    eBoil = "n/a";
                    break;
                case "Md":
                    eNo = 101;
                    eName = "Mendelevium";
                    eMass = 258;
                    eType = "Actinide";
                    eG = "n/a";
                    eP = "7";
                    eMelt = "n/a";
                    eBoil = "n/a";
                    break;
                case "No":
                    eNo = 102;
                    eName = "Nobelium";
                    eMass = 259;
                    eType = "Actinide";
                    eG = "n/a";
                    eP = "7";
                    eMelt = "n/a";
                    eBoil = "n/a";
                    break;
                case "Lr":
                    eNo = 103;
                    eName = "Lawrencium";
                    eMass = 262;
                    eType = "Actinide";
                    eG = "3";
                    eP = "7";
                    eMelt = "n/a";
                    eBoil = "n/a";
                    break;
                case "Rf":
                    eNo = 104;
                    eName = "Rutherfordium";
                    eMass = 261;
                    eType = "Transition Metal";
                    eG = "4";
                    eP = "7";
                    eMelt = "n/a";
                    eBoil = "n/a";
                    break;
                case "Db":
                    eNo = 105;
                    eName = "Dubnium";
                    eMass = 262;
                    eType = "Transition Metal";
                    eG = "5";
                    eP = "7";
                    eMelt = "n/a";
                    eBoil = "n/a";
                    break;
                case "Sg":
                    eNo = 106;
                    eName = "Seaborgium";
                    eMass = 266;
                    eType = "Transition Metal";
                    eG = "6";
                    eP = "7";
                    eMelt = "n/a";
                    eBoil = "n/a";
                    break;
                case "Bh":
                    eNo = 107;
                    eName = "Bohrium";
                    eMass = 264;
                    eType = "Transition Metal";
                    eG = "7";
                    eP = "7";
                    eMelt = "n/a";
                    eBoil = "n/a";
                    break;
                case "Hs":
                    eNo = 108;
                    eName = "Hassium";
                    eMass = 277;
                    eType = "Transition Metal";
                    eG = "8";
                    eP = "7";
                    eMelt = "n/a";
                    eBoil = "n/a";
                    break;
                case "Mt":
                    eNo = 109;
                    eName = "Meitnerium";
                    eMass = 268;
                    eType = "Transition Metal";
                    eG = "9";
                    eP = "7";
                    eMelt = "n/a";
                    eBoil = "n/a";
                    break;
                case "Ds":
                    eNo = 110;
                    eName = "Darmstadtium";
                    eMass = 261.9;
                    eType = "Transition Metal";
                    eG = "10";
                    eP = "7";
                    eMelt = "n/a";
                    eBoil = "n/a";
                    break;
                case "Rg":
                    eNo = 111;
                    eName = "Roentgenium";
                    eMass = 271.8;
                    eType = "Transition Metal";
                    eG = "11";
                    eP = "7";
                    eMelt = "n/a";
                    eBoil = "n/a";
                    break;
                case "Cn":
                    eNo = 112;
                    eName = "Copernicium";
                    eMass = 285;
                    eType = "Transition Metal";
                    eG = "12";
                    eP = "7";
                    eMelt = "n/a";
                    eBoil = "n/a";
                    break;
                case "Nh":
                    eNo = 113;
                    eName = "Nihonium";
                    eMass = 286;
                    eType = "Post-Transition Metal";
                    eG = "13";
                    eP = "7";
                    eMelt = "n/a";
                    eBoil = "n/a";
                    break;
                case "Fl":
                    eNo = 114;
                    eName = "Flerovium";
                    eMass = 289;
                    eType = "Post-Transition Metal";
                    eG = "14";
                    eP = "7";
                    eMelt = "n/a";
                    eBoil = "n/a";
                    break;
                case "Mc":
                    eNo = 115;
                    eName = "Moscovium";
                    eMass = 288;
                    eType = "Post-Transition Metal";
                    eG = "15";
                    eP = "7";
                    eMelt = "n/a";
                    eBoil = "n/a";
                    break;
                case "Lv":
                    eNo = 116;
                    eName = "Livermorium";
                    eMass = 293;
                    eType = "Post-Transition Metal";
                    eG = "16";
                    eP = "7";
                    eMelt = "n/a";
                    eBoil = "n/a";
                    break;
                case "Ts":
                    eNo = 117;
                    eName = "Tennessine";
                    eMass = 260.9;
                    eType = "Halogen";
                    eG = "17";
                    eP = "7";
                    eMelt = "n/a";
                    eBoil = "n/a";
                    break;
                case "Og":
                    eNo = 118;
                    eName = "Oganesson";
                    eMass = 294;
                    eType = "Noble Gas";
                    eG = "18";
                    eP = "7";
                    eMelt = "n/a";
                    eBoil = "n/a";
                    break;
                default:
                    eNo = 0;    eName = "None"; eMass = 0;      eType = "None";
                    eG = "0";   eP = "0";       eMelt = "None"; eBoil = "None";
                    break;
            }
            outENum.setText(String.valueOf(eNo));
            outEName.setText(eName);
            outEType.setText(eType);
            outEMass.setText(String.valueOf(eMass));
            outEG.setText(eG);
            outEP.setText(eP);
            outEMP.setText(eMelt);
            outEBP.setText(eBoil);

            Toast.makeText(CalCal4.this, "Finding Success", Toast.LENGTH_SHORT).show();
        });

        button.setOnClickListener(view -> {
            Intent p = new Intent(CalCal4.this, MainActivity.class);
            startActivity(p);
        });

        AtomNumPage.setOnClickListener(view -> {
            Intent p = new Intent(CalCal4.this, CalCal5.class);
            startActivity(p);
        });
    }
}
