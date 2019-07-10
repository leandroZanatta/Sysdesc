package br.com.sysdesc.atualizacao.enumeradores;

public enum TipoConexaoEnum {

    POSTGRES("org.postgresql.Driver", "jdbc:postgresql://localhost", "SELECT datname FROM pg_database WHERE datistemplate = false", "postgres", 5432),

    H2("org.postgresql.Driver", "jdbc:h2:mem:sysdesc;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=false;MODE=PostgreSQL;MVCC=true",
            "SELECT datname FROM pg_database WHERE datistemplate = false", "", 5432),

    MYSQL("com.mysql.jdbc.Driver", "jdbc:mysql://localhost", "show databases", "", 3306);

    private String driver;

    private String url;

    private String database;

    private String defaultDatabase;

    private Integer porta;

    public static String jdbcPassword = "javax.persistence.jdbc.password";
    public static String jdbcUser = "javax.persistence.jdbc.user";
    public static String jdbcUrl = "javax.persistence.jdbc.url";
    public static String jdbcDriver = "javax.persistence.jdbc.driver";

    private TipoConexaoEnum(String driver, String url, String database, String defaultDatabase, Integer porta) {
        this.driver = driver;
        this.url = url;
        this.porta = porta;
        this.database = database;
        this.defaultDatabase = defaultDatabase;

    }

    public String getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public Integer getPorta() {
        return porta;
    }

    public String getDatabase() {
        return database;
    }

    public String getDefaultDatabase() {
        return defaultDatabase;
    }

    @Override
    public String toString() {
        return this.driver;
    }
}
