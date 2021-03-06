//usar-graphviz-desde-java.html
//http://www.rdebug.com/2010/05/usar-graphviz-desde-java.html

public class Main {
  public static void main(String[] args) {
    System.out.println("Hola Mundo");
    try {
      
      String dotPath = "c:\\Archivos de programa\\Graphviz 2.28\\bin\\dot.exe";
      
      String fileInputPath = "c:\\grafo1.txt";
      String fileOutputPath = "c:\\grafo1.jpg";
      
      String tParam = "-Tjpg";
      String tOParam = "-o";
        
      String[] cmd = new String[5];
      cmd[0] = dotPath;
      cmd[1] = tParam;
      cmd[2] = fileInputPath;
      cmd[3] = tOParam;
      cmd[4] = fileOutputPath;
                  
      Runtime rt = Runtime.getRuntime();
      
      rt.exec( cmd );
      
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
    }

  }
}