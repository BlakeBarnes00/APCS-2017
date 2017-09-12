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
                "SHOW ME WHAT YOU GOT!\n",
                "______________  _____\n",
                "              |/\n",
                "       ___\n",
                "    . -^   `--,\n",
                "   /# =========`-_\n",
                "  /# (--====___====\\\n",
                " /#   .- --.  . --.|\n",
                "/##   |  * ) (   * ),\n",
                "|##   \\    /\\ \\   / |\n",
                "|###   ---   \\ ---  |\n",
                "|####      ___)    #|\n",
                "|######           ##|\n",
                " \\##### ---------- /\n",
                "  \\####           (\n",
                "   `\\###          |\n",
                "     \\###         |\n",
                "      \\##        |\n",
                "       \\###.    .)\n",
                "        `======/"
        };

        for (String i : art) {
            System.out.print(i);
        }
    }
}
