package br.univali.portugol.integracao.asa;

/**
* br/univali/portugol/integracao/asa/NoReferenciaVetorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from D:/Luiz Fernando/Documentos/Projetos/Portugol_X/Codigo-Fonte/Portugol-Integracao/src/br/univali/portugol/integracao/Portugol.idl
* Quarta-feira, 2 de Maio de 2012 07h25min01s BRT
*/


//==========================================================================================//
public final class NoReferenciaVetorHolder implements org.omg.CORBA.portable.Streamable
{
  public br.univali.portugol.integracao.asa.NoReferenciaVetor value = null;

  public NoReferenciaVetorHolder ()
  {
  }

  public NoReferenciaVetorHolder (br.univali.portugol.integracao.asa.NoReferenciaVetor initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = br.univali.portugol.integracao.asa.NoReferenciaVetorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    br.univali.portugol.integracao.asa.NoReferenciaVetorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return br.univali.portugol.integracao.asa.NoReferenciaVetorHelper.type ();
  }

}
