# Using Firebird as Main Data Store

Changes compared to a standard project:

- [application.properties](src/main/resources/application.properties):
    ```
    jmix.data.dbms-type = firebird
    main.datasource.url = jdbc:firebirdsql://localhost:3050//path/to/database/mirror.fdb
    main.datasource.username = SYSDBA
    main.datasource.password = masterkey
    ```

- Added [data store configuration beans](src/main/java/com/company/demo/dbms/firebird)

- Added `firebird` to `dbms` attribute in [010-init-user.xml](src/main/resources/com/company/demo/liquibase/changelog/010-init-user.xml)
