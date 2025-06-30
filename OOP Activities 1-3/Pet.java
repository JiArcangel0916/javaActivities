class Pet {
    String name;
    String type;
    
    public Pet(String name, String type){
        this.name = name;
        this.type = type;
    }

    public void speak(){
        System.out.println("I am "+name+" and I am a "+type);
    }
}
