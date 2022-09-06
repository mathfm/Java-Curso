package projetorsa;

public class Rsa extends Modular {

    /*/
        # Definir P e Q key public
        # Calcular o valor de N
        # Encontre o valor de Z
        # Encontre o valor de E
        # Define D key private P Q D
     */
    int p = 11;
    int q = 17;
    int n = p * q;
    int z = (p - 1) * (q - 1);

    int d = modInverse(p, q);

}
