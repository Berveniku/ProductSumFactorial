import javax.swing.*;
public class Detyra_5_Test
{
public static void main(String[] args)
{
String numri = JOptionPane.showInputDialog("Jepeni nje numer qe te mblidhet shuma e gjithe numrave prej 1 deri ne ate numer");
Integer nr = new Integer(numri).intValue();
Detyra_5 obj = new Detyra_5();
obj.shuma(nr);
String numri1 = JOptionPane.showInputDialog("Tash do te gjejme prodhimin ndermjet gjithe numrave duke u nisur nga numri x \n (qe do te jepni ju) deri ne numrin e dyte b, jepni numrin a");
Integer nr1 = new Integer(numri1).intValue();
String numri2 = JOptionPane.showInputDialog("Jepni numrin e dyte y");
Integer nr2 = new Integer(numri2).intValue();
obj.prodhimi(nr1,nr2);
String fk = JOptionPane.showInputDialog("Jepeni nje numer per te gjetur faktorielin e atij numri)");
Integer nrFk = new Integer(fk).intValue();
obj.factoriel(nrFk);
String kendi = JOptionPane.showInputDialog("Jepe nje kend per te gjetur sinusin e tij");
Double x = new Double(kendi).doubleValue();
obj.sinusoide(x);
String kendi1 = JOptionPane.showInputDialog("Jepe nje kend per te gjetur kosinusin e tij");
Double y = new Double(kendi1).doubleValue();
obj.cosinusoide(y);


}}