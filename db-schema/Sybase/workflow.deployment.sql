CREATE TABLE OPENJPA_SEQUENCE_TABLE (ID TINYINT NOT NULL, SEQUENCE_VALUE NUMERIC(38) NULL, UNQ_INDEX NUMERIC IDENTITY UNIQUE, PRIMARY KEY (ID));
CREATE TABLE TEMPO_ITEM (id NUMERIC(38) NOT NULL, content_type VARCHAR(255) NULL, lastmodified DATETIME NULL, payload IMAGE NULL, uri VARCHAR(255) NULL, UNQ_INDEX NUMERIC IDENTITY UNIQUE, PRIMARY KEY (id));
