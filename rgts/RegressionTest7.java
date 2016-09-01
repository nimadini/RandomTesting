
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test01"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    java.util.ArrayList<java.lang.String> arraylist_str8 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i9 = arraylist_str8.size();
    boolean b10 = arraylist_str0.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str8);
    java.util.Iterator<java.lang.String> iterator_str11 = arraylist_str0.iterator();
    java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!", "" };
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str12, str_array15);
    arraylist_str12.add((int)(byte)1, "hi!");
    java.util.ArrayList<java.lang.String> arraylist_str20 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array23 = new java.lang.String[] { "hi!", "" };
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str20, str_array23);
    java.util.Collection<java.lang.String> collection_str25 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str20);
    java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i29 = arraylist_str28.size();
    boolean b30 = arraylist_str20.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str28);
    boolean b31 = arraylist_str12.addAll((java.util.Collection<java.lang.String>)arraylist_str20);
    java.util.Spliterator<java.lang.String> spliterator_str32 = arraylist_str20.spliterator();
    java.util.Collection<java.lang.String> collection_str33 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str20);
    java.util.Iterator<java.lang.String> iterator_str34 = arraylist_str20.iterator();
    arraylist_str20.ensureCapacity(0);
    int i37 = arraylist_str0.indexOf((java.lang.Object)0);
    
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
    org.junit.Assert.assertNotNull(iterator_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test02"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    arraylist_str0.trimToSize();
    java.util.Iterator<java.lang.String> iterator_str7 = arraylist_str0.iterator();
    java.util.Iterator<java.lang.String> iterator_str8 = arraylist_str0.iterator();
    java.util.ArrayList<java.util.Random> arraylist_random9 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array10 = new java.util.Random[] {  };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random9, random_array10);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random9, (int)(byte)0);
    java.lang.Object[] obj_array14 = new java.lang.Object[] { arraylist_str0, (byte)0 };
    java.util.Set<java.lang.Object[]> set_obj_array15 = java.util.Collections.singleton(obj_array14);
    java.util.Set<java.lang.Object[]> set_obj_array16 = java.util.Collections.unmodifiableSet(set_obj_array15);
    java.util.Set<java.lang.Object[]> set_obj_array17 = java.util.Collections.unmodifiableSet(set_obj_array16);
    java.util.Set<java.lang.Object[]> set_obj_array18 = java.util.Collections.unmodifiableSet(set_obj_array16);
    java.lang.Class<java.lang.Object[]> cls19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.lang.Object[]> set_obj_array20 = java.util.Collections.checkedSet(set_obj_array16, cls19);
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
    org.junit.Assert.assertNotNull(random_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array18);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test03"); }


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
    java.util.ArrayList<java.lang.String> arraylist_str27 = new java.util.ArrayList<java.lang.String>((java.util.Collection<java.lang.String>)arraylist_str8);
    arraylist_str8.ensureCapacity((int)'#');
    
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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test04"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.lang.Object[] obj_array5 = arraylist_str0.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long6 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long6, long_array11);
    java.util.NavigableSet<java.lang.Long> navigableset_long13 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long6);
    int i14 = arraylist_str0.lastIndexOf((java.lang.Object)treeset_long6);
    arraylist_str0.trimToSize();
    java.lang.String str18 = arraylist_str0.set(0, "[, hi!]");
    java.util.ArrayList<java.lang.String> arraylist_str20 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str21 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array24 = new java.lang.String[] { "", "hi!" };
    boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str21, str_array24);
    java.lang.Object[] obj_array26 = arraylist_str21.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long27 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array32 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long27, long_array32);
    java.util.NavigableSet<java.lang.Long> navigableset_long34 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long27);
    int i35 = arraylist_str21.lastIndexOf((java.lang.Object)treeset_long27);
    java.lang.String str37 = arraylist_str21.remove((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str38 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array41 = new java.lang.String[] { "hi!", "" };
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str38, str_array41);
    arraylist_str38.add((int)(byte)1, "hi!");
    int i46 = arraylist_str21.lastIndexOf((java.lang.Object)"hi!");
    boolean b47 = arraylist_str20.addAll((java.util.Collection<java.lang.String>)arraylist_str21);
    java.util.ArrayList<java.lang.String> arraylist_str48 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array51 = new java.lang.String[] { "hi!", "" };
    boolean b52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str48, str_array51);
    arraylist_str48.add((int)(byte)1, "hi!");
    java.util.ArrayList<java.lang.String> arraylist_str56 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array59 = new java.lang.String[] { "hi!", "" };
    boolean b60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str56, str_array59);
    java.util.Collection<java.lang.String> collection_str61 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str56);
    java.util.ArrayList<java.lang.String> arraylist_str64 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i65 = arraylist_str64.size();
    boolean b66 = arraylist_str56.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str64);
    boolean b67 = arraylist_str48.addAll((java.util.Collection<java.lang.String>)arraylist_str56);
    java.util.ArrayList<java.util.Collections> arraylist_collections68 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array69 = new java.util.Collections[] {  };
    boolean b70 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections68, collections_array69);
    java.util.Collections collections71 = null;
    java.util.Comparator<java.lang.Object> comparator_obj72 = null;
    int i73 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections68, collections71, comparator_obj72);
    boolean b74 = arraylist_str56.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections68);
    java.util.Collections collections75 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections68, collections75);
    java.util.List<java.util.Collections> list_collections77 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections68);
    boolean b78 = arraylist_str20.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections68);
    boolean b79 = arraylist_str0.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections68);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str82 = arraylist_str0.set((-1), "[]");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test05"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.lang.Object[] obj_array5 = arraylist_str0.toArray();
    java.lang.Object obj6 = null;
    int i7 = arraylist_str0.indexOf(obj6);
    java.util.stream.Stream<java.lang.String> stream_str8 = arraylist_str0.parallelStream();
    java.lang.String str10 = arraylist_str0.remove(0);
    boolean b12 = arraylist_str0.add("");
    arraylist_str0.ensureCapacity(0);
    java.util.Comparator<java.lang.String> comparator_str15 = null;
    java.lang.String str16 = java.util.Collections.min((java.util.Collection<java.lang.String>)arraylist_str0, comparator_str15);
    
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test06"); }


    java.util.List<java.lang.String> list_str2 = java.util.Collections.nCopies((int)'a', "[hi!, , hi!, ]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test07"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>(10);
    java.util.Iterator<java.lang.String> iterator_str2 = arraylist_str1.iterator();
    arraylist_str1.ensureCapacity((int)' ');
    boolean b6 = arraylist_str1.add("");
    int i7 = arraylist_str1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test08"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.lang.Object[] obj_array5 = arraylist_str0.toArray();
    java.util.Spliterator<java.lang.String> spliterator_str6 = arraylist_str0.spliterator();
    java.lang.Object obj7 = arraylist_str0.clone();
    java.util.ListIterator<java.lang.String> listiterator_str8 = arraylist_str0.listIterator();
    java.util.Comparator<java.lang.String> comparator_str9 = null;
    arraylist_str0.sort(comparator_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_str8);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test09"); }


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
    java.util.stream.Stream<java.lang.String> stream_str27 = arraylist_str0.stream();
    java.util.function.Predicate<java.lang.Object> predicate_obj28 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b29 = arraylist_str0.removeIf(predicate_obj28);
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
    org.junit.Assert.assertNotNull(stream_str27);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test10"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.lang.Object[] obj_array5 = arraylist_str0.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long6 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long6, long_array11);
    java.util.NavigableSet<java.lang.Long> navigableset_long13 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long6);
    int i14 = arraylist_str0.lastIndexOf((java.lang.Object)treeset_long6);
    arraylist_str0.trimToSize();
    boolean b16 = arraylist_str0.isEmpty();
    java.lang.Object[] obj_array17 = arraylist_str0.toArray();
    java.util.function.Predicate<java.lang.Object> predicate_obj18 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = arraylist_str0.removeIf(predicate_obj18);
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
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test11"); }


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
    arraylist_str0.ensureCapacity(10);
    java.util.ArrayList<java.lang.String> arraylist_str23 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array26 = new java.lang.String[] { "hi!", "" };
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str23, str_array26);
    java.util.Collection<java.lang.String> collection_str28 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str23);
    int i30 = arraylist_str23.lastIndexOf((java.lang.Object)10L);
    java.util.Collection<java.lang.String> collection_str31 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str23);
    // The following exception was thrown during execution in test generation
    try {
    boolean b32 = arraylist_str0.addAll((int)'a', (java.util.Collection<java.lang.String>)arraylist_str23);
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
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str31);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test12"); }


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
    java.util.ListIterator<java.lang.String> listiterator_str17 = arraylist_str0.listIterator();
    java.lang.String str18 = arraylist_str0.toString();
    java.util.Comparator<java.lang.String> comparator_str19 = null;
    arraylist_str0.sort(comparator_str19);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = arraylist_str0.remove((int)'a');
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
    org.junit.Assert.assertNotNull(listiterator_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[hi!, ]"+ "'", str18.equals("[hi!, ]"));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test13"); }


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
    arraylist_str30.trimToSize();
    java.util.function.Consumer<java.lang.String> consumer_str32 = null;
    // The following exception was thrown during execution in test generation
    try {
    arraylist_str30.forEach(consumer_str32);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
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
    org.junit.Assert.assertNotNull(list_str29);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test14"); }


    java.util.Collection<java.lang.String> collection_str0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>(collection_str0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test15"); }


    java.util.TreeSet<java.lang.Integer> treeset_i0 = new java.util.TreeSet<java.lang.Integer>();
    java.lang.Integer[] i_array5 = new java.lang.Integer[] { (-1), 1, 10, 10 };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)treeset_i0, i_array5);
    java.util.SortedSet<java.lang.Integer> sortedset_i7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.Integer>)treeset_i0);
    java.util.SortedSet<java.lang.Integer> sortedset_i8 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.Integer>)treeset_i0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i8);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test16"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.lang.Object[] obj_array5 = arraylist_str0.toArray();
    java.lang.Object obj6 = null;
    int i7 = arraylist_str0.indexOf(obj6);
    java.util.stream.Stream<java.lang.String> stream_str8 = arraylist_str0.parallelStream();
    java.lang.String str10 = arraylist_str0.remove(0);
    arraylist_str0.ensureCapacity((int)'4');
    // The following exception was thrown during execution in test generation
    try {
    arraylist_str0.add(100, "");
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
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test17"); }


    java.util.ArrayList<java.lang.Object[]> arraylist_obj_array0 = new java.util.ArrayList<java.lang.Object[]>();
    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str1, str_array4);
    java.lang.Object[] obj_array6 = arraylist_str1.toArray();
    java.lang.Object[][] obj_array_array7 = new java.lang.Object[][] { obj_array6 };
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)arraylist_obj_array0, obj_array_array7);
    java.util.Random random9 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array0, random9);
    java.util.Random random11 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array0, random11);
    java.util.Random random13 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array0, random13);
    java.util.Random random15 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array0, random15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test18"); }


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
    arraylist_str0.trimToSize();
    
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

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test19"); }


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
    java.util.ArrayList<java.util.Collections> arraylist_collections22 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array23 = new java.util.Collections[] {  };
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections22, collections_array23);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections22);
    java.util.Collections collections26 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections22, collections26);
    boolean b28 = arraylist_str0.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections22);
    java.util.List<java.util.Collections> list_collections29 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections22);
    java.util.Collections.reverse(list_collections29);
    java.util.Collections collections31 = null;
    java.util.Collections.fill(list_collections29, collections31);
    
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
    org.junit.Assert.assertNotNull(collections_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections29);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test20"); }


    java.util.ArrayDeque<java.lang.String> arraydeque_str0 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "[hi!, ]" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str0, str_array2);
    java.util.Queue<java.lang.String> queue_str4 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str4);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test21"); }


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
    java.util.ListIterator<java.lang.String> listiterator_str20 = arraylist_str8.listIterator();
    arraylist_str8.clear();
    
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
    org.junit.Assert.assertNotNull(listiterator_str20);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test22"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>(2);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test23"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    arraylist_str0.trimToSize();
    java.util.ArrayDeque<java.lang.String> arraydeque_str7 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!" };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str7, str_array9);
    java.util.Queue<java.lang.String> queue_str11 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str7);
    int i12 = arraylist_str0.indexOf((java.lang.Object)arraydeque_str7);
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!", "" };
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array17);
    java.util.Collection<java.lang.String> collection_str19 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str14);
    java.util.ArrayList<java.lang.String> arraylist_str22 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i23 = arraylist_str22.size();
    boolean b24 = arraylist_str14.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str22);
    java.util.NavigableSet<java.util.Collections> navigableset_collections25 = java.util.Collections.emptyNavigableSet();
    boolean b26 = arraylist_str14.removeAll((java.util.Collection<java.util.Collections>)navigableset_collections25);
    java.util.Iterator<java.lang.String> iterator_str27 = arraylist_str14.iterator();
    arraylist_str14.trimToSize();
    boolean b29 = arraylist_str0.addAll((int)(short)0, (java.util.Collection<java.lang.String>)arraylist_str14);
    java.lang.Long[] long_array34 = new java.lang.Long[] { (-1L), 0L, 10L, 1L };
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Long[] long_array35 = arraylist_str14.toArray(long_array34);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayStoreException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_collections25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array34);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test24"); }


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
    java.util.Collection<java.lang.String> collection_str35 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str8);
    java.lang.Object obj36 = null;
    int i37 = arraylist_str8.lastIndexOf(obj36);
    
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
    org.junit.Assert.assertNotNull(collection_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test25"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.lang.Object[] obj_array5 = arraylist_str0.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long6 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long6, long_array11);
    java.util.NavigableSet<java.lang.Long> navigableset_long13 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long6);
    int i14 = arraylist_str0.lastIndexOf((java.lang.Object)treeset_long6);
    java.lang.String str16 = arraylist_str0.remove((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str17 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!", "" };
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str17, str_array20);
    arraylist_str17.add((int)(byte)1, "hi!");
    int i25 = arraylist_str0.lastIndexOf((java.lang.Object)"hi!");
    java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str29 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array32 = new java.lang.String[] { "", "hi!" };
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str29, str_array32);
    java.lang.Object[] obj_array34 = arraylist_str29.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long35 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array40 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long35, long_array40);
    java.util.NavigableSet<java.lang.Long> navigableset_long42 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long35);
    int i43 = arraylist_str29.lastIndexOf((java.lang.Object)treeset_long35);
    java.lang.String str45 = arraylist_str29.remove((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str46 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array49 = new java.lang.String[] { "hi!", "" };
    boolean b50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str46, str_array49);
    arraylist_str46.add((int)(byte)1, "hi!");
    int i54 = arraylist_str29.lastIndexOf((java.lang.Object)"hi!");
    boolean b55 = arraylist_str28.addAll((java.util.Collection<java.lang.String>)arraylist_str29);
    arraylist_str28.add((int)(byte)0, "");
    java.lang.Object[] obj_array59 = arraylist_str28.toArray();
    arraylist_str28.clear();
    java.util.Collection<java.lang.String> collection_str61 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str28);
    boolean b62 = arraylist_str0.addAll((int)(byte)1, collection_str61);
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!"+ "'", str45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test26"); }


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
    java.lang.String str24 = arraylist_str0.remove(0);
    java.util.List<java.lang.Boolean> list_b26 = java.util.Collections.singletonList((java.lang.Boolean)true);
    boolean b27 = arraylist_str0.containsAll((java.util.Collection<java.lang.Boolean>)list_b26);
    arraylist_str0.ensureCapacity((int)(byte)10);
    
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
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test27"); }


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
    java.lang.Object obj30 = null;
    int i31 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)arraylist_str2, obj30);
    arraylist_str2.ensureCapacity((int)(byte)-1);
    java.util.Spliterator<java.lang.String> spliterator_str34 = arraylist_str2.spliterator();
    java.util.ArrayList<java.lang.String> arraylist_str36 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i37 = arraylist_str36.size();
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str36);
    java.util.ArrayList<java.lang.String> arraylist_str39 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array42 = new java.lang.String[] { "", "hi!" };
    boolean b43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str39, str_array42);
    java.lang.Object[] obj_array44 = arraylist_str39.toArray();
    java.util.ArrayDeque<java.lang.String> arraydeque_str45 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array47 = new java.lang.String[] { "hi!" };
    boolean b48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str45, str_array47);
    java.util.Queue<java.lang.String> queue_str49 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str45);
    boolean b50 = arraylist_str39.contains((java.lang.Object)arraydeque_str45);
    java.util.ArrayList<java.lang.Boolean> arraylist_b51 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array54 = new java.lang.Boolean[] { false, false };
    boolean b55 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b51, b_array54);
    boolean b56 = arraydeque_str45.containsAll((java.util.Collection<java.lang.Boolean>)arraylist_b51);
    java.util.stream.Stream<java.lang.String> stream_str57 = arraydeque_str45.stream();
    int i58 = arraylist_str36.lastIndexOf((java.lang.Object)stream_str57);
    boolean b60 = arraylist_str36.contains((java.lang.Object)1.0f);
    java.util.Comparator<java.lang.String> comparator_str61 = null;
    arraylist_str36.sort(comparator_str61);
    int i63 = arraylist_str2.lastIndexOf((java.lang.Object)comparator_str61);
    
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
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == (-1));

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test28"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str4 = arraylist_str1.subList(0, 5);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test29"); }


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
    java.util.Collection<java.lang.String> collection_str35 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str8);
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str8);
    
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
    org.junit.Assert.assertNotNull(collection_str35);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test30"); }


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
    java.util.List<java.util.Collections> list_collections12 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections9);
    boolean b13 = arraylist_str0.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections9);
    java.util.Collections collections14 = null;
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    java.util.Comparator<java.lang.Object> comparator_obj16 = java.util.Collections.reverseOrder(comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj17 = java.util.Collections.reverseOrder(comparator_obj16);
    int i18 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections9, collections14, comparator_obj17);
    
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
    org.junit.Assert.assertNotNull(list_collections12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test31"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    java.util.ArrayList<java.lang.String> arraylist_str8 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i9 = arraylist_str8.size();
    boolean b10 = arraylist_str0.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str8);
    java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!", "" };
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str11, str_array14);
    java.util.Collection<java.lang.String> collection_str16 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str11);
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i20 = arraylist_str19.size();
    boolean b21 = arraylist_str11.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str19);
    java.util.NavigableSet<java.util.Collections> navigableset_collections22 = java.util.Collections.emptyNavigableSet();
    boolean b23 = arraylist_str11.removeAll((java.util.Collection<java.util.Collections>)navigableset_collections22);
    java.util.Iterator<java.lang.String> iterator_str24 = arraylist_str11.iterator();
    arraylist_str11.trimToSize();
    java.util.ArrayList<java.lang.String> arraylist_str26 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array29 = new java.lang.String[] { "", "hi!" };
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str26, str_array29);
    java.lang.Object[] obj_array31 = arraylist_str26.toArray();
    java.util.ArrayDeque<java.lang.String> arraydeque_str32 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array34 = new java.lang.String[] { "hi!" };
    boolean b35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str32, str_array34);
    java.util.Queue<java.lang.String> queue_str36 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str32);
    boolean b37 = arraylist_str26.contains((java.lang.Object)arraydeque_str32);
    java.util.ArrayList<java.lang.Boolean> arraylist_b38 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array41 = new java.lang.Boolean[] { false, false };
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b38, b_array41);
    boolean b43 = arraydeque_str32.containsAll((java.util.Collection<java.lang.Boolean>)arraylist_b38);
    int i44 = arraylist_str11.lastIndexOf((java.lang.Object)arraylist_b38);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b38);
    java.util.ArrayList<java.util.Collections> arraylist_collections46 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array47 = new java.util.Collections[] {  };
    boolean b48 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections46, collections_array47);
    java.util.Collections collections49 = null;
    java.util.Comparator<java.lang.Object> comparator_obj50 = null;
    int i51 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections46, collections49, comparator_obj50);
    java.util.Collection<java.util.Collections> collection_collections52 = java.util.Collections.unmodifiableCollection((java.util.Collection<java.util.Collections>)arraylist_collections46);
    java.util.Collections collections53 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections46, collections53);
    java.util.Collections collections55 = null;
    java.util.List<java.lang.Boolean> list_b57 = java.util.Collections.singletonList((java.lang.Boolean)true);
    java.util.ArrayList<java.util.Collections> arraylist_collections58 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array59 = new java.util.Collections[] {  };
    boolean b60 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections58, collections_array59);
    java.util.Collections collections61 = null;
    java.util.Comparator<java.lang.Object> comparator_obj62 = null;
    int i63 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections58, collections61, comparator_obj62);
    java.util.Collections collections64 = null;
    java.util.Comparator<java.lang.Object> comparator_obj65 = null;
    java.util.Comparator<java.lang.Object> comparator_obj66 = java.util.Collections.reverseOrder(comparator_obj65);
    java.util.Comparator<java.lang.Object> comparator_obj67 = java.util.Collections.reverseOrder(comparator_obj66);
    int i68 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections58, collections64, comparator_obj66);
    java.util.Collections.sort(list_b57, comparator_obj66);
    java.util.Comparator<java.lang.Object> comparator_obj70 = java.util.Collections.reverseOrder(comparator_obj66);
    java.util.Comparator<java.lang.Object> comparator_obj71 = java.util.Collections.reverseOrder(comparator_obj66);
    int i72 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections46, collections55, comparator_obj66);
    java.util.Comparator<java.lang.Object> comparator_obj73 = java.util.Collections.reverseOrder(comparator_obj66);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b38, comparator_obj66);
    boolean b75 = arraylist_str0.equals((java.lang.Object)arraylist_b38);
    
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
    org.junit.Assert.assertNotNull(navigableset_collections22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_collections52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test32"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.lang.Object[] obj_array5 = arraylist_str0.toArray();
    java.util.Spliterator<java.lang.String> spliterator_str6 = arraylist_str0.spliterator();
    java.lang.String str7 = arraylist_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[, hi!]"+ "'", str7.equals("[, hi!]"));

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test33"); }


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
    java.util.ArrayList<java.lang.String> arraylist_str22 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str23 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array26 = new java.lang.String[] { "", "hi!" };
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str23, str_array26);
    java.lang.Object[] obj_array28 = arraylist_str23.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long29 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array34 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b35 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long29, long_array34);
    java.util.NavigableSet<java.lang.Long> navigableset_long36 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long29);
    int i37 = arraylist_str23.lastIndexOf((java.lang.Object)treeset_long29);
    java.lang.String str39 = arraylist_str23.remove((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str40 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!", "" };
    boolean b44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str40, str_array43);
    arraylist_str40.add((int)(byte)1, "hi!");
    int i48 = arraylist_str23.lastIndexOf((java.lang.Object)"hi!");
    boolean b49 = arraylist_str22.addAll((java.util.Collection<java.lang.String>)arraylist_str23);
    arraylist_str22.add((int)(byte)0, "");
    java.lang.Object[] obj_array53 = arraylist_str22.toArray();
    arraylist_str22.clear();
    java.util.ArrayList<java.lang.String> arraylist_str55 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array58 = new java.lang.String[] { "", "hi!" };
    boolean b59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str55, str_array58);
    java.lang.Object[] obj_array60 = arraylist_str55.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long61 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array66 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b67 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long61, long_array66);
    java.util.NavigableSet<java.lang.Long> navigableset_long68 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long61);
    int i69 = arraylist_str55.lastIndexOf((java.lang.Object)treeset_long61);
    java.util.ArrayList<java.lang.Boolean> arraylist_b70 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array73 = new java.lang.Boolean[] { true, false };
    boolean b74 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b70, b_array73);
    boolean b75 = arraylist_str55.containsAll((java.util.Collection<java.lang.Boolean>)arraylist_b70);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b70);
    boolean b77 = arraylist_str22.containsAll((java.util.Collection<java.lang.Boolean>)arraylist_b70);
    boolean b78 = arraylist_str0.contains((java.lang.Object)arraylist_str22);
    arraylist_str22.trimToSize();
    
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
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!"+ "'", str39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test34"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Comparator<java.lang.String> comparator_str5 = null;
    arraylist_str0.sort(comparator_str5);
    int i7 = arraylist_str0.size();
    java.util.Spliterator<java.lang.String> spliterator_str8 = arraylist_str0.spliterator();
    java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str9, str_array12);
    java.lang.Object[] obj_array14 = arraylist_str9.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long15 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array20 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long15, long_array20);
    java.util.NavigableSet<java.lang.Long> navigableset_long22 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long15);
    int i23 = arraylist_str9.lastIndexOf((java.lang.Object)treeset_long15);
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str9);
    java.util.ArrayList<java.lang.String> arraylist_str25 = new java.util.ArrayList<java.lang.String>((java.util.Collection<java.lang.String>)arraylist_str9);
    java.util.ArrayList<java.lang.Object> arraylist_obj26 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.lang.Long> arraylist_long27 = new java.util.ArrayList<java.lang.Long>();
    java.lang.Long[] long_array30 = new java.lang.Long[] { 10L, 10L };
    boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long27, long_array30);
    java.lang.Long long32 = java.util.Collections.max((java.util.Collection<java.lang.Long>)arraylist_long27);
    boolean b35 = java.util.Collections.replaceAll((java.util.List<java.lang.Long>)arraylist_long27, (java.lang.Long)100L, (java.lang.Long)100L);
    java.util.List<java.lang.String> list_str39 = java.util.Collections.nCopies(0, "[hi!]");
    java.util.ArrayList<java.lang.String> arraylist_str41 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str42 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array45 = new java.lang.String[] { "", "hi!" };
    boolean b46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str42, str_array45);
    java.lang.Object[] obj_array47 = arraylist_str42.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long48 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array53 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b54 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long48, long_array53);
    java.util.NavigableSet<java.lang.Long> navigableset_long55 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long48);
    int i56 = arraylist_str42.lastIndexOf((java.lang.Object)treeset_long48);
    java.lang.String str58 = arraylist_str42.remove((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str59 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array62 = new java.lang.String[] { "hi!", "" };
    boolean b63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str59, str_array62);
    arraylist_str59.add((int)(byte)1, "hi!");
    int i67 = arraylist_str42.lastIndexOf((java.lang.Object)"hi!");
    boolean b68 = arraylist_str41.addAll((java.util.Collection<java.lang.String>)arraylist_str42);
    java.util.stream.Stream<java.lang.String> stream_str69 = arraylist_str42.stream();
    java.util.ArrayList<java.lang.String> arraylist_str70 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array73 = new java.lang.String[] { "hi!", "" };
    boolean b74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str70, str_array73);
    java.util.Collection<java.lang.String> collection_str75 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str70);
    arraylist_str70.trimToSize();
    java.util.Iterator<java.lang.String> iterator_str77 = arraylist_str70.iterator();
    java.util.Iterator<java.lang.String> iterator_str78 = arraylist_str70.iterator();
    java.lang.Object[] obj_array79 = new java.lang.Object[] { arraylist_long27, (short)10, list_str39, stream_str69, arraylist_str70 };
    boolean b80 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj26, obj_array79);
    boolean b81 = arraylist_str25.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj26);
    java.util.ArrayList<java.lang.Object[]> arraylist_obj_array82 = new java.util.ArrayList<java.lang.Object[]>();
    java.util.ArrayList<java.lang.String> arraylist_str83 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array86 = new java.lang.String[] { "", "hi!" };
    boolean b87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str83, str_array86);
    java.lang.Object[] obj_array88 = arraylist_str83.toArray();
    java.lang.Object[][] obj_array_array89 = new java.lang.Object[][] { obj_array88 };
    boolean b90 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)arraylist_obj_array82, obj_array_array89);
    java.util.Random random91 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array82, random91);
    java.util.Random random93 = null;
    java.util.Collections.shuffle((java.util.List<java.lang.Object[]>)arraylist_obj_array82, random93);
    java.util.Collections.copy((java.util.List<java.lang.Object>)arraylist_obj26, (java.util.List<java.lang.Object[]>)arraylist_obj_array82);
    boolean b96 = arraylist_str0.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L+ "'", long32.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!"+ "'", str58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == true);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test35"); }


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
    java.util.stream.Stream<java.lang.String> stream_str21 = arraylist_str8.parallelStream();
    java.util.Spliterator<java.lang.String> spliterator_str22 = arraylist_str8.spliterator();
    java.util.ArrayList<java.lang.String> arraylist_str23 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array26 = new java.lang.String[] { "hi!", "" };
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str23, str_array26);
    java.util.Collection<java.lang.String> collection_str28 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str23);
    java.util.ArrayList<java.lang.String> arraylist_str31 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i32 = arraylist_str31.size();
    boolean b33 = arraylist_str23.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str31);
    java.util.Iterator<java.lang.String> iterator_str34 = arraylist_str23.iterator();
    boolean b35 = arraylist_str8.addAll((java.util.Collection<java.lang.String>)arraylist_str23);
    
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
    org.junit.Assert.assertNotNull(stream_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test36"); }


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
    java.lang.Object obj30 = null;
    int i31 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)arraylist_str2, obj30);
    int i32 = arraylist_str2.size();
    java.util.ArrayList<java.lang.String> arraylist_str34 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array37 = new java.lang.String[] { "", "hi!" };
    boolean b38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str34, str_array37);
    java.lang.Object[] obj_array39 = arraylist_str34.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long40 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array45 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b46 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long40, long_array45);
    java.util.NavigableSet<java.lang.Long> navigableset_long47 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long40);
    int i48 = arraylist_str34.lastIndexOf((java.lang.Object)treeset_long40);
    java.lang.String str50 = arraylist_str34.remove((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str51 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array54 = new java.lang.String[] { "hi!", "" };
    boolean b55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str51, str_array54);
    arraylist_str51.add((int)(byte)1, "hi!");
    int i59 = arraylist_str34.lastIndexOf((java.lang.Object)"hi!");
    java.util.ArrayList<java.lang.String> arraylist_str60 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array63 = new java.lang.String[] { "", "hi!" };
    boolean b64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str60, str_array63);
    java.lang.Object[] obj_array65 = arraylist_str60.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long66 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array71 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b72 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long66, long_array71);
    java.util.NavigableSet<java.lang.Long> navigableset_long73 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long66);
    int i74 = arraylist_str60.lastIndexOf((java.lang.Object)treeset_long66);
    java.lang.String str76 = arraylist_str60.remove((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str77 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array80 = new java.lang.String[] { "hi!", "" };
    boolean b81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str77, str_array80);
    arraylist_str77.add((int)(byte)1, "hi!");
    int i85 = arraylist_str60.lastIndexOf((java.lang.Object)"hi!");
    int i86 = arraylist_str34.lastIndexOf((java.lang.Object)"hi!");
    boolean b87 = arraylist_str2.addAll(0, (java.util.Collection<java.lang.String>)arraylist_str34);
    java.util.stream.Stream<java.lang.String> stream_str88 = arraylist_str2.stream();
    java.util.Collection<java.lang.String> collection_str89 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str2);
    
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
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!"+ "'", str50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "hi!"+ "'", str76.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str89);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test37"); }


    java.util.ArrayList<java.util.Random> arraylist_random0 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array1 = new java.util.Random[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random0, random_array1);
    java.util.Enumeration<java.util.Random> enumeration_random3 = java.util.Collections.enumeration((java.util.Collection<java.util.Random>)arraylist_random0);
    java.util.Enumeration<java.util.Random> enumeration_random4 = java.util.Collections.enumeration((java.util.Collection<java.util.Random>)arraylist_random0);
    java.util.Enumeration<java.util.Random> enumeration_random5 = java.util.Collections.enumeration((java.util.Collection<java.util.Random>)arraylist_random0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_random3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_random4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_random5);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test38"); }


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
    java.lang.String str24 = arraylist_str0.remove(0);
    java.util.List<java.lang.Boolean> list_b26 = java.util.Collections.singletonList((java.lang.Boolean)true);
    boolean b27 = arraylist_str0.containsAll((java.util.Collection<java.lang.Boolean>)list_b26);
    java.lang.Object[] obj_array28 = arraylist_str0.toArray();
    boolean b30 = arraylist_str0.add("[hi!, ]");
    
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
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test39"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    arraylist_str0.trimToSize();
    java.util.Iterator<java.lang.String> iterator_str7 = arraylist_str0.iterator();
    java.util.Iterator<java.lang.String> iterator_str8 = arraylist_str0.iterator();
    java.util.ArrayList<java.util.Random> arraylist_random9 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array10 = new java.util.Random[] {  };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random9, random_array10);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random9, (int)(byte)0);
    java.lang.Object[] obj_array14 = new java.lang.Object[] { arraylist_str0, (byte)0 };
    java.util.Set<java.lang.Object[]> set_obj_array15 = java.util.Collections.singleton(obj_array14);
    java.util.Set<java.lang.Object[]> set_obj_array16 = java.util.Collections.unmodifiableSet(set_obj_array15);
    java.util.Set<java.lang.Object[]> set_obj_array17 = java.util.Collections.unmodifiableSet(set_obj_array16);
    java.util.Set<java.lang.Object[]> set_obj_array18 = java.util.Collections.unmodifiableSet(set_obj_array16);
    java.util.Set<java.lang.Object[]> set_obj_array19 = java.util.Collections.unmodifiableSet(set_obj_array16);
    
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
    org.junit.Assert.assertNotNull(random_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array19);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test40"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.lang.Object[] obj_array5 = arraylist_str0.toArray();
    java.lang.Object obj6 = null;
    int i7 = arraylist_str0.indexOf(obj6);
    java.util.stream.Stream<java.lang.String> stream_str8 = arraylist_str0.parallelStream();
    java.lang.String str10 = arraylist_str0.remove(0);
    boolean b12 = arraylist_str0.add("");
    java.util.List<java.lang.String> list_str13 = java.util.Collections.synchronizedList((java.util.List<java.lang.String>)arraylist_str0);
    java.util.stream.Stream<java.lang.String> stream_str14 = arraylist_str0.stream();
    java.util.Spliterator<java.lang.String> spliterator_str15 = arraylist_str0.spliterator();
    
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str15);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test41"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Comparator<java.lang.String> comparator_str5 = null;
    arraylist_str0.sort(comparator_str5);
    int i7 = arraylist_str0.size();
    java.lang.String str8 = arraylist_str0.toString();
    java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array12 = new java.lang.String[] { "hi!", "" };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str9, str_array12);
    java.util.Collection<java.lang.String> collection_str14 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str9);
    arraylist_str9.trimToSize();
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!", "" };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str16, str_array19);
    java.util.Collection<java.lang.String> collection_str21 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str16);
    arraylist_str16.trimToSize();
    java.util.Iterator<java.lang.String> iterator_str23 = arraylist_str16.iterator();
    java.util.Iterator<java.lang.String> iterator_str24 = arraylist_str16.iterator();
    java.util.ArrayList<java.util.Collections> arraylist_collections25 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array26 = new java.util.Collections[] {  };
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections25, collections_array26);
    java.util.Collections collections28 = null;
    java.util.Comparator<java.lang.Object> comparator_obj29 = null;
    int i30 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections25, collections28, comparator_obj29);
    java.util.Collection<java.util.Collections> collection_collections31 = java.util.Collections.unmodifiableCollection((java.util.Collection<java.util.Collections>)arraylist_collections25);
    boolean b32 = arraylist_str16.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections25);
    boolean b33 = arraylist_str9.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections25);
    boolean b34 = arraylist_str0.addAll((java.util.Collection<java.lang.String>)arraylist_str9);
    boolean b36 = arraylist_str0.contains((java.lang.Object)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[, hi!]"+ "'", str8.equals("[, hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_collections31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test42"); }


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
    java.util.ListIterator<java.lang.String> listiterator_str20 = arraylist_str8.listIterator();
    java.util.Collection<java.lang.String> collection_str21 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str8);
    
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
    org.junit.Assert.assertNotNull(listiterator_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str21);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test43"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.lang.Object[] obj_array5 = arraylist_str0.toArray();
    java.lang.Object obj6 = null;
    int i7 = arraylist_str0.indexOf(obj6);
    java.util.ArrayList<java.lang.String> arraylist_str8 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str8, str_array11);
    java.lang.Object[] obj_array13 = arraylist_str8.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long14 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array19 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long14, long_array19);
    java.util.NavigableSet<java.lang.Long> navigableset_long21 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long14);
    int i22 = arraylist_str8.lastIndexOf((java.lang.Object)treeset_long14);
    arraylist_str8.trimToSize();
    java.lang.String str26 = arraylist_str8.set(0, "[, hi!]");
    java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str29 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array32 = new java.lang.String[] { "", "hi!" };
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str29, str_array32);
    java.lang.Object[] obj_array34 = arraylist_str29.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long35 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array40 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long35, long_array40);
    java.util.NavigableSet<java.lang.Long> navigableset_long42 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long35);
    int i43 = arraylist_str29.lastIndexOf((java.lang.Object)treeset_long35);
    java.lang.String str45 = arraylist_str29.remove((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str46 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array49 = new java.lang.String[] { "hi!", "" };
    boolean b50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str46, str_array49);
    arraylist_str46.add((int)(byte)1, "hi!");
    int i54 = arraylist_str29.lastIndexOf((java.lang.Object)"hi!");
    boolean b55 = arraylist_str28.addAll((java.util.Collection<java.lang.String>)arraylist_str29);
    java.util.ArrayList<java.lang.String> arraylist_str56 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array59 = new java.lang.String[] { "hi!", "" };
    boolean b60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str56, str_array59);
    arraylist_str56.add((int)(byte)1, "hi!");
    java.util.ArrayList<java.lang.String> arraylist_str64 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array67 = new java.lang.String[] { "hi!", "" };
    boolean b68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str64, str_array67);
    java.util.Collection<java.lang.String> collection_str69 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str64);
    java.util.ArrayList<java.lang.String> arraylist_str72 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i73 = arraylist_str72.size();
    boolean b74 = arraylist_str64.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str72);
    boolean b75 = arraylist_str56.addAll((java.util.Collection<java.lang.String>)arraylist_str64);
    java.util.ArrayList<java.util.Collections> arraylist_collections76 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array77 = new java.util.Collections[] {  };
    boolean b78 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections76, collections_array77);
    java.util.Collections collections79 = null;
    java.util.Comparator<java.lang.Object> comparator_obj80 = null;
    int i81 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections76, collections79, comparator_obj80);
    boolean b82 = arraylist_str64.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections76);
    java.util.Collections collections83 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections76, collections83);
    java.util.List<java.util.Collections> list_collections85 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections76);
    boolean b86 = arraylist_str28.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections76);
    boolean b87 = arraylist_str8.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections76);
    java.util.List<java.util.Collections> list_collections88 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections76);
    boolean b89 = arraylist_str0.remove((java.lang.Object)list_collections88);
    arraylist_str0.ensureCapacity((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!"+ "'", str45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test44"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    arraylist_str0.trimToSize();
    java.util.ArrayDeque<java.lang.String> arraydeque_str7 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!" };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str7, str_array9);
    java.util.Queue<java.lang.String> queue_str11 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str7);
    int i12 = arraylist_str0.indexOf((java.lang.Object)arraydeque_str7);
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!", "" };
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array17);
    java.util.Collection<java.lang.String> collection_str19 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str14);
    java.util.ArrayList<java.lang.String> arraylist_str22 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i23 = arraylist_str22.size();
    boolean b24 = arraylist_str14.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str22);
    java.util.NavigableSet<java.util.Collections> navigableset_collections25 = java.util.Collections.emptyNavigableSet();
    boolean b26 = arraylist_str14.removeAll((java.util.Collection<java.util.Collections>)navigableset_collections25);
    java.util.Iterator<java.lang.String> iterator_str27 = arraylist_str14.iterator();
    arraylist_str14.trimToSize();
    boolean b29 = arraylist_str0.addAll((int)(short)0, (java.util.Collection<java.lang.String>)arraylist_str14);
    java.util.stream.Stream<java.lang.String> stream_str30 = arraylist_str0.stream();
    boolean b32 = arraylist_str0.add("[hi!]");
    java.util.stream.Stream<java.lang.String> stream_str33 = arraylist_str0.parallelStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_collections25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str33);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test45"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.lang.Object[] obj_array5 = arraylist_str0.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long6 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long6, long_array11);
    java.util.NavigableSet<java.lang.Long> navigableset_long13 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long6);
    int i14 = arraylist_str0.lastIndexOf((java.lang.Object)treeset_long6);
    java.lang.String str16 = arraylist_str0.remove((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str17 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!", "" };
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str17, str_array20);
    arraylist_str17.add((int)(byte)1, "hi!");
    int i25 = arraylist_str0.lastIndexOf((java.lang.Object)"hi!");
    java.util.ArrayList<java.lang.String> arraylist_str26 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array29 = new java.lang.String[] { "", "hi!" };
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str26, str_array29);
    java.lang.Object[] obj_array31 = arraylist_str26.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long32 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array37 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b38 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long32, long_array37);
    java.util.NavigableSet<java.lang.Long> navigableset_long39 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long32);
    int i40 = arraylist_str26.lastIndexOf((java.lang.Object)treeset_long32);
    java.lang.String str42 = arraylist_str26.remove((int)(short)1);
    int i43 = arraylist_str0.lastIndexOf((java.lang.Object)(short)1);
    java.util.List<java.lang.Boolean> list_b45 = java.util.Collections.singletonList((java.lang.Boolean)true);
    boolean b46 = arraylist_str0.containsAll((java.util.Collection<java.lang.Boolean>)list_b45);
    arraylist_str0.ensureCapacity((int)'#');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str51 = arraylist_str0.set(10, "[hi!, , hi!, ]");
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!"+ "'", str42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test46"); }


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
    arraylist_str1.add((int)(byte)0, "");
    arraylist_str1.clear();
    java.lang.Object[] obj_array33 = arraylist_str1.toArray();
    
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
    org.junit.Assert.assertNotNull(obj_array33);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test47"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    arraylist_str0.trimToSize();
    java.util.Iterator<java.lang.String> iterator_str7 = arraylist_str0.iterator();
    java.util.Iterator<java.lang.String> iterator_str8 = arraylist_str0.iterator();
    java.util.ArrayList<java.util.Random> arraylist_random9 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array10 = new java.util.Random[] {  };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random9, random_array10);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random9, (int)(byte)0);
    java.lang.Object[] obj_array14 = new java.lang.Object[] { arraylist_str0, (byte)0 };
    java.util.Set<java.lang.Object[]> set_obj_array15 = java.util.Collections.singleton(obj_array14);
    java.util.Set<java.lang.Object[]> set_obj_array16 = java.util.Collections.unmodifiableSet(set_obj_array15);
    java.util.Set<java.lang.Object[]> set_obj_array17 = java.util.Collections.unmodifiableSet(set_obj_array16);
    java.lang.Class<java.lang.Object[]> cls18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.lang.Object[]> set_obj_array19 = java.util.Collections.checkedSet(set_obj_array16, cls18);
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
    org.junit.Assert.assertNotNull(random_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array17);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test48"); }


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
    java.lang.String str41 = arraylist_str0.get((int)(byte)0);
    
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
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test49"); }


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
    java.util.stream.Stream<java.lang.String> stream_str21 = arraylist_str8.parallelStream();
    java.lang.String str23 = arraylist_str8.get(1);
    java.lang.String str26 = arraylist_str8.set(0, "[, hi!]");
    
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
    org.junit.Assert.assertNotNull(stream_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test50"); }


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
    int i31 = arraylist_str0.size();
    
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
    org.junit.Assert.assertTrue(i31 == 2);

  }

}
