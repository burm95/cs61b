public class Pokemon {
    public String name;
    public int level;
    public Pokemon(String name,int level){
        this.name=name;
        this.level=level;
    }
    public static void change(Pokemon poke,int level){
        poke.level=level;
        level=50;
        poke=new Pokemon("gengar",1);
    }
    public static void main(String[] args){
        Pokemon p=new Pokemon("pikachu",17);
        int level=100;
        change(p,level);
        System.out.println(p.name+p.level);
    }
}
