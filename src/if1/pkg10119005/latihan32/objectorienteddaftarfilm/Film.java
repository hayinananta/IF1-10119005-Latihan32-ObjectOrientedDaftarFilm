/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan32.objectorienteddaftarfilm;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini memunculkan daftar film yang sedang tayang
 *                     dengan pendekatan berbasis objek
 */
public class Film {
    public String filmName, filmGenre;
    public double filmRating;
    public int filmDuration;
    
  public void nowPlaying(){
        System.out.println("");
        System.out.println("Judul Film ". concat(filmName));
        System.out.println("Genre Film ". concat(filmGenre));
        System.out.println("Rating Film " + filmRating);
        System.out.println("Durasi Film " + filmDuration + "Menit\n");
  }

    
}
