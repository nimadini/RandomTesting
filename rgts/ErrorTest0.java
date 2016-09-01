
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test1"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    arraylist_str0.trimToSize();
    java.util.ArrayList<java.lang.String> arraylist_str7 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "" };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str7, str_array10);
    java.util.Collection<java.lang.String> collection_str12 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str7);
    arraylist_str7.trimToSize();
    java.util.Iterator<java.lang.String> iterator_str14 = arraylist_str7.iterator();
    java.util.Iterator<java.lang.String> iterator_str15 = arraylist_str7.iterator();
    java.util.ArrayList<java.util.Collections> arraylist_collections16 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array17 = new java.util.Collections[] {  };
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections16, collections_array17);
    java.util.Collections collections19 = null;
    java.util.Comparator<java.lang.Object> comparator_obj20 = null;
    int i21 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections16, collections19, comparator_obj20);
    java.util.Collection<java.util.Collections> collection_collections22 = java.util.Collections.unmodifiableCollection((java.util.Collection<java.util.Collections>)arraylist_collections16);
    boolean b23 = arraylist_str7.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections16);
    boolean b24 = arraylist_str0.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections16);
    java.lang.String str25 = arraylist_str0.toString();
    java.lang.Object obj26 = arraylist_str0.clone();
    java.util.List<java.lang.String> list_str29 = arraylist_str0.subList(0, 0);
    arraylist_str0.clear();
    
    // This assertion (symmetry of equals) fails 
    org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arraylist_str7 and list_str29.", arraylist_str7.equals(list_str29) == list_str29.equals(arraylist_str7));

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test2"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    arraylist_str0.trimToSize();
    java.util.ArrayList<java.lang.String> arraylist_str7 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "" };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str7, str_array10);
    java.util.Collection<java.lang.String> collection_str12 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str7);
    arraylist_str7.trimToSize();
    java.util.Iterator<java.lang.String> iterator_str14 = arraylist_str7.iterator();
    java.util.Iterator<java.lang.String> iterator_str15 = arraylist_str7.iterator();
    java.util.ArrayList<java.util.Collections> arraylist_collections16 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array17 = new java.util.Collections[] {  };
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections16, collections_array17);
    java.util.Collections collections19 = null;
    java.util.Comparator<java.lang.Object> comparator_obj20 = null;
    int i21 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections16, collections19, comparator_obj20);
    java.util.Collection<java.util.Collections> collection_collections22 = java.util.Collections.unmodifiableCollection((java.util.Collection<java.util.Collections>)arraylist_collections16);
    boolean b23 = arraylist_str7.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections16);
    boolean b24 = arraylist_str0.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections16);
    java.lang.String str25 = arraylist_str0.toString();
    java.lang.Object obj26 = arraylist_str0.clone();
    java.util.List<java.lang.String> list_str29 = arraylist_str0.subList(0, 0);
    java.util.Comparator<java.lang.String> comparator_str30 = null;
    arraylist_str0.sort(comparator_str30);
    
    // Checks the contract:  equals-hashcode on list_str29 and list_str29
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on list_str29 and list_str29", list_str29.equals(list_str29) ? list_str29.hashCode() == list_str29.hashCode() : true);

  }

}
