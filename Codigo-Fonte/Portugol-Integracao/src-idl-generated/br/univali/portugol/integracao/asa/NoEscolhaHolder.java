package br.univali.portugol.integracao.asa;

/**
* br/univali/portugol/integracao/asa/NoEscolhaHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from D:/Luiz Fernando/Documentos/Projetos/Portugol_X/Codigo-Fonte/Portugol-Integracao/src/br/univali/portugol/integracao/Portugol.idl
* Quarta-feira, 2 de Maio de 2012 07h25min01s BRT
*/


//==========================================================================================//
public final class NoEscolhaHolder implements org.omg.CORBA.portable.Streamable
{
  public br.univali.portugol.integracao.asa.NoEscolha value = null;

  public NoEscolhaHolder ()
  {
  }

  public NoEscolhaHolder (br.univali.portugol.integracao.asa.NoEscolha initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = br.univali.portugol.integracao.asa.NoEscolhaHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    br.univali.portugol.integracao.asa.NoEscolhaHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return br.univali.portugol.integracao.asa.NoEscolhaHelper.type ();
  }

}
