public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Borther DCP-T720DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while(inkjet.print());
        while(laser.print());
    }
}

abstract class Printer {

    protected String Model;
    protected int PrintedCount = 1;
    protected int AvailableCount;

    public String GetModel(String Model) {return Model;}
    public int GetAvailableCount(int AvailableCount) {return AvailableCount;}

    public void Printer (String Model, int AvailableCount) {
        this.Model = Model;
        this.AvailableCount = AvailableCount;
    }

    public abstract Boolean print();

}

class InkjetPrinter extends Printer {
    public InkjetPrinter(String Model, int AvailableCount) {
        this.Model = Model;
        this.AvailableCount = AvailableCount;
    }

    @Override
    public Boolean print() {
        if (AvailableCount >= 1) {
            PrintedCount = PrintedCount + 1;
            AvailableCount = AvailableCount - 1;
            return true;
        }
        else {
            System.out.println(Model + ": " + PrintedCount + "매째 인쇄 실패 - 잉크부족.");
            return false;
        }
    }
}

class LaserPrinter extends Printer{
    public LaserPrinter(String Model, int AvailableCount) {
        this.Model = Model;
        this.AvailableCount = AvailableCount;
    }

    @Override
    public Boolean print() {
        if (AvailableCount >= 1) {
            PrintedCount = PrintedCount + 1;
            AvailableCount = AvailableCount - 1;
            return true;
        }
        else {
            System.out.println(Model + ": " + PrintedCount + "매째 인쇄 실패 - 토너부족.");
            return false;
        }
    }
}