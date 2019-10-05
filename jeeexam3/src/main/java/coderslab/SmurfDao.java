package coderslab;

import java.util.ArrayList;
import java.util.List;

public class SmurfDao {
    public static List<Smurf> getList() {

        ArrayList<Smurf> smurfs = new ArrayList<>();

        Smurf smerf1 = new Smurf("zosia", "niebiesk", "kwiatek");
        Smurf smerf2 = new Smurf("asia", "niebiesk", "kwiatek");
        Smurf smerf3 = new Smurf("karol", "niebiesk", "kwiatek");
        Smurf smerf4 = new Smurf("ola", "niebiesk", "kwiatek");
        Smurf smerf5 = new Smurf("zoe", "niebiesk", "kwiatek");

        smurfs.add(smerf1);
        smurfs.add(smerf2);
        smurfs.add(smerf3);
        smurfs.add(smerf4);
        smurfs.add(smerf5);

        return smurfs;
    }
}
