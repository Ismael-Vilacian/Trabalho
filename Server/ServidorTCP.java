package Server;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTCP {

    public static void main(String[] args) {
        iniciar(9000);
    }

    public static void iniciar(int porta) {

        ObjectOutputStream saida;
        ObjectInputStream entrada;

        try {
            ServerSocket serverSocket = new ServerSocket(porta);
            Socket conexao;

            while (true) {
                System.out.println("servidor ativo na porta " + porta);

                conexao = serverSocket.accept();

                System.out.println("Conexao estabelecida com " + conexao.getInetAddress().getHostAddress());

                entrada = new ObjectInputStream(conexao.getInputStream());
                saida = new ObjectOutputStream(conexao.getOutputStream());
                Bhaskara bhaskara = (Bhaskara) entrada.readObject();
                
                var a = bhaskara.getA();
                var b = bhaskara.getB();
                var c = bhaskara.getC();

                bhaskara.setX1(((b * b) - (4 * a * c)));

                if (bhaskara.getDelta() > 0) {
                    bhaskara.setX1(((-b + Math.sqrt(bhaskara.getDelta())) / (2 * a)));
                    bhaskara.setX1(((-b - Math.sqrt(bhaskara.getDelta())) / (2 * a)));
                } 
                else
                {
                    bhaskara.setMenorOuIgualZero(true);
                }

                while (!bhaskara.isFim()) {
                    try {
                        saida.writeObject(bhaskara);
                    } catch (Exception e) {
                    }
                }

                System.out.println("Conexao encerrada pelo cliente");
                saida.close();
                entrada.close();
                conexao.close();
            }

        } catch (Exception e) {
        }
    }
}