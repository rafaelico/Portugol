package br.univali.portugol.integracao.asa;


/**
* br/univali/portugol/integracao/asa/NoDecrementoHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from D:/Luiz Fernando/Documentos/Projetos/Portugol_X/Codigo-Fonte/Portugol-Integracao/src/br/univali/portugol/integracao/Portugol.idl
* Quarta-feira, 2 de Maio de 2012 07h25min01s BRT
*/


//==========================================================================================//
abstract public class NoDecrementoHelper
{
  private static String  _id = "IDL:br/univali/portugol/integracao/asa/NoDecremento:1.0";

  public static void insert (org.omg.CORBA.Any a, br.univali.portugol.integracao.asa.NoDecremento that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static br.univali.portugol.integracao.asa.NoDecremento extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (br.univali.portugol.integracao.asa.NoDecrementoHelper.id (), "NoDecremento");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static br.univali.portugol.integracao.asa.NoDecremento read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_NoDecrementoStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, br.univali.portugol.integracao.asa.NoDecremento value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static br.univali.portugol.integracao.asa.NoDecremento narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof br.univali.portugol.integracao.asa.NoDecremento)
      return (br.univali.portugol.integracao.asa.NoDecremento)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      br.univali.portugol.integracao.asa._NoDecrementoStub stub = new br.univali.portugol.integracao.asa._NoDecrementoStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static br.univali.portugol.integracao.asa.NoDecremento unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof br.univali.portugol.integracao.asa.NoDecremento)
      return (br.univali.portugol.integracao.asa.NoDecremento)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      br.univali.portugol.integracao.asa._NoDecrementoStub stub = new br.univali.portugol.integracao.asa._NoDecrementoStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
