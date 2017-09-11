package mod3.Assignments;

/**
 * This is just a fun assignment to create an ASCII art
 *
 * @Author Ellis Barnes
 * @Date 09/11/2017
 */
public class Artwork {
    public static void main(String[] args) {
        String[] art = {
                "SHOW ME WHAT YOU GOT!",
                "______________  _____",
                "              |/",
                "       ___",
                "    . -^   `--,",
                "   /# =========`-_",
                "  /# (--====___====\\",
                " /#   .- --.  . --.|",
                "/##   |  * ) (   * ),",
                "|##   \\    /\\ \\   / |",
                "|###   ---   \\ ---  |",
                "|####      ___)    #|",
                "|######           ##|",
                " \\##### ---------- /",
                "  \\####           (",
                "   `\\###          |",
                "     \\###         |",
                "      \\##        |",
                "       \\###.    .)",
                "        `======/"
        };

        for (String i : art) {
            System.out.println(i);
        }
    }
}
