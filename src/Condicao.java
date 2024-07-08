public class Condicao {

    public String funcaoDeCondicao(int idadeUser){

        if (idadeUser >= 18){
            System.out.println("maior de idade");
        }
        if (idadeUser < 18){
            System.out.println("menor de idade");
        }
        return null;
    }
}
