alter table TBI002_TERM_INACT
   drop constraint R0030021;

drop table TBI001_LOGIN cascade constraints;

drop index IBI002S1_MOTIVO;

drop table TBI002_TERM_INACT cascade constraints;

drop table TBI003_MOTIVO cascade constraints;

drop table TBI004_ESTADO_CLI cascade constraints;

drop table TBI005_SERVIDOR_OF cascade constraints;

drop table TBI006_DEPURACION_CLI cascade constraints;

drop sequence SQ_DEPURACION_CLI;

drop sequence SQ_ESTADO_CLI;

drop sequence SQ_LOGIN;

drop sequence SQ_MOTIVO;

drop sequence SQ_SERVIDOR_OF;

drop sequence SQ_TERM_INACT;

create sequence SQ_DEPURACION_CLI;

create sequence SQ_ESTADO_CLI;

create sequence SQ_LOGIN;

create sequence SQ_MOTIVO;

create sequence SQ_SERVIDOR_OF;

create sequence SQ_TERM_INACT;

/*==============================================================*/
/* Table: TBI001_LOGIN                                          */
/*==============================================================*/
create table TBI001_LOGIN  (
   CD_LOGIN             NUMBER(6)                       not null,
   CD_OFICINA           VARCHAR2(4)                     not null,
   NB_SERVIDOR          VARCHAR2(10)                    not null,
   NU_PUESTO            VARCHAR2(12)                    not null,
   CD_REGISTRO          VARCHAR2(7)                     not null,
   CD_PERFIL            VARCHAR2(10)                    not null,
   NB_USUARIO           VARCHAR2(100)                   not null,
   FH_LOGIN             DATE                            not null,
   constraint PK_TBI001_LOGIN primary key (CD_LOGIN)
);

comment on table TBI001_LOGIN is
'Registro de usuarios autenticados en nacar';

comment on column TBI001_LOGIN.CD_LOGIN is
'Identificador de registro de autenticación';

comment on column TBI001_LOGIN.CD_OFICINA is
'Código de Oficina';

comment on column TBI001_LOGIN.NB_SERVIDOR is
'Código de servidor';

comment on column TBI001_LOGIN.NU_PUESTO is
'Número de puesto';

comment on column TBI001_LOGIN.CD_REGISTRO is
'Registro de usuario autenticado';

comment on column TBI001_LOGIN.NB_USUARIO is
'Nombres y apellidos del usuario autenticado';

comment on column TBI001_LOGIN.FH_LOGIN is
'Fecha y hora de autenticación';

/*==============================================================*/
/* Table: TBI002_TERM_INACT                                     */
/*==============================================================*/
create table TBI002_TERM_INACT  (
   CD_TERM_INACTIVO     NUMBER(6)                       not null,
   CD_MOTIVO            NUMBER(6),
   CD_SERVIDOR          VARCHAR2(10)                    not null,
   CD_PUESTO            VARCHAR2(12)                    not null,
   FH_FECHA_INICIO      DATE                            not null,
   FH_FECHA_FIN         DATE                            not null,
   TX_COMENTARIOS       VARCHAR2(200)                   not null,
   ST_ESTADO            SMALLINT                        not null,
   constraint PK_TBI002_TERM_INACT primary key (CD_TERM_INACTIVO)
);

comment on table TBI002_TERM_INACT is
'Registro de terminales inactivos';

comment on column TBI002_TERM_INACT.CD_TERM_INACTIVO is
'Identificador de registro de terminal desactivado/deshabilitado';

comment on column TBI002_TERM_INACT.CD_MOTIVO is
'Identificador de tipo de motivo';

comment on column TBI002_TERM_INACT.CD_SERVIDOR is
'Código de servidor';

comment on column TBI002_TERM_INACT.CD_PUESTO is
'Código de puesto';

comment on column TBI002_TERM_INACT.FH_FECHA_INICIO is
'Fecha de inicio de desactivación';

comment on column TBI002_TERM_INACT.FH_FECHA_FIN is
'Fecha fin de desactivación';

comment on column TBI002_TERM_INACT.TX_COMENTARIOS is
'Comentarios acerca de la desactivación';

comment on column TBI002_TERM_INACT.ST_ESTADO is
'Estado del registro (0: eliminado, 1: activo)';

/*==============================================================*/
/* Index: IBI002S1_MOTIVO                                       */
/*==============================================================*/
create index IBI002S1_MOTIVO on TBI002_TERM_INACT (
   CD_MOTIVO ASC
);

/*==============================================================*/
/* Table: TBI003_MOTIVO                                         */
/*==============================================================*/
create table TBI003_MOTIVO  (
   CD_MOTIVO            NUMBER(6)                       not null,
   NB_MNEMO             VARCHAR2(20)                    not null,
   NB_DESCRIPCION       VARCHAR2(200)                   not null,
   constraint PK_TBI003_MOTIVO primary key (CD_MOTIVO)
);

comment on table TBI003_MOTIVO is
'Tipos de motivo de desactivación';

comment on column TBI003_MOTIVO.CD_MOTIVO is
'Identificador de tipo de motivo';

comment on column TBI003_MOTIVO.NB_MNEMO is
'Nombre corto de tipo de motivo';

comment on column TBI003_MOTIVO.NB_DESCRIPCION is
'Descripción del tipo de motivo';

/*==============================================================*/
/* Table: TBI004_ESTADO_CLI                                     */
/*==============================================================*/
create table TBI004_ESTADO_CLI  (
   CD_ESTADO_CLI        NUMBER(6)                       not null,
   CD_TIPO_DOC          VARCHAR2(3)                     not null,
   NU_NUMERO_DOCUMENTO  VARCHAR2(15)                    not null,
   ST_INDICADOR_PDP     SMALLINT                        not null,
   constraint PK_TBI004_ESTADO_CLI primary key (CD_ESTADO_CLI)
);

comment on table TBI004_ESTADO_CLI is
'Estado de cliente: 
Indica si los datos guardados del cliente se deben eliminar durante el proceso de depuración (según indicador LPDP - Ley de Protección de Datos Personales). 
0: se debe eliminar
1: no se debe eliminar
';

comment on column TBI004_ESTADO_CLI.CD_ESTADO_CLI is
'Identificador de registro de estado de un cliente';

comment on column TBI004_ESTADO_CLI.CD_TIPO_DOC is
'Código de tipo de documento de identidad
';

comment on column TBI004_ESTADO_CLI.NU_NUMERO_DOCUMENTO is
'Número de documento de identidad';

comment on column TBI004_ESTADO_CLI.ST_INDICADOR_PDP is
'Indicador de aceptación de la cláusula de Ley de Protección de Datos Personales:
0: se debe eliminar
1: no se debe eliminar';

/*==============================================================*/
/* Table: TBI005_SERVIDOR_OF                                    */
/*==============================================================*/
create table TBI005_SERVIDOR_OF  (
   CD_SERVIDOR_OF       NUMBER(6)                       not null,
   CD_OFICINA           VARCHAR2(4)                     not null,
   CD_SERVIDOR          VARCHAR2(10)                    not null,
   ST_ESTADO            SMALLINT                        not null,
   constraint PK_TBI005_SERVIDOR_OF primary key (CD_SERVIDOR_OF)
);

comment on table TBI005_SERVIDOR_OF is
'Relación servidor - oficina';

comment on column TBI005_SERVIDOR_OF.CD_SERVIDOR_OF is
'Identificador de registro';

comment on column TBI005_SERVIDOR_OF.CD_OFICINA is
'Código de Oficina';

comment on column TBI005_SERVIDOR_OF.CD_SERVIDOR is
'Código de servidor';

comment on column TBI005_SERVIDOR_OF.ST_ESTADO is
'Estado del registro (0: eliminado, 1: activo)';

/*==============================================================*/
/* Table: TBI006_DEPURACION_CLI                                 */
/*==============================================================*/
create table TBI006_DEPURACION_CLI  (
   CD_DEPURACION_CLIENTE NUMBER(6)                       not null,
   FH_EJECUCION         DATE                            not null,
   CT_INCIAL            INTEGER                         not null,
   CT_FINAL             INTEGER                         not null,
   CT_DEPURADOS         INTEGER                         not null,
   constraint PK_TBI006_DEPURACION_CLI primary key (CD_DEPURACION_CLIENTE)
);

comment on table TBI006_DEPURACION_CLI is
'Registro del resultado de ejecución del proceso de depuración de clientes';

comment on column TBI006_DEPURACION_CLI.CD_DEPURACION_CLIENTE is
'Identificador de registro';

comment on column TBI006_DEPURACION_CLI.FH_EJECUCION is
'Fecha y hora de ejecución del proceso de depuración';

comment on column TBI006_DEPURACION_CLI.CT_INCIAL is
'Cantidad inicial de registros encontrados antes de la ejecución del proceso de depuración';

comment on column TBI006_DEPURACION_CLI.CT_FINAL is
'Cantidad de registros encontrados después de finalizar el proceso de depuración';

comment on column TBI006_DEPURACION_CLI.CT_DEPURADOS is
'Cantidad de registros depurados';

alter table TBI002_TERM_INACT
   add constraint R0030021 foreign key (CD_MOTIVO)
      references TBI003_MOTIVO (CD_MOTIVO);
