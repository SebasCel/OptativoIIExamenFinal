PGDMP                         {           ExFinalPgadm    15.3    15.3 1    /           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            0           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            1           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            2           1262    32857    ExFinalPgadm    DATABASE     �   CREATE DATABASE "ExFinalPgadm" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United States.1252';
    DROP DATABASE "ExFinalPgadm";
                postgres    false            �            1259    32858    Ciudad    TABLE     �   CREATE TABLE public."Ciudad" (
    "IdCiudad" integer NOT NULL,
    "Ciudad" character varying(50),
    "Departamento" character varying(50),
    "PostalCode" character varying(30)
);
    DROP TABLE public."Ciudad";
       public         heap    postgres    false            �            1259    32861    Ciudad_IdCiudad_seq    SEQUENCE     �   CREATE SEQUENCE public."Ciudad_IdCiudad_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public."Ciudad_IdCiudad_seq";
       public          postgres    false    214            3           0    0    Ciudad_IdCiudad_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public."Ciudad_IdCiudad_seq" OWNED BY public."Ciudad"."IdCiudad";
          public          postgres    false    215            �            1259    32862    Cliente    TABLE     �   CREATE TABLE public."Cliente" (
    "IdCliente" integer NOT NULL,
    "IdPersona" integer NOT NULL,
    "FechaIngreso" date NOT NULL,
    "Calificacion" character varying(50),
    "Estado" character varying(50)
);
    DROP TABLE public."Cliente";
       public         heap    postgres    false            �            1259    32865    Cliente_IdCliente_seq    SEQUENCE     �   CREATE SEQUENCE public."Cliente_IdCliente_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public."Cliente_IdCliente_seq";
       public          postgres    false    216            4           0    0    Cliente_IdCliente_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public."Cliente_IdCliente_seq" OWNED BY public."Cliente"."IdCliente";
          public          postgres    false    217            �            1259    32866    Cuentas    TABLE     �  CREATE TABLE public."Cuentas" (
    "IdCuenta" integer NOT NULL,
    "IdCliente" integer NOT NULL,
    "NroCuenta" character varying(50) NOT NULL,
    "FechaAlta" date NOT NULL,
    "TipoCuenta" character varying(50) NOT NULL,
    "Estado" character varying(50),
    "Saldo" numeric(5,0) NOT NULL,
    "NroContrato" character varying(50),
    "CostoMantenimiento" numeric(5,0) NOT NULL,
    "PromedioAcreditacion" numeric(5,0),
    "Moneda" character varying(50) NOT NULL
);
    DROP TABLE public."Cuentas";
       public         heap    postgres    false            �            1259    32869    Cuentas_IdCuenta_seq    SEQUENCE     �   CREATE SEQUENCE public."Cuentas_IdCuenta_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public."Cuentas_IdCuenta_seq";
       public          postgres    false    218            5           0    0    Cuentas_IdCuenta_seq    SEQUENCE OWNED BY     S   ALTER SEQUENCE public."Cuentas_IdCuenta_seq" OWNED BY public."Cuentas"."IdCuenta";
          public          postgres    false    219            �            1259    32870    Movimientos    TABLE     �  CREATE TABLE public."Movimientos" (
    "IdMovimiento" integer NOT NULL,
    "IdCuenta" integer NOT NULL,
    "FechaMovimiento" date NOT NULL,
    "TipoMovimiento" character varying(50),
    "SaldoAnterior" numeric(5,0),
    "SaldoActual" numeric(5,0),
    "MontoMovimiento" numeric(5,0),
    "CuentaOrigen" numeric(5,0),
    "CuentaDestino" numeric(5,0),
    "Canal" numeric(5,0)
);
 !   DROP TABLE public."Movimientos";
       public         heap    postgres    false            �            1259    32873    Movimientos_IdMovimiento_seq    SEQUENCE     �   CREATE SEQUENCE public."Movimientos_IdMovimiento_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 5   DROP SEQUENCE public."Movimientos_IdMovimiento_seq";
       public          postgres    false    220            6           0    0    Movimientos_IdMovimiento_seq    SEQUENCE OWNED BY     c   ALTER SEQUENCE public."Movimientos_IdMovimiento_seq" OWNED BY public."Movimientos"."IdMovimiento";
          public          postgres    false    221            �            1259    32874    Persona    TABLE     �  CREATE TABLE public."Persona" (
    "IdPersona" integer NOT NULL,
    "Nombre" character varying(50) NOT NULL,
    "Apellido" character varying(50) NOT NULL,
    "TipoDocumento" character varying(50) NOT NULL,
    "NroDocumento" character varying(50) NOT NULL,
    "Direccion" character varying(100),
    "Celular" character varying(50),
    "Email" character varying(100),
    "Estado" character varying(50)
);
    DROP TABLE public."Persona";
       public         heap    postgres    false            �            1259    32879    Persona_IdPersona_seq    SEQUENCE     �   CREATE SEQUENCE public."Persona_IdPersona_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public."Persona_IdPersona_seq";
       public          postgres    false    222            7           0    0    Persona_IdPersona_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public."Persona_IdPersona_seq" OWNED BY public."Persona"."IdPersona";
          public          postgres    false    223            �            1259    32911    usuario    TABLE     �   CREATE TABLE public.usuario (
    id_usuario integer NOT NULL,
    nombre_usuario character varying(255) NOT NULL,
    contrasena character varying(255) NOT NULL
);
    DROP TABLE public.usuario;
       public         heap    postgres    false            �            1259    32910    usuario_id_usuario_seq    SEQUENCE     �   CREATE SEQUENCE public.usuario_id_usuario_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.usuario_id_usuario_seq;
       public          postgres    false    225            8           0    0    usuario_id_usuario_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.usuario_id_usuario_seq OWNED BY public.usuario.id_usuario;
          public          postgres    false    224            ~           2604    32880    Ciudad IdCiudad    DEFAULT     x   ALTER TABLE ONLY public."Ciudad" ALTER COLUMN "IdCiudad" SET DEFAULT nextval('public."Ciudad_IdCiudad_seq"'::regclass);
 B   ALTER TABLE public."Ciudad" ALTER COLUMN "IdCiudad" DROP DEFAULT;
       public          postgres    false    215    214                       2604    32881    Cliente IdCliente    DEFAULT     |   ALTER TABLE ONLY public."Cliente" ALTER COLUMN "IdCliente" SET DEFAULT nextval('public."Cliente_IdCliente_seq"'::regclass);
 D   ALTER TABLE public."Cliente" ALTER COLUMN "IdCliente" DROP DEFAULT;
       public          postgres    false    217    216            �           2604    32882    Cuentas IdCuenta    DEFAULT     z   ALTER TABLE ONLY public."Cuentas" ALTER COLUMN "IdCuenta" SET DEFAULT nextval('public."Cuentas_IdCuenta_seq"'::regclass);
 C   ALTER TABLE public."Cuentas" ALTER COLUMN "IdCuenta" DROP DEFAULT;
       public          postgres    false    219    218            �           2604    32883    Movimientos IdMovimiento    DEFAULT     �   ALTER TABLE ONLY public."Movimientos" ALTER COLUMN "IdMovimiento" SET DEFAULT nextval('public."Movimientos_IdMovimiento_seq"'::regclass);
 K   ALTER TABLE public."Movimientos" ALTER COLUMN "IdMovimiento" DROP DEFAULT;
       public          postgres    false    221    220            �           2604    32884    Persona IdPersona    DEFAULT     |   ALTER TABLE ONLY public."Persona" ALTER COLUMN "IdPersona" SET DEFAULT nextval('public."Persona_IdPersona_seq"'::regclass);
 D   ALTER TABLE public."Persona" ALTER COLUMN "IdPersona" DROP DEFAULT;
       public          postgres    false    223    222            �           2604    32914    usuario id_usuario    DEFAULT     x   ALTER TABLE ONLY public.usuario ALTER COLUMN id_usuario SET DEFAULT nextval('public.usuario_id_usuario_seq'::regclass);
 A   ALTER TABLE public.usuario ALTER COLUMN id_usuario DROP DEFAULT;
       public          postgres    false    224    225    225            !          0    32858    Ciudad 
   TABLE DATA           V   COPY public."Ciudad" ("IdCiudad", "Ciudad", "Departamento", "PostalCode") FROM stdin;
    public          postgres    false    214   _<       #          0    32862    Cliente 
   TABLE DATA           g   COPY public."Cliente" ("IdCliente", "IdPersona", "FechaIngreso", "Calificacion", "Estado") FROM stdin;
    public          postgres    false    216   |<       %          0    32866    Cuentas 
   TABLE DATA           �   COPY public."Cuentas" ("IdCuenta", "IdCliente", "NroCuenta", "FechaAlta", "TipoCuenta", "Estado", "Saldo", "NroContrato", "CostoMantenimiento", "PromedioAcreditacion", "Moneda") FROM stdin;
    public          postgres    false    218   �<       '          0    32870    Movimientos 
   TABLE DATA           �   COPY public."Movimientos" ("IdMovimiento", "IdCuenta", "FechaMovimiento", "TipoMovimiento", "SaldoAnterior", "SaldoActual", "MontoMovimiento", "CuentaOrigen", "CuentaDestino", "Canal") FROM stdin;
    public          postgres    false    220   �<       )          0    32874    Persona 
   TABLE DATA           �   COPY public."Persona" ("IdPersona", "Nombre", "Apellido", "TipoDocumento", "NroDocumento", "Direccion", "Celular", "Email", "Estado") FROM stdin;
    public          postgres    false    222   �<       ,          0    32911    usuario 
   TABLE DATA           I   COPY public.usuario (id_usuario, nombre_usuario, contrasena) FROM stdin;
    public          postgres    false    225   �<       9           0    0    Ciudad_IdCiudad_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public."Ciudad_IdCiudad_seq"', 1, false);
          public          postgres    false    215            :           0    0    Cliente_IdCliente_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public."Cliente_IdCliente_seq"', 1, false);
          public          postgres    false    217            ;           0    0    Cuentas_IdCuenta_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public."Cuentas_IdCuenta_seq"', 1, false);
          public          postgres    false    219            <           0    0    Movimientos_IdMovimiento_seq    SEQUENCE SET     M   SELECT pg_catalog.setval('public."Movimientos_IdMovimiento_seq"', 1, false);
          public          postgres    false    221            =           0    0    Persona_IdPersona_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public."Persona_IdPersona_seq"', 1, false);
          public          postgres    false    223            >           0    0    usuario_id_usuario_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.usuario_id_usuario_seq', 7, true);
          public          postgres    false    224            �           2606    32886    Ciudad Ciudad_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public."Ciudad"
    ADD CONSTRAINT "Ciudad_pkey" PRIMARY KEY ("IdCiudad");
 @   ALTER TABLE ONLY public."Ciudad" DROP CONSTRAINT "Ciudad_pkey";
       public            postgres    false    214            �           2606    32888    Cliente Cliente_pkey 
   CONSTRAINT     _   ALTER TABLE ONLY public."Cliente"
    ADD CONSTRAINT "Cliente_pkey" PRIMARY KEY ("IdCliente");
 B   ALTER TABLE ONLY public."Cliente" DROP CONSTRAINT "Cliente_pkey";
       public            postgres    false    216            �           2606    32890    Cuentas Cuentas_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public."Cuentas"
    ADD CONSTRAINT "Cuentas_pkey" PRIMARY KEY ("IdCuenta");
 B   ALTER TABLE ONLY public."Cuentas" DROP CONSTRAINT "Cuentas_pkey";
       public            postgres    false    218            �           2606    32892    Movimientos Movimientos_pkey 
   CONSTRAINT     j   ALTER TABLE ONLY public."Movimientos"
    ADD CONSTRAINT "Movimientos_pkey" PRIMARY KEY ("IdMovimiento");
 J   ALTER TABLE ONLY public."Movimientos" DROP CONSTRAINT "Movimientos_pkey";
       public            postgres    false    220            �           2606    32894    Persona Persona_pkey 
   CONSTRAINT     _   ALTER TABLE ONLY public."Persona"
    ADD CONSTRAINT "Persona_pkey" PRIMARY KEY ("IdPersona");
 B   ALTER TABLE ONLY public."Persona" DROP CONSTRAINT "Persona_pkey";
       public            postgres    false    222            �           2606    32918    usuario usuario_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT usuario_pkey PRIMARY KEY (id_usuario);
 >   ALTER TABLE ONLY public.usuario DROP CONSTRAINT usuario_pkey;
       public            postgres    false    225            �           2606    32895    Cliente ClientePersona    FK CONSTRAINT     �   ALTER TABLE ONLY public."Cliente"
    ADD CONSTRAINT "ClientePersona" FOREIGN KEY ("IdPersona") REFERENCES public."Persona"("IdPersona") ON UPDATE CASCADE ON DELETE CASCADE;
 D   ALTER TABLE ONLY public."Cliente" DROP CONSTRAINT "ClientePersona";
       public          postgres    false    222    3213    216            �           2606    32900    Cuentas CuentasCliente    FK CONSTRAINT     �   ALTER TABLE ONLY public."Cuentas"
    ADD CONSTRAINT "CuentasCliente" FOREIGN KEY ("IdCliente") REFERENCES public."Cliente"("IdCliente") ON UPDATE CASCADE ON DELETE CASCADE;
 D   ALTER TABLE ONLY public."Cuentas" DROP CONSTRAINT "CuentasCliente";
       public          postgres    false    216    218    3207            �           2606    32905    Movimientos MovimientosCuentas    FK CONSTRAINT     �   ALTER TABLE ONLY public."Movimientos"
    ADD CONSTRAINT "MovimientosCuentas" FOREIGN KEY ("IdCuenta") REFERENCES public."Cuentas"("IdCuenta") ON UPDATE CASCADE ON DELETE CASCADE;
 L   ALTER TABLE ONLY public."Movimientos" DROP CONSTRAINT "MovimientosCuentas";
       public          postgres    false    3209    218    220            !      x������ � �      #      x������ � �      %      x������ � �      '      x������ � �      )      x������ � �      ,   K   x�3��*M��4426�2��M,�̇p�9�!LN�Ģ��b���$3�3�HM)��1�tI��L������ U:X     