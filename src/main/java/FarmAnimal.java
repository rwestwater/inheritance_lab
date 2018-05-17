public abstract class FarmAnimal {

    private String species;
    private  String song;
    private String noise;

    public FarmAnimal(String species, String noise) {
        this.species = species;
        this.song = song;
        this.noise = noise;
    }

    public String getSpecies(){
        return this.species;
    }

//    public String singTheSong(){
//        return "Old McDonald had a " + this.species; "with a " + this.noise; "everywhere.";
//    }
//
//    public abstract String makeANoise(){
//        return this.noise;
//    }


}


