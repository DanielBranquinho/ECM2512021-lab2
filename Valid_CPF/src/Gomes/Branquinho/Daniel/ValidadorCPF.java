package Gomes.Branquinho.Daniel;

public class ValidadorCPF {
    private static String[] invalidosConhecidos = {
            "00000000000","11111111111","22222222222","33333333333","44444444444"
            ,"55555555555","66666666666","77777777777","88888888888","99999999999"
    };
    private static final int[] multiplicadoresPrimeiroDigito = {
            10,9,8,7,6,5,4,3,2
    };
    private static final int[] multiplicadoresSegundoDigito = {
            11,10,9,8,7,6,5,4,3,2
    };

    private static final int tamanho_cpf = 11;
    public static boolean validarcpf(String cpf){
        cpf = cpf.replace(".","");
        cpf = cpf.replace("-","");
        //Verifica a quantidade de digitos do cpf
        if(cpf.length() != 11)
            return false;
        //Comparando o cpf com os invalidosConhecidos
        for(String cpfinvalido:invalidosConhecidos) {
            if(cpfinvalido.equals(cpf))
                    return false;

            }

        //Validação do primeiro e do segundo digito
        if (validarDigito(multiplicadoresPrimeiroDigito,cpf) && validarDigito(multiplicadoresSegundoDigito, cpf))
            return true;

        return false;
    };
    private static boolean validarDigito(int[] multiplicadores, String cpf){
      int somatoria = 0;
        for (int i = 0; i < multiplicadores.length; i++) {
            somatoria += multiplicadores[i] * Integer.parseInt(""+cpf.charAt(i));
        }
        return (""+((somatoria*10)%11)%10).equals(""+cpf.charAt(multiplicadores.length));
    };

}
