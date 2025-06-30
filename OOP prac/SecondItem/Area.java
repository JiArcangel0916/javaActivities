package SecondItem;

class Area {

    public String strShape = "";
    public int intNum1 = 0;
    public int intNum2 = 0;
    public double dbNum1 = 0;
    public double dbNum2 = 0;

    public Area(String strShape, int intNum1){
        this.strShape = strShape;
        this.intNum1 = intNum1;
    }   
    public Area(String strShape, double dbNum1){
        this.strShape = strShape;
        this.dbNum1 = dbNum1;
    }     
    public Area(String strShape, int intNum1, int intNum2){
        this.strShape = strShape;
        this.intNum1 = intNum1;
        this.intNum2 = intNum2;
    }
    public Area(String strShape, double dbNum1, int intNum1){
        this.strShape = strShape;
        this.dbNum1 = dbNum1;
        this.intNum1 = intNum1;
    }
    public Area(String strShape, int intNum1, double dbNum1){
        this.strShape = strShape;
        this.intNum1 = intNum1;
        this.dbNum1 = dbNum1;
    }
    public Area(String strShape, double dbNum1, double dbNum2){
        this.strShape = strShape;
        this.dbNum1 = dbNum1;
        this.dbNum2 = dbNum2;
    }

    public double Area(String strShape, int intNum1){
        return Math.PI * intNum1 * intNum1; 
    }
    public double Area(String strShape, double dbNum1){
        return Math.PI * dbNum1 * dbNum1;
    }
    public int Area(String strShape, int intNum1, int intNum2){
        return intNum1 * intNum2;
    }
    public double Area(String strShape, double dbNum1, int intNum1){
        return dbNum1 * intNum1;
    }
    public double Area(String strShape, int intNum1, double dbNum1){
        return intNum1 * dbNum1;
    }
    public double Area(String strShape, double dbNum1, double dbNum2){
        return dbNum1 * dbNum2;
    }
}