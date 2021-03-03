package javaassignmentsday2;

public class InheritanceLaptop {

        public final String lapName;
        public final double lapPrice;
        public final String lapProcessor;
        public final String lapRam;
        public final String lapHD;

        public InheritanceLaptop(String lName, double lPrice, String lProcessor, String lRam, String lHD) {
            this.lapName = lName;
            this.lapPrice = lPrice;
            this.lapProcessor = lProcessor;
            this.lapRam = lRam;
            this.lapHD = lHD;
        }
    }

    class LaptopsSuperKey extends InheritanceLaptop {
        public LaptopsSuperKey(String lName, double lPrice, String lProcessor, String lRam, String lHD) {
            super(lName, lPrice, lProcessor, lRam, lHD);
        }
    }

