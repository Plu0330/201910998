public class Homework5 {

    public static void main(String[] args) {

        Computer Com1 = new Computer();
        Monitor Mon1 = new Monitor();

        Com1.SetCPU("Core i7");
        Com1.SetCMemory("16GB");
        Com1.SetCHd("2TB");
        Com1.SetCColor("White");
        Com1.SetCPower("500W");

        Com1.TurnOn();


        Mon1.SetMSize("24 inch");
        Mon1.SetMColor("Black");
        Mon1.SetMPower("45W");

        Mon1.TurnOn();

        PersonalComputer PersonalComputer1 = new PersonalComputer();

        PersonalComputer1.SetMSize(Mon1.MSize);
        PersonalComputer1.SetMColor(Mon1.MColor);
        PersonalComputer1.SetMPower(Mon1.MPower);
        PersonalComputer1.SetCPU(Com1.CPU);
        PersonalComputer1.SetCMemory(Com1.CMemory);
        PersonalComputer1.SetCHd(Com1.CHd);
        PersonalComputer1.SetCColor(Com1.CColor);
        PersonalComputer1.SetCPower(Com1.CPower);

        PersonalComputer1.PintInFo();
    }

    static class PersonalComputer {

        private String MSize;
        private String MColor;
        private String MPower;

        private String CPU;
        private String CMemory;
        private String CHd;
        private String CColor;
        private String CPower;


        public void SetMSize(String MSize) {this.MSize = MSize;}
        public void SetMColor(String MColor) {this.MColor = MColor;}
        public void SetMPower(String MPower) {this.MPower = MPower;}

        public void SetCPU(String CPU) {this.CPU = CPU;}
        public void SetCMemory(String CMemory) {this.CMemory = CMemory;}
        public void SetCHd(String CHd) {this.CHd = CHd;}
        public void SetCColor(String CColor) {this.CColor = CColor;}
        public void SetCPower(String CPower) {this.CPower = CPower;}


        public String GetMSize() {return MSize;}
        public String GetMColor() {return MColor;}
        public String GetMPower() {return MPower;}

        public String GetCPU() {return CPU;}
        public String GetCMemory() {return CMemory;}
        public String GetCHd() {return CHd;}
        public String GetCColor() {return CColor;}
        public String GetCPower() {return CPower;}

        public void PintInFo() {
            System.out.println("The spec of the computer");
            System.out.println(" CPU : " + CPU);
            System.out.println(" Memory : " + CMemory);
            System.out.println(" HDD : " + CHd);
            System.out.println(" Color : " + CColor);
            System.out.println(" Power : " + CPower);
            System.out.println("The spec of the monitor");
            System.out.println(" size : " + MSize);
            System.out.println(" Color : " + MColor);
            System.out.println(" Power : " + MPower);
        }

    }

    static class Computer {

        private String CPU;
        private String CMemory;
        private String CHd;
        private String CColor;
        private String CPower;

        public void SetCPU(String CPU) {this.CPU = CPU;}
        public void SetCMemory(String CMemory) {this.CMemory = CMemory;}
        public void SetCHd(String CHd) {this.CHd = CHd;}
        public void SetCColor(String CColor) {this.CColor = CColor;}
        public void SetCPower(String CPower) {this.CPower = CPower;}

        public String GetCPU() {return CPU;}
        public String GetCMemory() {return CMemory;}
        public String GetCHd() {return CHd;}
        public String GetCColor() {return CColor;}
        public String GetCPower() {return CPower;}

        void TurnOn () {
            System.out.println("Turning on the Computer.");
        }

    }

    static class Monitor {
        private String MSize;
        private String MColor;
        private String MPower;

        public void SetMSize (String MSize) {this.MSize = MSize;}
        public void SetMColor (String MColor) {this.MColor = MColor;}
        public void SetMPower (String MPower) {this.MPower = MPower;}

        public String GetMSize() {return MSize;}
        public String GetMColor() {return MColor;}
        public String GetMPower() {return MPower;}

        void TurnOn () {
            System.out.println("Turning on the monitor.");
        }



    }
}