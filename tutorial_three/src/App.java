// package statements go first, but since this is default package, none are noted

// import statements go after package statements -- call ocean package and then Fish class
// packages are hierarchical, like folders within folders; call subfolders via dots
import ocean.Fish;
import ocean.plants.Seaweed;

// can import everything in one package via
//import ocean.*;


public class App {

	public static void main(String[] args) {
		Fish fish = new Fish();
		Seaweed weed = new Seaweed();
	}

}
