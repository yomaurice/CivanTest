class song {

    String name;
    int num;

    song() {
    }

    song(String name) {
        this.name = name;
    }


    public song(String name, int num){
        this.name=name;
        this.num=num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
