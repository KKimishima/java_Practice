package Kimishima;

class Main {
  public static void main(String args[]) {
    String file   = "README.txt";
    String folder1 = "c:¥javadev";
    String folder2 = "c:¥user¥";
    String[] path = new String[2];

    path[0] = concatPath(file,folder1);
    path[1] = concatPath(file,folder2);

    System.out.println("パス;" + path[0]);
    System.out.println("パス;" + path[1]);
  }
  public static String concatPath(String file,String folder){
    if(!folder.endsWith("¥")){
      folder += "¥";
    }
    return folder + file;
  }
}
