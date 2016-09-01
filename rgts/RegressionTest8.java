
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test01"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, (-1) };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array3);
    java.lang.Integer i5 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i0);
    int i7 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i0, (java.lang.Integer)(-3));
    int i9 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i0, (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-3));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test02"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i2 = arraylist_str1.size();
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str1);
    arraylist_str1.ensureCapacity(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test03"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    arraylist_str0.add((int)(byte)1, "hi!");
    java.util.ArrayList<java.lang.String> arraylist_str8 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "" };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str8, str_array11);
    java.util.Collection<java.lang.String> collection_str13 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str8);
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i17 = arraylist_str16.size();
    boolean b18 = arraylist_str8.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str16);
    boolean b19 = arraylist_str0.addAll((java.util.Collection<java.lang.String>)arraylist_str8);
    java.util.Spliterator<java.lang.String> spliterator_str20 = arraylist_str8.spliterator();
    java.util.List<java.lang.String> list_str24 = java.util.Collections.nCopies(0, "[hi!]");
    // The following exception was thrown during execution in test generation
    try {
    boolean b25 = arraylist_str8.addAll((int)' ', (java.util.Collection<java.lang.String>)list_str24);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test04"); }


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
    java.util.Spliterator<java.lang.String> spliterator_str27 = arraylist_str0.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_collections22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[hi!, ]"+ "'", str25.equals("[hi!, ]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str27);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test05"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    java.util.ArrayList<java.lang.String> arraylist_str8 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i9 = arraylist_str8.size();
    boolean b10 = arraylist_str0.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str8);
    java.util.ArrayList<java.util.Collections> arraylist_collections11 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array12 = new java.util.Collections[] {  };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections11, collections_array12);
    java.util.Collections collections14 = null;
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    int i16 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections11, collections14, comparator_obj15);
    java.util.Collection<java.util.Collections> collection_collections17 = java.util.Collections.unmodifiableCollection((java.util.Collection<java.util.Collections>)arraylist_collections11);
    java.util.List<java.util.Collections> list_collections18 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections11);
    boolean b19 = arraylist_str0.remove((java.lang.Object)arraylist_collections11);
    java.lang.String str22 = arraylist_str0.set((int)(short)0, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_collections17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test06"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    int i7 = arraylist_str0.lastIndexOf((java.lang.Object)10L);
    java.lang.Object obj8 = arraylist_str0.clone();
    arraylist_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test07"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    arraylist_str0.trimToSize();
    java.lang.String str8 = arraylist_str0.remove((int)(byte)1);
    java.lang.Object[] obj_array9 = arraylist_str0.toArray();
    java.lang.Object obj10 = arraylist_str0.clone();
    java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!", "" };
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str11, str_array14);
    java.util.Collection<java.lang.String> collection_str16 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str11);
    arraylist_str11.trimToSize();
    java.util.Iterator<java.lang.String> iterator_str18 = arraylist_str11.iterator();
    java.util.ListIterator<java.lang.String> listiterator_str19 = arraylist_str11.listIterator();
    java.util.ArrayList<java.util.Collections> arraylist_collections20 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array21 = new java.util.Collections[] {  };
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections20, collections_array21);
    boolean b23 = arraylist_str11.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections20);
    java.util.ArrayList<java.lang.Long> arraylist_long24 = new java.util.ArrayList<java.lang.Long>();
    java.lang.Long[] long_array30 = new java.lang.Long[] { 10L, 100L, 100L, 10L, 10L };
    boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long24, long_array30);
    java.lang.Long long32 = java.util.Collections.max((java.util.Collection<java.lang.Long>)arraylist_long24);
    boolean b33 = arraylist_str11.remove((java.lang.Object)long32);
    java.lang.String str35 = arraylist_str11.remove(0);
    java.util.List<java.lang.Boolean> list_b37 = java.util.Collections.singletonList((java.lang.Boolean)true);
    boolean b38 = arraylist_str11.containsAll((java.util.Collection<java.lang.Boolean>)list_b37);
    int i39 = arraylist_str0.indexOf((java.lang.Object)arraylist_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L+ "'", long32.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == (-1));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test08"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.lang.Object[] obj_array5 = arraylist_str0.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long6 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long6, long_array11);
    java.util.NavigableSet<java.lang.Long> navigableset_long13 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long6);
    int i14 = arraylist_str0.lastIndexOf((java.lang.Object)treeset_long6);
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str0);
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>((java.util.Collection<java.lang.String>)arraylist_str0);
    int i18 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)arraylist_str16, (java.lang.Object)(byte)100);
    java.util.ArrayList<java.lang.Boolean> arraylist_b19 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array21 = new java.lang.Boolean[] { false };
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b19, b_array21);
    java.util.Comparator<java.lang.Object> comparator_obj23 = null;
    java.util.Comparator<java.lang.Object> comparator_obj24 = java.util.Collections.reverseOrder(comparator_obj23);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b19, comparator_obj23);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b19);
    boolean b27 = arraylist_str16.containsAll((java.util.Collection<java.lang.Boolean>)arraylist_b19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test09"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    java.util.ArrayList<java.lang.String> arraylist_str8 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i9 = arraylist_str8.size();
    boolean b10 = arraylist_str0.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str8);
    boolean b12 = arraylist_str0.equals((java.lang.Object)(short)1);
    java.lang.Long[] long_array13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Long[] long_array14 = arraylist_str0.toArray(long_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test10"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, (-1) };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array3);
    java.lang.Integer i5 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i0);
    int i7 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i0, (java.lang.Integer)(-3));
    int i9 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i0, (java.lang.Integer)(-3));
    int i11 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i0, (java.lang.Integer)5);
    int i13 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i0, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test11"); }


    java.util.Map<java.lang.String,java.lang.String> map_str_str0 = java.util.Collections.emptyMap();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = java.util.Collections.synchronizedMap(map_str_str0);
    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = java.util.Collections.synchronizedMap(map_str_str1);
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = java.util.Collections.synchronizedMap(map_str_str1);
    java.util.Map<java.lang.String,java.lang.String> map_str_str4 = java.util.Collections.synchronizedMap(map_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str4);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test12"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.lang.Object[] obj_array5 = arraylist_str0.toArray();
    java.lang.Object obj6 = null;
    int i7 = arraylist_str0.indexOf(obj6);
    java.util.stream.Stream<java.lang.String> stream_str8 = arraylist_str0.parallelStream();
    java.util.ArrayList<java.lang.String> arraylist_str10 = new java.util.ArrayList<java.lang.String>((int)'4');
    java.lang.Long[] long_array11 = new java.lang.Long[] {  };
    java.lang.Long[] long_array12 = arraylist_str10.toArray(long_array11);
    java.util.Set<java.lang.Object[]> set_obj_array13 = java.util.Collections.singleton((java.lang.Object[])long_array12);
    boolean b14 = arraylist_str0.equals((java.lang.Object)long_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test13"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.lang.Object[] obj_array5 = arraylist_str0.toArray();
    java.util.ArrayDeque<java.lang.String> arraydeque_str6 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str6, str_array8);
    java.util.Queue<java.lang.String> queue_str10 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str6);
    boolean b11 = arraylist_str0.contains((java.lang.Object)arraydeque_str6);
    java.util.Queue<java.lang.String> queue_str12 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str6);
    java.util.stream.Stream<java.lang.String> stream_str13 = queue_str12.parallelStream();
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array17);
    java.lang.Object[] obj_array19 = arraylist_str14.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long20 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array25 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b26 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long20, long_array25);
    java.util.NavigableSet<java.lang.Long> navigableset_long27 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long20);
    int i28 = arraylist_str14.lastIndexOf((java.lang.Object)treeset_long20);
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str14);
    int i31 = arraylist_str14.lastIndexOf((java.lang.Object)2);
    boolean b32 = arraylist_str14.isEmpty();
    int i33 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)queue_str12, (java.lang.Object)arraylist_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test14"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, (-1) };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array3);
    java.lang.Integer i5 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i0);
    int i7 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i0, (java.lang.Integer)10);
    java.util.ArrayList<java.lang.Integer> arraylist_i8 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array10 = new java.lang.Integer[] { 5 };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i8, i_array10);
    int i12 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i0, (java.util.List<java.lang.Integer>)arraylist_i8);
    int i14 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i8, (java.lang.Integer)4);
    int i16 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i8, (java.lang.Integer)5);
    java.util.List<java.lang.Integer> list_i17 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i18 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i8, list_i17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test15"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str2 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str2, str_array5);
    java.lang.Object[] obj_array7 = arraylist_str2.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long8 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array13 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long8, long_array13);
    java.util.NavigableSet<java.lang.Long> navigableset_long15 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long8);
    int i16 = arraylist_str2.lastIndexOf((java.lang.Object)treeset_long8);
    java.lang.String str18 = arraylist_str2.remove((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array22 = new java.lang.String[] { "hi!", "" };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str19, str_array22);
    arraylist_str19.add((int)(byte)1, "hi!");
    int i27 = arraylist_str2.lastIndexOf((java.lang.Object)"hi!");
    boolean b28 = arraylist_str1.addAll((java.util.Collection<java.lang.String>)arraylist_str2);
    java.util.List<java.lang.String> list_str29 = java.util.Collections.synchronizedList((java.util.List<java.lang.String>)arraylist_str2);
    java.util.ArrayList<java.lang.String> arraylist_str30 = new java.util.ArrayList<java.lang.String>((java.util.Collection<java.lang.String>)list_str29);
    java.util.Spliterator<java.lang.String> spliterator_str31 = arraylist_str30.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str31);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test16"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    arraylist_str0.clear();
    java.util.ArrayList<java.lang.String> arraylist_str7 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str7, str_array10);
    java.lang.Object[] obj_array12 = arraylist_str7.toArray();
    java.util.ArrayDeque<java.lang.String> arraydeque_str13 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str13, str_array15);
    java.util.Queue<java.lang.String> queue_str17 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str13);
    boolean b18 = arraylist_str7.contains((java.lang.Object)arraydeque_str13);
    java.util.ArrayList<java.lang.Boolean> arraylist_b19 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array22 = new java.lang.Boolean[] { false, false };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b19, b_array22);
    boolean b24 = arraydeque_str13.containsAll((java.util.Collection<java.lang.Boolean>)arraylist_b19);
    boolean b25 = arraylist_str0.containsAll((java.util.Collection<java.lang.Boolean>)arraylist_b19);
    java.lang.Object obj26 = arraylist_str0.clone();
    java.util.ListIterator<java.lang.String> listiterator_str28 = arraylist_str0.listIterator((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_str28);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test17"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.lang.Object[] obj_array5 = arraylist_str0.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long6 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long6, long_array11);
    java.util.NavigableSet<java.lang.Long> navigableset_long13 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long6);
    int i14 = arraylist_str0.lastIndexOf((java.lang.Object)treeset_long6);
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str0);
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>((java.util.Collection<java.lang.String>)arraylist_str0);
    java.util.ArrayList<java.lang.Object> arraylist_obj17 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.lang.Long> arraylist_long18 = new java.util.ArrayList<java.lang.Long>();
    java.lang.Long[] long_array21 = new java.lang.Long[] { 10L, 10L };
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long18, long_array21);
    java.lang.Long long23 = java.util.Collections.max((java.util.Collection<java.lang.Long>)arraylist_long18);
    boolean b26 = java.util.Collections.replaceAll((java.util.List<java.lang.Long>)arraylist_long18, (java.lang.Long)100L, (java.lang.Long)100L);
    java.util.List<java.lang.String> list_str30 = java.util.Collections.nCopies(0, "[hi!]");
    java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str33 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array36 = new java.lang.String[] { "", "hi!" };
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str33, str_array36);
    java.lang.Object[] obj_array38 = arraylist_str33.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long39 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array44 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b45 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long39, long_array44);
    java.util.NavigableSet<java.lang.Long> navigableset_long46 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long39);
    int i47 = arraylist_str33.lastIndexOf((java.lang.Object)treeset_long39);
    java.lang.String str49 = arraylist_str33.remove((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str50 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array53 = new java.lang.String[] { "hi!", "" };
    boolean b54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str50, str_array53);
    arraylist_str50.add((int)(byte)1, "hi!");
    int i58 = arraylist_str33.lastIndexOf((java.lang.Object)"hi!");
    boolean b59 = arraylist_str32.addAll((java.util.Collection<java.lang.String>)arraylist_str33);
    java.util.stream.Stream<java.lang.String> stream_str60 = arraylist_str33.stream();
    java.util.ArrayList<java.lang.String> arraylist_str61 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array64 = new java.lang.String[] { "hi!", "" };
    boolean b65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str61, str_array64);
    java.util.Collection<java.lang.String> collection_str66 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str61);
    arraylist_str61.trimToSize();
    java.util.Iterator<java.lang.String> iterator_str68 = arraylist_str61.iterator();
    java.util.Iterator<java.lang.String> iterator_str69 = arraylist_str61.iterator();
    java.lang.Object[] obj_array70 = new java.lang.Object[] { arraylist_long18, (short)10, list_str30, stream_str60, arraylist_str61 };
    boolean b71 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj17, obj_array70);
    boolean b72 = arraylist_str16.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj17);
    java.util.ArrayList<java.lang.Object[]> arraylist_obj_array73 = new java.util.ArrayList<java.lang.Object[]>();
    java.util.ArrayList<java.lang.String> arraylist_str74 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array77 = new java.lang.String[] { "", "hi!" };
    boolean b78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str74, str_array77);
    java.lang.Object[] obj_array79 = arraylist_str74.toArray();
    java.lang.Object[][] obj_array_array80 = new java.lang.Object[][] { obj_array79 };
    boolean b81 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)arraylist_obj_array73, obj_array_array80);
    java.util.Random random82 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array73, random82);
    java.util.Random random84 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array73, random84);
    java.util.Collections.copy((java.util.List<java.lang.Object>)arraylist_obj17, (java.util.List<java.lang.Object[]>)arraylist_obj_array73);
    java.util.Random random87 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array73, random87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L+ "'", long23.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!"+ "'", str49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test18"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>((int)'4');
    java.lang.Long[] long_array2 = new java.lang.Long[] {  };
    java.lang.Long[] long_array3 = arraylist_str1.toArray(long_array2);
    java.util.Set<java.lang.Object[]> set_obj_array4 = java.util.Collections.singleton((java.lang.Object[])long_array3);
    java.util.Comparator<java.lang.Object[]> comparator_obj_array5 = null;
    java.lang.Object[] obj_array6 = java.util.Collections.max((java.util.Collection<java.lang.Object[]>)set_obj_array4, comparator_obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test19"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>((int)'4');
    java.util.ArrayList<java.lang.String> arraylist_str2 = new java.util.ArrayList<java.lang.String>((java.util.Collection<java.lang.String>)arraylist_str1);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test20"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    java.util.ArrayList<java.lang.String> arraylist_str8 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i9 = arraylist_str8.size();
    boolean b10 = arraylist_str0.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str8);
    java.util.ListIterator<java.lang.String> listiterator_str11 = arraylist_str8.listIterator();
    java.util.ArrayDeque<java.lang.String> arraydeque_str12 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str12, str_array14);
    java.util.Queue<java.lang.String> queue_str16 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str12);
    int i17 = arraylist_str8.lastIndexOf((java.lang.Object)queue_str16);
    java.lang.Object obj18 = null;
    int i19 = arraylist_str8.lastIndexOf(obj18);
    boolean b21 = arraylist_str8.add("[, hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test21"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.lang.Object[] obj_array5 = arraylist_str0.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long6 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long6, long_array11);
    java.util.NavigableSet<java.lang.Long> navigableset_long13 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long6);
    int i14 = arraylist_str0.lastIndexOf((java.lang.Object)treeset_long6);
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str0);
    boolean b17 = arraylist_str0.add("[]");
    java.util.ArrayList<java.util.Collections> arraylist_collections18 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array19 = new java.util.Collections[] {  };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections18, collections_array19);
    java.util.Collections collections21 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections18, collections21);
    java.util.Collections collections23 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections18, collections23);
    java.util.Collections collections25 = null;
    java.util.Comparator<java.lang.Object> comparator_obj26 = null;
    int i27 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections18, collections25, comparator_obj26);
    boolean b28 = arraylist_str0.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test22"); }


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
    java.util.ArrayList<java.util.Collections> arraylist_collections26 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array27 = new java.util.Collections[] {  };
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections26, collections_array27);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections26);
    boolean b30 = arraylist_str0.contains((java.lang.Object)arraylist_collections26);
    java.util.Collections collections31 = null;
    java.util.List<java.lang.Boolean> list_b33 = java.util.Collections.singletonList((java.lang.Boolean)true);
    java.util.ArrayList<java.util.Collections> arraylist_collections34 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array35 = new java.util.Collections[] {  };
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections34, collections_array35);
    java.util.Collections collections37 = null;
    java.util.Comparator<java.lang.Object> comparator_obj38 = null;
    int i39 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections34, collections37, comparator_obj38);
    java.util.Collections collections40 = null;
    java.util.Comparator<java.lang.Object> comparator_obj41 = null;
    java.util.Comparator<java.lang.Object> comparator_obj42 = java.util.Collections.reverseOrder(comparator_obj41);
    java.util.Comparator<java.lang.Object> comparator_obj43 = java.util.Collections.reverseOrder(comparator_obj42);
    int i44 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections34, collections40, comparator_obj42);
    java.util.Collections.sort(list_b33, comparator_obj42);
    java.util.Comparator<java.lang.Object> comparator_obj46 = java.util.Collections.reverseOrder(comparator_obj42);
    int i47 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections26, collections31, comparator_obj46);
    java.util.Collections collections48 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections26, collections48);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_collections22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[hi!, ]"+ "'", str25.equals("[hi!, ]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == (-1));

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test23"); }


    java.util.List<java.lang.Boolean> list_b1 = java.util.Collections.singletonList((java.lang.Boolean)true);
    java.util.ArrayList<java.util.Collections> arraylist_collections2 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array3 = new java.util.Collections[] {  };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections2, collections_array3);
    java.util.Collections collections5 = null;
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    int i7 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections2, collections5, comparator_obj6);
    java.util.Collections collections8 = null;
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    java.util.Comparator<java.lang.Object> comparator_obj10 = java.util.Collections.reverseOrder(comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = java.util.Collections.reverseOrder(comparator_obj10);
    int i12 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections2, collections8, comparator_obj10);
    java.util.Collections.sort(list_b1, comparator_obj10);
    java.util.ArrayList<java.util.Collections> arraylist_collections14 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array15 = new java.util.Collections[] {  };
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections14, collections_array15);
    java.util.Collections collections17 = null;
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    int i19 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections14, collections17, comparator_obj18);
    java.util.Collections collections20 = null;
    java.util.Comparator<java.lang.Object> comparator_obj21 = null;
    java.util.Comparator<java.lang.Object> comparator_obj22 = java.util.Collections.reverseOrder(comparator_obj21);
    java.util.Comparator<java.lang.Object> comparator_obj23 = java.util.Collections.reverseOrder(comparator_obj22);
    int i24 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections14, collections20, comparator_obj22);
    java.util.Collections.sort(list_b1, comparator_obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test24"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    arraylist_str0.trimToSize();
    java.util.Iterator<java.lang.String> iterator_str7 = arraylist_str0.iterator();
    java.util.Iterator<java.lang.String> iterator_str8 = arraylist_str0.iterator();
    java.util.ArrayList<java.util.Collections> arraylist_collections9 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array10 = new java.util.Collections[] {  };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections9, collections_array10);
    java.util.Collections collections12 = null;
    java.util.Comparator<java.lang.Object> comparator_obj13 = null;
    int i14 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections9, collections12, comparator_obj13);
    java.util.Collection<java.util.Collections> collection_collections15 = java.util.Collections.unmodifiableCollection((java.util.Collection<java.util.Collections>)arraylist_collections9);
    boolean b16 = arraylist_str0.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections9);
    java.lang.Object[] obj_array17 = arraylist_str0.toArray();
    java.util.Collection<java.lang.Boolean> collection_b18 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = arraylist_str0.containsAll(collection_b18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_collections15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test25"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i2 = arraylist_str1.size();
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str1);
    java.util.ArrayList<java.lang.String> arraylist_str4 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str4, str_array7);
    java.lang.Object[] obj_array9 = arraylist_str4.toArray();
    java.util.ArrayDeque<java.lang.String> arraydeque_str10 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array12 = new java.lang.String[] { "hi!" };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str10, str_array12);
    java.util.Queue<java.lang.String> queue_str14 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str10);
    boolean b15 = arraylist_str4.contains((java.lang.Object)arraydeque_str10);
    java.util.ArrayList<java.lang.Boolean> arraylist_b16 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array19 = new java.lang.Boolean[] { false, false };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b16, b_array19);
    boolean b21 = arraydeque_str10.containsAll((java.util.Collection<java.lang.Boolean>)arraylist_b16);
    java.util.stream.Stream<java.lang.String> stream_str22 = arraydeque_str10.stream();
    int i23 = arraylist_str1.lastIndexOf((java.lang.Object)stream_str22);
    boolean b25 = arraylist_str1.contains((java.lang.Object)1.0f);
    java.util.Comparator<java.lang.String> comparator_str26 = null;
    arraylist_str1.sort(comparator_str26);
    java.lang.String str28 = arraylist_str1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]"+ "'", str28.equals("[]"));

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test26"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, (-1) };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array3);
    java.lang.Integer i5 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i0);
    int i7 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i0, (java.lang.Integer)10);
    java.util.ArrayList<java.lang.Integer> arraylist_i8 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array10 = new java.lang.Integer[] { 5 };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i8, i_array10);
    int i12 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i0, (java.util.List<java.lang.Integer>)arraylist_i8);
    java.util.List<java.lang.Integer> list_i13 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i14 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i8, list_i13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test27"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    int i7 = arraylist_str0.lastIndexOf((java.lang.Object)10L);
    java.util.stream.Stream<java.lang.String> stream_str8 = arraylist_str0.parallelStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str8);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test28"); }


    java.util.ArrayList<java.util.Collections> arraylist_collections0 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array1 = new java.util.Collections[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections0, collections_array1);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections0);
    java.util.Collections collections4 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections0, collections4);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections0);
    java.util.List<java.util.Collections> list_collections7 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections7);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test29"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>(10);
    java.util.Iterator<java.lang.String> iterator_str2 = arraylist_str1.iterator();
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "" };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array6);
    arraylist_str3.add((int)(byte)1, "hi!");
    java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!", "" };
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str11, str_array14);
    java.util.Collection<java.lang.String> collection_str16 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str11);
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i20 = arraylist_str19.size();
    boolean b21 = arraylist_str11.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str19);
    boolean b22 = arraylist_str3.addAll((java.util.Collection<java.lang.String>)arraylist_str11);
    java.util.Set<java.util.Random> set_random23 = java.util.Collections.emptySet();
    boolean b24 = arraylist_str3.contains((java.lang.Object)set_random23);
    java.util.NavigableSet<java.util.Collections> navigableset_collections25 = java.util.Collections.emptyNavigableSet();
    boolean b26 = arraylist_str3.removeAll((java.util.Collection<java.util.Collections>)navigableset_collections25);
    arraylist_str3.clear();
    boolean b28 = arraylist_str1.remove((java.lang.Object)arraylist_str3);
    int i29 = arraylist_str1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_random23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_collections25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test30"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str2 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str2, str_array5);
    java.lang.Object[] obj_array7 = arraylist_str2.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long8 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array13 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long8, long_array13);
    java.util.NavigableSet<java.lang.Long> navigableset_long15 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long8);
    int i16 = arraylist_str2.lastIndexOf((java.lang.Object)treeset_long8);
    java.lang.String str18 = arraylist_str2.remove((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array22 = new java.lang.String[] { "hi!", "" };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str19, str_array22);
    arraylist_str19.add((int)(byte)1, "hi!");
    int i27 = arraylist_str2.lastIndexOf((java.lang.Object)"hi!");
    boolean b28 = arraylist_str1.addAll((java.util.Collection<java.lang.String>)arraylist_str2);
    java.util.stream.Stream<java.lang.String> stream_str29 = arraylist_str2.stream();
    java.lang.String str30 = arraylist_str2.toString();
    java.util.Comparator<java.lang.String> comparator_str31 = null;
    arraylist_str2.sort(comparator_str31);
    java.util.Comparator<java.lang.String> comparator_str33 = null;
    arraylist_str2.sort(comparator_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]"+ "'", str30.equals("[]"));

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test31"); }


    java.util.TreeSet<java.lang.Integer> treeset_i0 = new java.util.TreeSet<java.lang.Integer>();
    java.lang.Integer[] i_array5 = new java.lang.Integer[] { (-1), 1, 10, 10 };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)treeset_i0, i_array5);
    java.util.SortedSet<java.lang.Integer> sortedset_i7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.Integer>)treeset_i0);
    java.util.SortedSet<java.lang.Integer> sortedset_i8 = java.util.Collections.synchronizedSortedSet(sortedset_i7);
    java.util.Set<java.lang.Integer> set_i9 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)sortedset_i8);
    java.util.SortedSet<java.lang.Integer> sortedset_i10 = java.util.Collections.synchronizedSortedSet(sortedset_i8);
    java.util.SortedSet<java.lang.Integer> sortedset_i11 = java.util.Collections.synchronizedSortedSet(sortedset_i8);
    java.lang.Integer i12 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)sortedset_i11);
    java.lang.Integer i13 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)sortedset_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test32"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str2 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str2, str_array5);
    java.lang.Object[] obj_array7 = arraylist_str2.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long8 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array13 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long8, long_array13);
    java.util.NavigableSet<java.lang.Long> navigableset_long15 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long8);
    int i16 = arraylist_str2.lastIndexOf((java.lang.Object)treeset_long8);
    java.lang.String str18 = arraylist_str2.remove((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array22 = new java.lang.String[] { "hi!", "" };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str19, str_array22);
    arraylist_str19.add((int)(byte)1, "hi!");
    int i27 = arraylist_str2.lastIndexOf((java.lang.Object)"hi!");
    boolean b28 = arraylist_str1.addAll((java.util.Collection<java.lang.String>)arraylist_str2);
    java.util.List<java.lang.String> list_str29 = java.util.Collections.synchronizedList((java.util.List<java.lang.String>)arraylist_str2);
    java.util.ArrayList<java.lang.String> arraylist_str30 = new java.util.ArrayList<java.lang.String>((java.util.Collection<java.lang.String>)list_str29);
    java.util.ListIterator<java.lang.String> listiterator_str32 = arraylist_str30.listIterator((int)(short)0);
    java.util.List<java.lang.String> list_str33 = java.util.Collections.synchronizedList((java.util.List<java.lang.String>)arraylist_str30);
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str30);
    java.lang.Object obj35 = arraylist_str30.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj35);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test33"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    arraylist_str0.trimToSize();
    java.util.Iterator<java.lang.String> iterator_str7 = arraylist_str0.iterator();
    java.util.ListIterator<java.lang.String> listiterator_str8 = arraylist_str0.listIterator();
    java.util.ArrayList<java.util.Collections> arraylist_collections9 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array10 = new java.util.Collections[] {  };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections9, collections_array10);
    boolean b12 = arraylist_str0.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections9);
    java.util.ArrayList<java.lang.Long> arraylist_long13 = new java.util.ArrayList<java.lang.Long>();
    java.lang.Long[] long_array19 = new java.lang.Long[] { 10L, 100L, 100L, 10L, 10L };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long13, long_array19);
    java.lang.Long long21 = java.util.Collections.max((java.util.Collection<java.lang.Long>)arraylist_long13);
    boolean b22 = arraylist_str0.remove((java.lang.Object)long21);
    java.util.ListIterator<java.lang.String> listiterator_str23 = arraylist_str0.listIterator();
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L+ "'", long21.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_str23);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test34"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    arraylist_str0.add((int)(byte)1, "hi!");
    java.util.ArrayList<java.lang.String> arraylist_str8 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "" };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str8, str_array11);
    java.util.Collection<java.lang.String> collection_str13 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str8);
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i17 = arraylist_str16.size();
    boolean b18 = arraylist_str8.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str16);
    boolean b19 = arraylist_str0.addAll((java.util.Collection<java.lang.String>)arraylist_str8);
    java.util.Collection<java.lang.String> collection_str20 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    int i21 = arraylist_str0.size();
    int i23 = arraylist_str0.lastIndexOf((java.lang.Object)'a');
    java.util.List<java.lang.Boolean> list_b25 = java.util.Collections.singletonList((java.lang.Boolean)true);
    java.util.ArrayList<java.util.Collections> arraylist_collections26 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array27 = new java.util.Collections[] {  };
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections26, collections_array27);
    java.util.Collections collections29 = null;
    java.util.Comparator<java.lang.Object> comparator_obj30 = null;
    int i31 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections26, collections29, comparator_obj30);
    java.util.Collections collections32 = null;
    java.util.Comparator<java.lang.Object> comparator_obj33 = null;
    java.util.Comparator<java.lang.Object> comparator_obj34 = java.util.Collections.reverseOrder(comparator_obj33);
    java.util.Comparator<java.lang.Object> comparator_obj35 = java.util.Collections.reverseOrder(comparator_obj34);
    int i36 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections26, collections32, comparator_obj34);
    java.util.Collections.sort(list_b25, comparator_obj34);
    java.util.Comparator<java.lang.Object> comparator_obj38 = java.util.Collections.reverseOrder(comparator_obj34);
    int i39 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)arraylist_str0, (java.lang.Object)comparator_obj38);
    java.util.ListIterator<java.lang.String> listiterator_str41 = arraylist_str0.listIterator(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_str41);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test35"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str2 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str2, str_array5);
    java.lang.Object[] obj_array7 = arraylist_str2.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long8 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array13 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long8, long_array13);
    java.util.NavigableSet<java.lang.Long> navigableset_long15 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long8);
    int i16 = arraylist_str2.lastIndexOf((java.lang.Object)treeset_long8);
    java.lang.String str18 = arraylist_str2.remove((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array22 = new java.lang.String[] { "hi!", "" };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str19, str_array22);
    arraylist_str19.add((int)(byte)1, "hi!");
    int i27 = arraylist_str2.lastIndexOf((java.lang.Object)"hi!");
    boolean b28 = arraylist_str1.addAll((java.util.Collection<java.lang.String>)arraylist_str2);
    java.util.stream.Stream<java.lang.String> stream_str29 = arraylist_str2.stream();
    java.util.stream.Stream<java.lang.String> stream_str30 = arraylist_str2.parallelStream();
    java.lang.String str31 = arraylist_str2.toString();
    java.util.ListIterator<java.lang.String> listiterator_str32 = arraylist_str2.listIterator();
    arraylist_str2.ensureCapacity((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[]"+ "'", str31.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_str32);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test36"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    java.util.Spliterator<java.lang.String> spliterator_str2 = arraylist_str1.spliterator();
    java.util.ArrayDeque<java.lang.String> arraydeque_str3 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array7 = new java.lang.String[] { "[hi!, , hi!, ]", "[hi!, , hi!, ]", "[hi!, , hi!, ]" };
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str3, str_array7);
    java.util.Queue<java.lang.String> queue_str9 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str3);
    int i10 = arraylist_str1.lastIndexOf((java.lang.Object)queue_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test37"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.lang.Object[] obj_array5 = arraylist_str0.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long6 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long6, long_array11);
    java.util.NavigableSet<java.lang.Long> navigableset_long13 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long6);
    int i14 = arraylist_str0.lastIndexOf((java.lang.Object)treeset_long6);
    java.lang.Long long15 = java.util.Collections.max((java.util.Collection<java.lang.Long>)treeset_long6);
    java.util.NavigableSet<java.lang.Long> navigableset_long16 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L+ "'", long15.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long16);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test38"); }


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
    java.util.ArrayList<java.lang.String> arraylist_str26 = new java.util.ArrayList<java.lang.String>((int)'4');
    java.util.Spliterator<java.lang.String> spliterator_str27 = arraylist_str26.spliterator();
    int i28 = arraylist_str0.lastIndexOf((java.lang.Object)arraylist_str26);
    java.lang.Object obj29 = arraylist_str0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_collections22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj29);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test39"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    arraylist_str0.add((int)(byte)1, "hi!");
    java.util.ArrayList<java.lang.String> arraylist_str8 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "" };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str8, str_array11);
    java.util.Collection<java.lang.String> collection_str13 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str8);
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i17 = arraylist_str16.size();
    boolean b18 = arraylist_str8.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str16);
    boolean b19 = arraylist_str0.addAll((java.util.Collection<java.lang.String>)arraylist_str8);
    java.util.ArrayList<java.util.Collections> arraylist_collections20 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array21 = new java.util.Collections[] {  };
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections20, collections_array21);
    java.util.Collections collections23 = null;
    java.util.Comparator<java.lang.Object> comparator_obj24 = null;
    int i25 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections20, collections23, comparator_obj24);
    boolean b26 = arraylist_str8.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections20);
    java.util.Collections collections27 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections20, collections27);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test40"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    arraylist_str0.add((int)(byte)1, "hi!");
    java.util.ArrayList<java.lang.String> arraylist_str8 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "" };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str8, str_array11);
    java.util.Collection<java.lang.String> collection_str13 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str8);
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i17 = arraylist_str16.size();
    boolean b18 = arraylist_str8.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str16);
    boolean b19 = arraylist_str0.addAll((java.util.Collection<java.lang.String>)arraylist_str8);
    java.util.ArrayList<java.util.Collections> arraylist_collections20 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array21 = new java.util.Collections[] {  };
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections20, collections_array21);
    java.util.Collections collections23 = null;
    java.util.Comparator<java.lang.Object> comparator_obj24 = null;
    int i25 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections20, collections23, comparator_obj24);
    boolean b26 = arraylist_str8.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections20);
    java.util.ArrayList<java.util.Collections> arraylist_collections27 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array28 = new java.util.Collections[] {  };
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections27, collections_array28);
    java.util.Collections collections30 = null;
    java.util.Comparator<java.lang.Object> comparator_obj31 = null;
    int i32 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections27, collections30, comparator_obj31);
    java.util.Collection<java.util.Collections> collection_collections33 = java.util.Collections.unmodifiableCollection((java.util.Collection<java.util.Collections>)arraylist_collections27);
    boolean b34 = arraylist_str8.equals((java.lang.Object)arraylist_collections27);
    java.util.Collections collections35 = null;
    java.util.Comparator<java.lang.Object> comparator_obj36 = null;
    int i37 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections27, collections35, comparator_obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_collections33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test41"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, true };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array3);
    java.util.NavigableSet<java.lang.Boolean> navigableset_b5 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.lang.Boolean>)treeset_b0);
    java.util.NavigableSet<java.lang.Boolean> navigableset_b6 = java.util.Collections.synchronizedNavigableSet(navigableset_b5);
    java.util.NavigableSet<java.lang.Boolean> navigableset_b7 = java.util.Collections.synchronizedNavigableSet(navigableset_b5);
    java.util.NavigableSet<java.lang.Boolean> navigableset_b8 = java.util.Collections.synchronizedNavigableSet(navigableset_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_b6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_b8);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test42"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Comparator<java.lang.String> comparator_str5 = null;
    arraylist_str0.sort(comparator_str5);
    int i7 = arraylist_str0.size();
    java.lang.Object obj8 = arraylist_str0.clone();
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str11 = arraylist_str0.subList((int)(short)1, 5);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test43"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.lang.Object[] obj_array5 = arraylist_str0.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long6 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long6, long_array11);
    java.util.NavigableSet<java.lang.Long> navigableset_long13 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long6);
    int i14 = arraylist_str0.lastIndexOf((java.lang.Object)treeset_long6);
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str0);
    arraylist_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test44"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    java.util.Spliterator<java.lang.String> spliterator_str2 = arraylist_str1.spliterator();
    java.lang.String str3 = arraylist_str1.toString();
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array9);
    java.lang.Object[] obj_array11 = arraylist_str6.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long12 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array17 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long12, long_array17);
    java.util.NavigableSet<java.lang.Long> navigableset_long19 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long12);
    int i20 = arraylist_str6.lastIndexOf((java.lang.Object)treeset_long12);
    java.lang.String str22 = arraylist_str6.remove((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str23 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array26 = new java.lang.String[] { "hi!", "" };
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str23, str_array26);
    arraylist_str23.add((int)(byte)1, "hi!");
    int i31 = arraylist_str6.lastIndexOf((java.lang.Object)"hi!");
    boolean b32 = arraylist_str5.addAll((java.util.Collection<java.lang.String>)arraylist_str6);
    java.util.ArrayList<java.lang.String> arraylist_str33 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array36 = new java.lang.String[] { "hi!", "" };
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str33, str_array36);
    arraylist_str33.add((int)(byte)1, "hi!");
    java.util.ArrayList<java.lang.String> arraylist_str41 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array44 = new java.lang.String[] { "hi!", "" };
    boolean b45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str41, str_array44);
    java.util.Collection<java.lang.String> collection_str46 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str41);
    java.util.ArrayList<java.lang.String> arraylist_str49 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i50 = arraylist_str49.size();
    boolean b51 = arraylist_str41.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str49);
    boolean b52 = arraylist_str33.addAll((java.util.Collection<java.lang.String>)arraylist_str41);
    java.util.ArrayList<java.util.Collections> arraylist_collections53 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array54 = new java.util.Collections[] {  };
    boolean b55 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections53, collections_array54);
    java.util.Collections collections56 = null;
    java.util.Comparator<java.lang.Object> comparator_obj57 = null;
    int i58 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections53, collections56, comparator_obj57);
    boolean b59 = arraylist_str41.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections53);
    java.util.Collections collections60 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections53, collections60);
    java.util.List<java.util.Collections> list_collections62 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections53);
    boolean b63 = arraylist_str5.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections53);
    java.util.ArrayList<java.lang.String> arraylist_str64 = new java.util.ArrayList<java.lang.String>((java.util.Collection<java.lang.String>)arraylist_str5);
    java.util.ArrayList<java.lang.String> arraylist_str66 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i67 = arraylist_str66.size();
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str66);
    boolean b69 = arraylist_str66.isEmpty();
    java.lang.Long[] long_array74 = new java.lang.Long[] { 100L, (-1L), 0L, 0L };
    java.lang.Long[] long_array75 = arraylist_str66.toArray(long_array74);
    java.util.Set<java.lang.Object[]> set_obj_array76 = java.util.Collections.singleton((java.lang.Object[])long_array74);
    int i77 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)arraylist_str5, (java.lang.Object)long_array74);
    java.lang.Long[] long_array78 = arraylist_str1.toArray(long_array74);
    java.util.Set<java.lang.Object[]> set_obj_array79 = java.util.Collections.singleton((java.lang.Object[])long_array78);
    java.util.Comparator<java.lang.Object[]> comparator_obj_array80 = null;
    java.lang.Object[] obj_array81 = java.util.Collections.max((java.util.Collection<java.lang.Object[]>)set_obj_array79, comparator_obj_array80);
    java.util.Set<java.lang.Object[]> set_obj_array82 = java.util.Collections.singleton(obj_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array82);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test45"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str2 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str2, str_array5);
    java.lang.Object[] obj_array7 = arraylist_str2.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long8 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array13 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long8, long_array13);
    java.util.NavigableSet<java.lang.Long> navigableset_long15 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long8);
    int i16 = arraylist_str2.lastIndexOf((java.lang.Object)treeset_long8);
    java.lang.String str18 = arraylist_str2.remove((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array22 = new java.lang.String[] { "hi!", "" };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str19, str_array22);
    arraylist_str19.add((int)(byte)1, "hi!");
    int i27 = arraylist_str2.lastIndexOf((java.lang.Object)"hi!");
    boolean b28 = arraylist_str1.addAll((java.util.Collection<java.lang.String>)arraylist_str2);
    java.util.ArrayList<java.lang.String> arraylist_str29 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array32 = new java.lang.String[] { "hi!", "" };
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str29, str_array32);
    arraylist_str29.add((int)(byte)1, "hi!");
    java.util.ArrayList<java.lang.String> arraylist_str37 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array40 = new java.lang.String[] { "hi!", "" };
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str37, str_array40);
    java.util.Collection<java.lang.String> collection_str42 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str37);
    java.util.ArrayList<java.lang.String> arraylist_str45 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i46 = arraylist_str45.size();
    boolean b47 = arraylist_str37.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str45);
    boolean b48 = arraylist_str29.addAll((java.util.Collection<java.lang.String>)arraylist_str37);
    java.util.ArrayList<java.util.Collections> arraylist_collections49 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array50 = new java.util.Collections[] {  };
    boolean b51 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections49, collections_array50);
    java.util.Collections collections52 = null;
    java.util.Comparator<java.lang.Object> comparator_obj53 = null;
    int i54 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections49, collections52, comparator_obj53);
    boolean b55 = arraylist_str37.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections49);
    java.util.Collections collections56 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections49, collections56);
    java.util.List<java.util.Collections> list_collections58 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections49);
    boolean b59 = arraylist_str1.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections49);
    java.util.ArrayList<java.lang.String> arraylist_str60 = new java.util.ArrayList<java.lang.String>((java.util.Collection<java.lang.String>)arraylist_str1);
    java.util.ArrayList<java.lang.String> arraylist_str62 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i63 = arraylist_str62.size();
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str62);
    boolean b65 = arraylist_str62.isEmpty();
    java.lang.Long[] long_array70 = new java.lang.Long[] { 100L, (-1L), 0L, 0L };
    java.lang.Long[] long_array71 = arraylist_str62.toArray(long_array70);
    java.util.Set<java.lang.Object[]> set_obj_array72 = java.util.Collections.singleton((java.lang.Object[])long_array70);
    int i73 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)arraylist_str1, (java.lang.Object)long_array70);
    // The following exception was thrown during execution in test generation
    try {
    arraylist_str1.add((int)(byte)-1, "");
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test46"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    arraylist_str0.add((int)(byte)1, "hi!");
    java.util.ArrayList<java.lang.String> arraylist_str8 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "" };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str8, str_array11);
    java.util.Collection<java.lang.String> collection_str13 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str8);
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i17 = arraylist_str16.size();
    boolean b18 = arraylist_str8.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str16);
    boolean b19 = arraylist_str0.addAll((java.util.Collection<java.lang.String>)arraylist_str8);
    java.util.Collection<java.lang.String> collection_str20 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    int i21 = arraylist_str0.size();
    java.util.ArrayList<java.lang.Long> arraylist_long22 = new java.util.ArrayList<java.lang.Long>();
    java.lang.Long[] long_array28 = new java.lang.Long[] { 10L, 100L, 100L, 10L, 10L };
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long22, long_array28);
    java.lang.Long long30 = java.util.Collections.max((java.util.Collection<java.lang.Long>)arraylist_long22);
    int i31 = arraylist_str0.indexOf((java.lang.Object)arraylist_long22);
    java.util.Comparator<java.lang.String> comparator_str32 = null;
    java.lang.String str33 = java.util.Collections.min((java.util.Collection<java.lang.String>)arraylist_str0, comparator_str32);
    java.util.Comparator<java.lang.String> comparator_str34 = null;
    arraylist_str0.sort(comparator_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L+ "'", long30.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test47"); }


    java.util.ArrayList<java.lang.Object[]> arraylist_obj_array0 = new java.util.ArrayList<java.lang.Object[]>();
    java.util.ArrayList<java.lang.String> arraylist_str2 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array6);
    java.lang.Object[] obj_array8 = arraylist_str3.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long9 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array14 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long9, long_array14);
    java.util.NavigableSet<java.lang.Long> navigableset_long16 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long9);
    int i17 = arraylist_str3.lastIndexOf((java.lang.Object)treeset_long9);
    java.lang.String str19 = arraylist_str3.remove((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str20 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array23 = new java.lang.String[] { "hi!", "" };
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str20, str_array23);
    arraylist_str20.add((int)(byte)1, "hi!");
    int i28 = arraylist_str3.lastIndexOf((java.lang.Object)"hi!");
    boolean b29 = arraylist_str2.addAll((java.util.Collection<java.lang.String>)arraylist_str3);
    arraylist_str2.add((int)(byte)0, "");
    java.lang.Object[] obj_array33 = arraylist_str2.toArray();
    java.lang.Object[][] obj_array_array34 = new java.lang.Object[][] { obj_array33 };
    boolean b35 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)arraylist_obj_array0, obj_array_array34);
    java.util.Random random36 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array0, random36);
    java.util.Random random38 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array0, random38);
    java.util.Random random40 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array0, random40);
    java.util.Random random42 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array0, random42);
    java.util.Random random44 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array0, random44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test48"); }


    java.util.TreeSet<java.util.Random> treeset_random0 = new java.util.TreeSet<java.util.Random>();
    java.util.Random[] random_array1 = new java.util.Random[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)treeset_random0, random_array1);
    java.util.SortedSet<java.util.Random> sortedset_random3 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.util.Random>)treeset_random0);
    java.util.Enumeration<java.util.Random> enumeration_random4 = java.util.Collections.enumeration((java.util.Collection<java.util.Random>)sortedset_random3);
    java.util.SortedSet<java.util.Random> sortedset_random5 = java.util.Collections.unmodifiableSortedSet(sortedset_random3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_random3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_random4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_random5);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test49"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "[hi!]" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array2);
    java.util.Random random4 = null;
    java.util.Map<java.util.Random,java.lang.Integer> map_random_i6 = java.util.Collections.singletonMap(random4, (java.lang.Integer)10);
    int i7 = arraylist_str0.lastIndexOf((java.lang.Object)10);
    java.util.ListIterator<java.lang.String> listiterator_str9 = arraylist_str0.listIterator((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_random_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_str9);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test50"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    arraylist_str0.clear();
    java.util.ArrayList<java.lang.String> arraylist_str7 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str7, str_array10);
    java.lang.Object[] obj_array12 = arraylist_str7.toArray();
    java.util.ArrayDeque<java.lang.String> arraydeque_str13 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str13, str_array15);
    java.util.Queue<java.lang.String> queue_str17 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str13);
    boolean b18 = arraylist_str7.contains((java.lang.Object)arraydeque_str13);
    java.util.ArrayList<java.lang.Boolean> arraylist_b19 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array22 = new java.lang.Boolean[] { false, false };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b19, b_array22);
    boolean b24 = arraydeque_str13.containsAll((java.util.Collection<java.lang.Boolean>)arraylist_b19);
    boolean b25 = arraylist_str0.containsAll((java.util.Collection<java.lang.Boolean>)arraylist_b19);
    java.util.List<java.lang.Boolean> list_b27 = java.util.Collections.singletonList((java.lang.Boolean)true);
    java.util.ArrayList<java.util.Collections> arraylist_collections28 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array29 = new java.util.Collections[] {  };
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections28, collections_array29);
    java.util.Collections collections31 = null;
    java.util.Comparator<java.lang.Object> comparator_obj32 = null;
    int i33 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections28, collections31, comparator_obj32);
    java.util.Collections collections34 = null;
    java.util.Comparator<java.lang.Object> comparator_obj35 = null;
    java.util.Comparator<java.lang.Object> comparator_obj36 = java.util.Collections.reverseOrder(comparator_obj35);
    java.util.Comparator<java.lang.Object> comparator_obj37 = java.util.Collections.reverseOrder(comparator_obj36);
    int i38 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections28, collections34, comparator_obj36);
    java.util.Collections.sort(list_b27, comparator_obj36);
    java.util.Comparator<java.lang.Object> comparator_obj40 = java.util.Collections.reverseOrder(comparator_obj36);
    java.util.Comparator<java.lang.Object> comparator_obj41 = java.util.Collections.reverseOrder(comparator_obj36);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b19, comparator_obj36);
    java.util.Comparator<java.lang.Object> comparator_obj43 = java.util.Collections.reverseOrder(comparator_obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj43);

  }

}
