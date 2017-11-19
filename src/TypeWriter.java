import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class TypeWriter
{
    private HashMap<String, Integer> funcCount;
    private static String type;

    public TypeWriter()
    {
        funcCount = new HashMap<String, Integer>();
        type = "";
    }

    public TypeWriter(HashMap<String, Integer> funcCount)
    {
        this.funcCount = funcCount;
        type = "";
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

        // Assign auxiliary based on dominant
        // Auxiliary is greater of two possible functions for each type.
        switch (dom) {
            case "Ti": // Se or Ne [ISTP, INTP]
                if (funcCount.get("Se") > funcCount.get("Ne")) {
                    type = "istp";
                } else {
                    type = "intp";
                }
                break;
            case "Fi": // Se or Ne [ISFP, INFP]
                if (funcCount.get("Se") > funcCount.get("Ne")) {
                    type = "isfp";
                } else {
                    type = "isfp";
                }
                break;
            case "Te": // Si or Ni [ESTJ, ENTJ]
                if (funcCount.get("Si") > funcCount.get("Ni")) {
                    type = "estj";
                } else {
                    type = "entj";
                }
                break;
            case "Fe": // Si or Ni [ESFJ, ENFJ]
                if (funcCount.get("Si") > funcCount.get("Ni")) {
                    type = "esfj";
                } else {
                    type = "enfj";
                }
                break;
            case "Si": // Fe or Te [ISFJ, ISTJ]
                if (funcCount.get("Fe") > funcCount.get("Te")) {
                    type = "isfj";
                } else {
                    type = "istj";
                }
                break;
            case "Ni": // Fe or Te [INFJ, INTJ]
                if (funcCount.get("Fe") > funcCount.get("Te")) {
                    type = "infj";
                } else {
                    type = "intj";
                }
                break;
            case "Ne": // Fi or Ti [ENFP, ENTP]
                if (funcCount.get("Fi") > funcCount.get("Ti")) {
                    type = "enfp";
                } else {
                    type = "entp";
                }
                break;
            case "Se": // Fi or Ti [ESFP, ESTP]
                if (funcCount.get("Fi") > funcCount.get("Ti")) {
                    type = "esfp";
                } else {
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
