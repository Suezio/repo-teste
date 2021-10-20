package connection;

public class ConnectionFactory {
    public void openConnection(){
        System.out.println("Abrindo conexão com o banco de dados..");

    }
    public  void executreSQL(){
        System.out.println("executando sql no bd");
    }

    public void closeConnection(){
        System.out.println("Fechando a conexão com o BD...");
    }

}

