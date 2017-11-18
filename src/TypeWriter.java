import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class TypeWriter
{
    private HashMap<String, Integer> funcCount;
    private static String[] topTwo;
    private static String type;

    public TypeWriter()
    {
        funcCount = new HashMap<String, Integer>();
        topTwo = new String[2];
    }

    public TypeWriter(HashMap<String, Integer> funcCount)
    {
        this.funcCount = funcCount;
        topTwo = new String[2];
    }

    //TODO: Find more sophisticated way to calculate type if there are two dominant functions
    // Finds the dominant function and then the auxiliary based off of that
    public void findDomAndAux() {
        // Find dominant function
        String dom = "";
        int maxCount = 0;
        for (String s : funcCount.keySet()) {
            if (funcCount.get(s) > maxCount) {
                dom = s;
                maxCount = funcCount.get(s);
            }
        }
        topTwo[0] = dom;

        // Assign auxiliary based on dominant
        // Auxiliary is greater of two possible functions for each type.
        //TODO: Don't need data at second position of the topTwo anymore
        switch (topTwo[0]) {
            case "Ti": // Se or Ne [ISTP, INTP]
                if (funcCount.get("Se") > funcCount.get("Ne")) {
                    topTwo[1] = "Se";
                    type = "istp";
                } else {
                    topTwo[1] = "Ne";
                    type = "intp";
                }
                break;
            case "Fi": // Se or Ne [ISFP, INFP]
                if (funcCount.get("Se") > funcCount.get("Ne")) {
                    topTwo[1] = "Se";
                    type = "isfp";
                } else {
                    topTwo[1] = "Ne";
                    type = "isfp";
                }
                break;
            case "Te": // Si or Ni [ESTJ, ENTJ]
                if (funcCount.get("Si") > funcCount.get("Ni")) {
                    topTwo[1] = "Si";
                    type = "estj";
                } else {
                    topTwo[1] = "Ni";
                    type = "entj";
                }
                break;
            case "Fe": // Si or Ni [ESFJ, ENFJ]
                if (funcCount.get("Si") > funcCount.get("Ni")) {
                    topTwo[1] = "Si";
                    type = "esfj";
                } else {
                    topTwo[1] = "Ni";
                    type = "enfj";
                }
                break;
            case "Si": // Fe or Te [ISFJ, ISTJ]
                if (funcCount.get("Fe") > funcCount.get("Te")) {
                    topTwo[1] = "Fe";
                    type = "isfj";
                } else {
                    topTwo[1] = "Te";
                    type = "istj";
                }
                break;
            case "Ni": // Fe or Te [INFJ, INTJ]
                if (funcCount.get("Fe") > funcCount.get("Te")) {
                    topTwo[1] = "Fe";
                    type = "infj";
                } else {
                    topTwo[1] = "Te";
                    type = "intj";
                }
                break;
            case "Ne": // Fi or Ti [ENFP, ENTP]
                if (funcCount.get("Fi") > funcCount.get("Ti")) {
                    topTwo[1] = "Fi";
                    type = "enfp";
                } else {
                    topTwo[1] = "Ti";
                    type = "entp";
                }
                break;
            case "Se": // Fi or Ti [ESFP, ESTP]
                if (funcCount.get("Fi") > funcCount.get("Ti")) {
                    topTwo[1] = "Fi";
                    type = "esfp";
                } else {
                    topTwo[1] = "Ti";
                    type = "estp";
                }
                break;
        }
    }

    public void printType()
    {
        String file = "C:/Users/Joe/IdeaProjects/CognitiveFunctionTest/types/" + type + ".txt";
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line = null;
            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch(Exception e) // Handle file exception
        {
            System.out.println(e.getClass());
        }
    }
}
