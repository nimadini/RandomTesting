
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test01"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.lang.Object[] obj_array5 = arraylist_str0.toArray();
    java.lang.Object obj6 = null;
    int i7 = arraylist_str0.indexOf(obj6);
    java.lang.Object[] obj_array8 = arraylist_str0.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test02"); }


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
    java.util.List<java.lang.Boolean> list_b15 = java.util.Collections.singletonList((java.lang.Boolean)true);
    java.util.ArrayList<java.util.Collections> arraylist_collections16 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array17 = new java.util.Collections[] {  };
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections16, collections_array17);
    java.util.Collections collections19 = null;
    java.util.Comparator<java.lang.Object> comparator_obj20 = null;
    int i21 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections16, collections19, comparator_obj20);
    java.util.Collections collections22 = null;
    java.util.Comparator<java.lang.Object> comparator_obj23 = null;
    java.util.Comparator<java.lang.Object> comparator_obj24 = java.util.Collections.reverseOrder(comparator_obj23);
    java.util.Comparator<java.lang.Object> comparator_obj25 = java.util.Collections.reverseOrder(comparator_obj24);
    int i26 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections16, collections22, comparator_obj24);
    java.util.Collections.sort(list_b15, comparator_obj24);
    java.util.Comparator<java.lang.Object> comparator_obj28 = java.util.Collections.reverseOrder(comparator_obj24);
    java.util.Collections.sort(list_b1, comparator_obj28);
    java.util.Collections.sort(list_b1);
    java.util.ArrayList<java.util.Collections> arraylist_collections31 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array32 = new java.util.Collections[] {  };
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections31, collections_array32);
    java.util.Collections collections34 = null;
    java.util.Comparator<java.lang.Object> comparator_obj35 = null;
    int i36 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections31, collections34, comparator_obj35);
    java.util.Collection<java.util.Collections> collection_collections37 = java.util.Collections.unmodifiableCollection((java.util.Collection<java.util.Collections>)arraylist_collections31);
    java.util.List<java.util.Collections> list_collections38 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections31);
    java.util.Collections collections39 = null;
    java.util.List<java.lang.Boolean> list_b41 = java.util.Collections.singletonList((java.lang.Boolean)true);
    java.util.ArrayList<java.util.Collections> arraylist_collections42 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array43 = new java.util.Collections[] {  };
    boolean b44 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections42, collections_array43);
    java.util.Collections collections45 = null;
    java.util.Comparator<java.lang.Object> comparator_obj46 = null;
    int i47 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections42, collections45, comparator_obj46);
    java.util.Collections collections48 = null;
    java.util.Comparator<java.lang.Object> comparator_obj49 = null;
    java.util.Comparator<java.lang.Object> comparator_obj50 = java.util.Collections.reverseOrder(comparator_obj49);
    java.util.Comparator<java.lang.Object> comparator_obj51 = java.util.Collections.reverseOrder(comparator_obj50);
    int i52 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections42, collections48, comparator_obj50);
    java.util.Collections.sort(list_b41, comparator_obj50);
    java.util.Comparator<java.lang.Object> comparator_obj54 = java.util.Collections.reverseOrder(comparator_obj50);
    java.util.Comparator<java.lang.Object> comparator_obj55 = java.util.Collections.reverseOrder(comparator_obj50);
    int i56 = java.util.Collections.binarySearch(list_collections38, collections39, comparator_obj50);
    java.util.Comparator<java.lang.Object> comparator_obj57 = java.util.Collections.reverseOrder(comparator_obj50);
    java.util.Collections.sort(list_b1, comparator_obj57);
    
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
    org.junit.Assert.assertNotNull(list_b15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_collections37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj57);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test03"); }


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
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array22 = new java.lang.String[] { "", "hi!" };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str19, str_array22);
    java.lang.Object[] obj_array24 = arraylist_str19.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long25 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array30 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long25, long_array30);
    java.util.NavigableSet<java.lang.Long> navigableset_long32 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long25);
    int i33 = arraylist_str19.lastIndexOf((java.lang.Object)treeset_long25);
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str19);
    java.util.ArrayList<java.lang.String> arraylist_str35 = new java.util.ArrayList<java.lang.String>((java.util.Collection<java.lang.String>)arraylist_str19);
    java.util.ArrayList<java.lang.Object> arraylist_obj36 = new java.util.ArrayList<java.lang.Object>();
    java.util.ArrayList<java.lang.Long> arraylist_long37 = new java.util.ArrayList<java.lang.Long>();
    java.lang.Long[] long_array40 = new java.lang.Long[] { 10L, 10L };
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long37, long_array40);
    java.lang.Long long42 = java.util.Collections.max((java.util.Collection<java.lang.Long>)arraylist_long37);
    boolean b45 = java.util.Collections.replaceAll((java.util.List<java.lang.Long>)arraylist_long37, (java.lang.Long)100L, (java.lang.Long)100L);
    java.util.List<java.lang.String> list_str49 = java.util.Collections.nCopies(0, "[hi!]");
    java.util.ArrayList<java.lang.String> arraylist_str51 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str52 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array55 = new java.lang.String[] { "", "hi!" };
    boolean b56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str52, str_array55);
    java.lang.Object[] obj_array57 = arraylist_str52.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long58 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array63 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b64 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long58, long_array63);
    java.util.NavigableSet<java.lang.Long> navigableset_long65 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long58);
    int i66 = arraylist_str52.lastIndexOf((java.lang.Object)treeset_long58);
    java.lang.String str68 = arraylist_str52.remove((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str69 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array72 = new java.lang.String[] { "hi!", "" };
    boolean b73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str69, str_array72);
    arraylist_str69.add((int)(byte)1, "hi!");
    int i77 = arraylist_str52.lastIndexOf((java.lang.Object)"hi!");
    boolean b78 = arraylist_str51.addAll((java.util.Collection<java.lang.String>)arraylist_str52);
    java.util.stream.Stream<java.lang.String> stream_str79 = arraylist_str52.stream();
    java.util.ArrayList<java.lang.String> arraylist_str80 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array83 = new java.lang.String[] { "hi!", "" };
    boolean b84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str80, str_array83);
    java.util.Collection<java.lang.String> collection_str85 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str80);
    arraylist_str80.trimToSize();
    java.util.Iterator<java.lang.String> iterator_str87 = arraylist_str80.iterator();
    java.util.Iterator<java.lang.String> iterator_str88 = arraylist_str80.iterator();
    java.lang.Object[] obj_array89 = new java.lang.Object[] { arraylist_long37, (short)10, list_str49, stream_str79, arraylist_str80 };
    boolean b90 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj36, obj_array89);
    boolean b91 = arraylist_str35.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj36);
    boolean b92 = arraylist_str0.retainAll((java.util.Collection<java.lang.Object>)arraylist_obj36);
    
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
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10L+ "'", long42.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "hi!"+ "'", str68.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test04"); }


    java.util.TreeSet<java.util.Random> treeset_random0 = new java.util.TreeSet<java.util.Random>();
    java.util.Random[] random_array1 = new java.util.Random[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)treeset_random0, random_array1);
    java.util.SortedSet<java.util.Random> sortedset_random3 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.util.Random>)treeset_random0);
    java.util.Enumeration<java.util.Random> enumeration_random4 = java.util.Collections.enumeration((java.util.Collection<java.util.Random>)sortedset_random3);
    java.util.Enumeration<java.util.Random> enumeration_random5 = java.util.Collections.enumeration((java.util.Collection<java.util.Random>)sortedset_random3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_random3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_random4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_random5);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test05"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    int i7 = arraylist_str0.lastIndexOf((java.lang.Object)10L);
    java.util.Collection<java.lang.String> collection_str8 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
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
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str8);
    
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
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test06"); }


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
    int i31 = arraylist_str0.size();
    java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array34 = new java.lang.String[] { "" };
    boolean b35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str32, str_array34);
    java.util.Comparator<java.lang.String> comparator_str36 = null;
    java.lang.String str37 = java.util.Collections.min((java.util.Collection<java.lang.String>)arraylist_str32, comparator_str36);
    java.util.stream.Stream<java.lang.String> stream_str38 = arraylist_str32.parallelStream();
    java.util.Comparator<java.lang.String> comparator_str39 = null;
    java.lang.String str40 = java.util.Collections.min((java.util.Collection<java.lang.String>)arraylist_str32, comparator_str39);
    java.util.ArrayList<java.lang.String> arraylist_str41 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array44 = new java.lang.String[] { "", "hi!" };
    boolean b45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str41, str_array44);
    java.lang.Object[] obj_array46 = arraylist_str41.toArray();
    java.util.ArrayDeque<java.lang.String> arraydeque_str47 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array49 = new java.lang.String[] { "hi!" };
    boolean b50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str47, str_array49);
    java.util.Queue<java.lang.String> queue_str51 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str47);
    boolean b52 = arraylist_str41.contains((java.lang.Object)arraydeque_str47);
    java.util.Queue<java.lang.String> queue_str53 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str47);
    int i54 = arraylist_str32.indexOf((java.lang.Object)queue_str53);
    int i55 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)arraylist_str0, (java.lang.Object)i54);
    java.util.ListIterator<java.lang.String> listiterator_str56 = arraylist_str0.listIterator();
    
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
    org.junit.Assert.assertTrue(i31 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + ""+ "'", str37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + ""+ "'", str40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_str56);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test07"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, (-1) };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array3);
    java.lang.Integer i5 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i0);
    int i7 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i0, (java.lang.Integer)10);
    java.util.ArrayList<java.lang.Integer> arraylist_i8 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array10 = new java.lang.Integer[] { 5 };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i8, i_array10);
    int i12 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i0, (java.util.List<java.lang.Integer>)arraylist_i8);
    java.util.ArrayList<java.lang.Integer> arraylist_i13 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array16 = new java.lang.Integer[] { 1, (-1) };
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i13, i_array16);
    java.lang.Integer i18 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i13);
    int i20 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i13, (java.lang.Integer)10);
    java.util.ArrayList<java.lang.Integer> arraylist_i21 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array23 = new java.lang.Integer[] { 5 };
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i21, i_array23);
    int i25 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i13, (java.util.List<java.lang.Integer>)arraylist_i21);
    int i27 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i21, (java.lang.Integer)4);
    int i29 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i21, (java.lang.Integer)5);
    int i30 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i8, (java.util.List<java.lang.Integer>)arraylist_i21);
    java.lang.Class<java.lang.Integer> cls31 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.Integer> list_i32 = java.util.Collections.checkedList((java.util.List<java.lang.Integer>)arraylist_i21, cls31);
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
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test08"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, (-1) };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array3);
    java.lang.Integer i5 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i0);
    int i7 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i0, (java.lang.Integer)10);
    java.util.ArrayList<java.lang.Integer> arraylist_i8 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array11 = new java.lang.Integer[] { 1, (-1) };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i8, i_array11);
    java.lang.Integer i13 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i8);
    int i15 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i8, (java.lang.Integer)(-3));
    int i17 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i8, (java.lang.Integer)(-3));
    int i18 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i0, (java.util.List<java.lang.Integer>)arraylist_i8);
    java.lang.Class<java.lang.Integer> cls19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.Integer> list_i20 = java.util.Collections.checkedList((java.util.List<java.lang.Integer>)arraylist_i0, cls19);
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
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test09"); }


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
    arraylist_str2.trimToSize();
    
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

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test10"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    java.util.LinkedHashSet<java.lang.Integer> linkedhashset_i6 = new java.util.LinkedHashSet<java.lang.Integer>();
    java.lang.Integer[] i_array10 = new java.lang.Integer[] { 0, 1, 100 };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)linkedhashset_i6, i_array10);
    java.util.Set<java.lang.Integer> set_i12 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)linkedhashset_i6);
    boolean b13 = arraylist_str0.equals((java.lang.Object)set_i12);
    java.util.Set<java.lang.Integer> set_i14 = java.util.Collections.synchronizedSet(set_i12);
    java.lang.Integer i15 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)set_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test11"); }


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
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str74 = arraylist_str16.remove((int)' ');
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

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test12"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    arraylist_str0.trimToSize();
    java.util.Iterator<java.lang.String> iterator_str7 = arraylist_str0.iterator();
    java.util.ListIterator<java.lang.String> listiterator_str8 = arraylist_str0.listIterator();
    java.util.Iterator<java.lang.String> iterator_str9 = arraylist_str0.iterator();
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str0);
    arraylist_str0.clear();
    
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
    org.junit.Assert.assertNotNull(iterator_str9);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test13"); }


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
    java.lang.Class<java.lang.Object[]> cls17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.lang.Object[]> set_obj_array18 = java.util.Collections.checkedSet(set_obj_array16, cls17);
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

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test14"); }


    java.util.ArrayList<java.util.Collections> arraylist_collections0 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array1 = new java.util.Collections[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections0, collections_array1);
    java.util.Collections collections3 = null;
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    int i5 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections0, collections3, comparator_obj4);
    java.util.Collection<java.util.Collections> collection_collections6 = java.util.Collections.unmodifiableCollection((java.util.Collection<java.util.Collections>)arraylist_collections0);
    java.util.Collections collections7 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections0, collections7);
    java.util.Collections collections9 = null;
    java.util.List<java.lang.Boolean> list_b11 = java.util.Collections.singletonList((java.lang.Boolean)true);
    java.util.ArrayList<java.util.Collections> arraylist_collections12 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array13 = new java.util.Collections[] {  };
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections12, collections_array13);
    java.util.Collections collections15 = null;
    java.util.Comparator<java.lang.Object> comparator_obj16 = null;
    int i17 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections12, collections15, comparator_obj16);
    java.util.Collections collections18 = null;
    java.util.Comparator<java.lang.Object> comparator_obj19 = null;
    java.util.Comparator<java.lang.Object> comparator_obj20 = java.util.Collections.reverseOrder(comparator_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj21 = java.util.Collections.reverseOrder(comparator_obj20);
    int i22 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections12, collections18, comparator_obj20);
    java.util.Collections.sort(list_b11, comparator_obj20);
    java.util.Comparator<java.lang.Object> comparator_obj24 = java.util.Collections.reverseOrder(comparator_obj20);
    java.util.Comparator<java.lang.Object> comparator_obj25 = java.util.Collections.reverseOrder(comparator_obj20);
    int i26 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections0, collections9, comparator_obj20);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_collections6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == (-1));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test15"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.lang.Object[] obj_array5 = arraylist_str0.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long6 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long6, long_array11);
    java.util.NavigableSet<java.lang.Long> navigableset_long13 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long6);
    int i14 = arraylist_str0.lastIndexOf((java.lang.Object)treeset_long6);
    java.util.ArrayList<java.lang.Boolean> arraylist_b15 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array18 = new java.lang.Boolean[] { true, false };
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b15, b_array18);
    boolean b20 = arraylist_str0.containsAll((java.util.Collection<java.lang.Boolean>)arraylist_b15);
    java.lang.String str21 = arraylist_str0.toString();
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str0);
    
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
    org.junit.Assert.assertNotNull(b_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[, hi!]"+ "'", str21.equals("[, hi!]"));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test16"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    java.util.ArrayList<java.lang.String> arraylist_str8 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i9 = arraylist_str8.size();
    boolean b10 = arraylist_str0.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str8);
    java.util.Iterator<java.lang.String> iterator_str11 = arraylist_str0.iterator();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = arraylist_str0.get((int)'#');
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
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str11);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test17"); }


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
    java.util.ArrayList<java.lang.String> arraylist_str49 = new java.util.ArrayList<java.lang.String>((java.util.Collection<java.lang.String>)arraylist_str0);
    
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
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test18"); }


    java.util.TreeSet<java.lang.Integer> treeset_i0 = new java.util.TreeSet<java.lang.Integer>();
    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 0 };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)treeset_i0, i_array2);
    java.util.SortedSet<java.lang.Integer> sortedset_i4 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.Integer>)treeset_i0);
    java.util.Set<java.lang.Integer> set_i5 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)sortedset_i4);
    java.util.SortedSet<java.lang.Integer> sortedset_i6 = java.util.Collections.synchronizedSortedSet(sortedset_i4);
    java.util.SortedSet<java.lang.Integer> sortedset_i7 = java.util.Collections.synchronizedSortedSet(sortedset_i6);
    java.lang.Integer i8 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)sortedset_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test19"); }


    java.util.ArrayList<java.lang.Boolean> arraylist_b0 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, true };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b0, b_array3);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b0);
    java.util.ArrayList<java.util.Collections> arraylist_collections6 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array7 = new java.util.Collections[] {  };
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections6, collections_array7);
    java.util.Collections collections9 = null;
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    int i11 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections6, collections9, comparator_obj10);
    java.util.Collection<java.util.Collections> collection_collections12 = java.util.Collections.unmodifiableCollection((java.util.Collection<java.util.Collections>)arraylist_collections6);
    java.util.Collections collections13 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections6, collections13);
    java.util.Collections collections15 = null;
    java.util.List<java.lang.Boolean> list_b17 = java.util.Collections.singletonList((java.lang.Boolean)true);
    java.util.ArrayList<java.util.Collections> arraylist_collections18 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array19 = new java.util.Collections[] {  };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections18, collections_array19);
    java.util.Collections collections21 = null;
    java.util.Comparator<java.lang.Object> comparator_obj22 = null;
    int i23 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections18, collections21, comparator_obj22);
    java.util.Collections collections24 = null;
    java.util.Comparator<java.lang.Object> comparator_obj25 = null;
    java.util.Comparator<java.lang.Object> comparator_obj26 = java.util.Collections.reverseOrder(comparator_obj25);
    java.util.Comparator<java.lang.Object> comparator_obj27 = java.util.Collections.reverseOrder(comparator_obj26);
    int i28 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections18, collections24, comparator_obj26);
    java.util.Collections.sort(list_b17, comparator_obj26);
    java.util.Comparator<java.lang.Object> comparator_obj30 = java.util.Collections.reverseOrder(comparator_obj26);
    java.util.Comparator<java.lang.Object> comparator_obj31 = java.util.Collections.reverseOrder(comparator_obj26);
    int i32 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections6, collections15, comparator_obj26);
    java.util.Comparator<java.lang.Object> comparator_obj33 = java.util.Collections.reverseOrder(comparator_obj26);
    java.util.Comparator<java.lang.Object> comparator_obj34 = java.util.Collections.reverseOrder(comparator_obj33);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b0, comparator_obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_collections12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj34);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test20"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, (-1) };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array3);
    java.lang.Integer i5 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i0);
    int i7 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i0, (java.lang.Integer)10);
    java.util.ArrayList<java.lang.Integer> arraylist_i8 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array11 = new java.lang.Integer[] { 1, (-1) };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i8, i_array11);
    java.lang.Integer i13 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i8);
    int i15 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i8, (java.lang.Integer)(-3));
    int i17 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i8, (java.lang.Integer)(-3));
    int i18 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i0, (java.util.List<java.lang.Integer>)arraylist_i8);
    java.lang.Class<java.lang.Integer> cls19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.Integer> list_i20 = java.util.Collections.checkedList((java.util.List<java.lang.Integer>)arraylist_i8, cls19);
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
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test21"); }


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
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test22"); }


    java.util.List<java.lang.String> list_str2 = java.util.Collections.nCopies(4, "[hi!, , hi!, ]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test23"); }


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
    java.util.ArrayList<java.lang.String> arraylist_str27 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array30 = new java.lang.String[] { "", "hi!" };
    boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str27, str_array30);
    java.lang.Object[] obj_array32 = arraylist_str27.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long33 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array38 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long33, long_array38);
    java.util.NavigableSet<java.lang.Long> navigableset_long40 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long33);
    int i41 = arraylist_str27.lastIndexOf((java.lang.Object)treeset_long33);
    java.util.ArrayList<java.lang.Boolean> arraylist_b42 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array45 = new java.lang.Boolean[] { true, false };
    boolean b46 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b42, b_array45);
    boolean b47 = arraylist_str27.containsAll((java.util.Collection<java.lang.Boolean>)arraylist_b42);
    boolean b48 = arraylist_str8.contains((java.lang.Object)b47);
    java.util.function.Consumer<java.lang.String> consumer_str49 = null;
    // The following exception was thrown during execution in test generation
    try {
    arraylist_str8.forEach(consumer_str49);
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
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test24"); }


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
    java.util.function.UnaryOperator<java.lang.String> unaryoperator_str13 = null;
    // The following exception was thrown during execution in test generation
    try {
    arraylist_str0.replaceAll(unaryoperator_str13);
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
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test25"); }


    java.util.Comparator<java.lang.Object> comparator_obj0 = null;
    java.util.Comparator<java.lang.Object> comparator_obj1 = java.util.Collections.reverseOrder(comparator_obj0);
    java.util.Comparator<java.lang.Object> comparator_obj2 = java.util.Collections.reverseOrder(comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    java.util.Comparator<java.lang.Object> comparator_obj6 = java.util.Collections.reverseOrder(comparator_obj5);
    java.lang.Object[] obj_array7 = new java.lang.Object[] { comparator_obj2, (short)0, (short)0, comparator_obj5 };
    java.util.Set<java.lang.Object[]> set_obj_array8 = java.util.Collections.singleton(obj_array7);
    java.util.Comparator<java.lang.Object[]> comparator_obj_array9 = null;
    java.lang.Object[] obj_array10 = java.util.Collections.max((java.util.Collection<java.lang.Object[]>)set_obj_array8, comparator_obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test26"); }


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
    int i31 = arraylist_str0.size();
    java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!", "" };
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str32, str_array35);
    java.util.Collection<java.lang.String> collection_str37 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str32);
    arraylist_str32.trimToSize();
    java.util.Iterator<java.lang.String> iterator_str39 = arraylist_str32.iterator();
    java.util.ListIterator<java.lang.String> listiterator_str40 = arraylist_str32.listIterator();
    java.util.ArrayList<java.util.Collections> arraylist_collections41 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array42 = new java.util.Collections[] {  };
    boolean b43 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections41, collections_array42);
    boolean b44 = arraylist_str32.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections41);
    java.util.ArrayList<java.lang.Long> arraylist_long45 = new java.util.ArrayList<java.lang.Long>();
    java.lang.Long[] long_array51 = new java.lang.Long[] { 10L, 100L, 100L, 10L, 10L };
    boolean b52 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long45, long_array51);
    java.lang.Long long53 = java.util.Collections.max((java.util.Collection<java.lang.Long>)arraylist_long45);
    boolean b54 = arraylist_str32.remove((java.lang.Object)long53);
    java.lang.String str56 = arraylist_str32.remove(0);
    java.util.List<java.lang.Boolean> list_b58 = java.util.Collections.singletonList((java.lang.Boolean)true);
    boolean b59 = arraylist_str32.containsAll((java.util.Collection<java.lang.Boolean>)list_b58);
    boolean b60 = arraylist_str0.containsAll((java.util.Collection<java.lang.Boolean>)list_b58);
    
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
    org.junit.Assert.assertTrue(i31 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long53 + "' != '" + 100L+ "'", long53.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!"+ "'", str56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test27"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    arraylist_str0.trimToSize();
    java.util.Iterator<java.lang.String> iterator_str7 = arraylist_str0.iterator();
    java.lang.String str9 = arraylist_str0.remove((int)(byte)0);
    java.util.Comparator<java.lang.String> comparator_str10 = null;
    java.lang.String str11 = java.util.Collections.min((java.util.Collection<java.lang.String>)arraylist_str0, comparator_str10);
    java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!", "" };
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str12, str_array15);
    java.util.Collection<java.lang.String> collection_str17 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str12);
    arraylist_str12.trimToSize();
    java.util.Iterator<java.lang.String> iterator_str19 = arraylist_str12.iterator();
    java.util.Iterator<java.lang.String> iterator_str20 = arraylist_str12.iterator();
    java.util.ArrayList<java.util.Collections> arraylist_collections21 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array22 = new java.util.Collections[] {  };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections21, collections_array22);
    java.util.Collections collections24 = null;
    java.util.Comparator<java.lang.Object> comparator_obj25 = null;
    int i26 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections21, collections24, comparator_obj25);
    java.util.Collection<java.util.Collections> collection_collections27 = java.util.Collections.unmodifiableCollection((java.util.Collection<java.util.Collections>)arraylist_collections21);
    boolean b28 = arraylist_str12.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections21);
    boolean b29 = arraylist_str0.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_collections27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test28"); }


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
    java.util.Set<java.lang.Object[]> set_obj_array16 = java.util.Collections.singleton(obj_array14);
    java.util.Set<java.lang.Object[]> set_obj_array17 = java.util.Collections.unmodifiableSet(set_obj_array16);
    
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
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test29"); }


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
    int i31 = arraylist_str0.size();
    java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array34 = new java.lang.String[] { "" };
    boolean b35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str32, str_array34);
    java.util.Comparator<java.lang.String> comparator_str36 = null;
    java.lang.String str37 = java.util.Collections.min((java.util.Collection<java.lang.String>)arraylist_str32, comparator_str36);
    java.util.stream.Stream<java.lang.String> stream_str38 = arraylist_str32.parallelStream();
    java.util.Comparator<java.lang.String> comparator_str39 = null;
    java.lang.String str40 = java.util.Collections.min((java.util.Collection<java.lang.String>)arraylist_str32, comparator_str39);
    java.util.ArrayList<java.lang.String> arraylist_str41 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array44 = new java.lang.String[] { "", "hi!" };
    boolean b45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str41, str_array44);
    java.lang.Object[] obj_array46 = arraylist_str41.toArray();
    java.util.ArrayDeque<java.lang.String> arraydeque_str47 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array49 = new java.lang.String[] { "hi!" };
    boolean b50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str47, str_array49);
    java.util.Queue<java.lang.String> queue_str51 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str47);
    boolean b52 = arraylist_str41.contains((java.lang.Object)arraydeque_str47);
    java.util.Queue<java.lang.String> queue_str53 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str47);
    int i54 = arraylist_str32.indexOf((java.lang.Object)queue_str53);
    int i55 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)arraylist_str0, (java.lang.Object)i54);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str57 = arraylist_str0.remove(5);
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
    org.junit.Assert.assertTrue(i31 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + ""+ "'", str37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + ""+ "'", str40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test30"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, (-1) };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array3);
    java.lang.Integer i5 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i0);
    int i7 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i0, (java.lang.Integer)10);
    java.util.ArrayList<java.lang.Integer> arraylist_i8 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array11 = new java.lang.Integer[] { 1, (-1) };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i8, i_array11);
    java.lang.Integer i13 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i8);
    int i15 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i8, (java.lang.Integer)10);
    int i16 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i0, (java.util.List<java.lang.Integer>)arraylist_i8);
    java.lang.Class<java.lang.Integer> cls17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.Integer> list_i18 = java.util.Collections.checkedList((java.util.List<java.lang.Integer>)arraylist_i8, cls17);
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
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test31"); }


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
    arraylist_str8.add(0, "hi!");
    
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
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test32"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    arraylist_str0.trimToSize();
    java.lang.String str8 = arraylist_str0.remove((int)(byte)1);
    java.lang.Object[] obj_array9 = arraylist_str0.toArray();
    java.util.Set<java.lang.Object[]> set_obj_array10 = java.util.Collections.singleton(obj_array9);
    java.util.Set<java.lang.Object[]> set_obj_array11 = java.util.Collections.singleton(obj_array9);
    java.util.Comparator<java.lang.Object[]> comparator_obj_array12 = null;
    java.lang.Object[] obj_array13 = java.util.Collections.max((java.util.Collection<java.lang.Object[]>)set_obj_array11, comparator_obj_array12);
    java.lang.Class<java.lang.Object[]> cls14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.lang.Object[]> set_obj_array15 = java.util.Collections.checkedSet(set_obj_array11, cls14);
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test33"); }


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
    int i17 = arraylist_str0.size();
    java.util.List<java.lang.String> list_str18 = java.util.Collections.synchronizedList((java.util.List<java.lang.String>)arraylist_str0);
    java.util.List<java.lang.String> list_str22 = java.util.Collections.nCopies((int)(short)10, "");
    // The following exception was thrown during execution in test generation
    try {
    boolean b23 = arraylist_str0.addAll((-1), (java.util.Collection<java.lang.String>)list_str22);
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
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test34"); }


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
    boolean b26 = arraylist_str0.isEmpty();
    java.util.List<java.lang.String> list_str27 = java.util.Collections.synchronizedList((java.util.List<java.lang.String>)arraylist_str0);
    java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>((java.util.Collection<java.lang.String>)arraylist_str0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str30 = arraylist_str28.get(5);
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
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test35"); }


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
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str20 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array23 = new java.lang.String[] { "", "hi!" };
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str20, str_array23);
    java.lang.Object[] obj_array25 = arraylist_str20.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long26 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array31 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long26, long_array31);
    java.util.NavigableSet<java.lang.Long> navigableset_long33 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long26);
    int i34 = arraylist_str20.lastIndexOf((java.lang.Object)treeset_long26);
    java.lang.String str36 = arraylist_str20.remove((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str37 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array40 = new java.lang.String[] { "hi!", "" };
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str37, str_array40);
    arraylist_str37.add((int)(byte)1, "hi!");
    int i45 = arraylist_str20.lastIndexOf((java.lang.Object)"hi!");
    boolean b46 = arraylist_str19.addAll((java.util.Collection<java.lang.String>)arraylist_str20);
    java.util.stream.Stream<java.lang.String> stream_str47 = arraylist_str20.stream();
    boolean b48 = arraylist_str8.addAll((java.util.Collection<java.lang.String>)arraylist_str20);
    java.util.ListIterator<java.lang.String> listiterator_str49 = arraylist_str8.listIterator();
    int i50 = arraylist_str8.size();
    
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
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test36"); }


    java.util.ArrayList<java.util.Collections> arraylist_collections0 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array1 = new java.util.Collections[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections0, collections_array1);
    java.util.Collection<java.util.Collections> collection_collections3 = java.util.Collections.unmodifiableCollection((java.util.Collection<java.util.Collections>)arraylist_collections0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_collections3);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test37"); }


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
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str20 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array23 = new java.lang.String[] { "", "hi!" };
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str20, str_array23);
    java.lang.Object[] obj_array25 = arraylist_str20.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long26 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array31 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long26, long_array31);
    java.util.NavigableSet<java.lang.Long> navigableset_long33 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long26);
    int i34 = arraylist_str20.lastIndexOf((java.lang.Object)treeset_long26);
    java.lang.String str36 = arraylist_str20.remove((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str37 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array40 = new java.lang.String[] { "hi!", "" };
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str37, str_array40);
    arraylist_str37.add((int)(byte)1, "hi!");
    int i45 = arraylist_str20.lastIndexOf((java.lang.Object)"hi!");
    boolean b46 = arraylist_str19.addAll((java.util.Collection<java.lang.String>)arraylist_str20);
    java.util.stream.Stream<java.lang.String> stream_str47 = arraylist_str20.stream();
    boolean b48 = arraylist_str8.addAll((java.util.Collection<java.lang.String>)arraylist_str20);
    java.util.ListIterator<java.lang.String> listiterator_str49 = arraylist_str8.listIterator();
    java.util.ArrayList<java.lang.String> arraylist_str51 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array54 = new java.lang.String[] { "hi!", "" };
    boolean b55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str51, str_array54);
    arraylist_str51.add((int)(byte)1, "hi!");
    java.util.ArrayList<java.lang.String> arraylist_str59 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array62 = new java.lang.String[] { "hi!", "" };
    boolean b63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str59, str_array62);
    java.util.Collection<java.lang.String> collection_str64 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str59);
    java.util.ArrayList<java.lang.String> arraylist_str67 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i68 = arraylist_str67.size();
    boolean b69 = arraylist_str59.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str67);
    boolean b70 = arraylist_str51.addAll((java.util.Collection<java.lang.String>)arraylist_str59);
    java.util.Spliterator<java.lang.String> spliterator_str71 = arraylist_str59.spliterator();
    java.util.Collection<java.lang.String> collection_str72 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str59);
    java.util.Iterator<java.lang.String> iterator_str73 = arraylist_str59.iterator();
    boolean b74 = arraylist_str8.addAll(1, (java.util.Collection<java.lang.String>)arraylist_str59);
    java.util.ArrayList<java.lang.String> arraylist_str75 = new java.util.ArrayList<java.lang.String>((java.util.Collection<java.lang.String>)arraylist_str8);
    
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
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test38"); }


    java.util.TreeSet<java.util.Random> treeset_random0 = new java.util.TreeSet<java.util.Random>();
    java.util.Random[] random_array1 = new java.util.Random[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)treeset_random0, random_array1);
    java.util.SortedSet<java.util.Random> sortedset_random3 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.util.Random>)treeset_random0);
    java.util.SortedSet<java.util.Random> sortedset_random4 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.util.Random>)treeset_random0);
    java.lang.Class<java.util.Random> cls5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.NavigableSet<java.util.Random> navigableset_random6 = java.util.Collections.checkedNavigableSet((java.util.NavigableSet<java.util.Random>)treeset_random0, cls5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_random3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_random4);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test39"); }


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
    java.lang.String str18 = arraylist_str0.set(1, "[hi!]");
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str21 = arraylist_str0.subList((-3), 5);
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test40"); }


    java.util.TreeSet<java.lang.Integer> treeset_i0 = new java.util.TreeSet<java.lang.Integer>();
    java.lang.Integer[] i_array5 = new java.lang.Integer[] { (-1), 1, 10, 10 };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)treeset_i0, i_array5);
    java.util.SortedSet<java.lang.Integer> sortedset_i7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.Integer>)treeset_i0);
    java.util.SortedSet<java.lang.Integer> sortedset_i8 = java.util.Collections.synchronizedSortedSet(sortedset_i7);
    java.util.List<java.lang.Boolean> list_b10 = java.util.Collections.singletonList((java.lang.Boolean)true);
    java.util.Collections.sort(list_b10);
    java.util.Collections.sort(list_b10);
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = java.util.Collections.disjoint((java.util.Collection<java.lang.Integer>)sortedset_i8, (java.util.Collection<java.lang.Boolean>)list_b10);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b10);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test41"); }


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
    int i34 = arraylist_str0.size();
    java.util.function.Consumer<java.lang.String> consumer_str35 = null;
    // The following exception was thrown during execution in test generation
    try {
    arraylist_str0.forEach(consumer_str35);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 5);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test42"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i2 = arraylist_str1.size();
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str1);
    boolean b4 = arraylist_str1.isEmpty();
    java.lang.Long[] long_array9 = new java.lang.Long[] { 100L, (-1L), 0L, 0L };
    java.lang.Long[] long_array10 = arraylist_str1.toArray(long_array9);
    boolean b11 = arraylist_str1.isEmpty();
    arraylist_str1.trimToSize();
    java.util.function.UnaryOperator<java.lang.String> unaryoperator_str13 = null;
    // The following exception was thrown during execution in test generation
    try {
    arraylist_str1.replaceAll(unaryoperator_str13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test43"); }


    java.util.ArrayList<java.util.Collections> arraylist_collections0 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array1 = new java.util.Collections[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections0, collections_array1);
    java.util.Collections collections3 = null;
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    int i5 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections0, collections3, comparator_obj4);
    java.util.Collection<java.util.Collections> collection_collections6 = java.util.Collections.unmodifiableCollection((java.util.Collection<java.util.Collections>)arraylist_collections0);
    java.util.List<java.util.Collections> list_collections7 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections0);
    java.util.Collections collections8 = null;
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    java.util.Comparator<java.lang.Object> comparator_obj10 = java.util.Collections.reverseOrder(comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = java.util.Collections.reverseOrder(comparator_obj10);
    int i12 = java.util.Collections.binarySearch(list_collections7, collections8, comparator_obj10);
    java.util.Collections collections13 = null;
    java.util.Comparator<java.lang.Object> comparator_obj14 = null;
    java.util.Comparator<java.lang.Object> comparator_obj15 = java.util.Collections.reverseOrder(comparator_obj14);
    java.util.Comparator<java.lang.Object> comparator_obj16 = java.util.Collections.reverseOrder(comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj17 = java.util.Collections.reverseOrder(comparator_obj15);
    int i18 = java.util.Collections.binarySearch(list_collections7, collections13, comparator_obj15);
    java.util.Collections.reverse(list_collections7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_collections6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test44"); }


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
    java.util.ArrayList<java.lang.String> arraylist_str35 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array38 = new java.lang.String[] { "", "hi!" };
    boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str35, str_array38);
    java.lang.Object[] obj_array40 = arraylist_str35.toArray();
    java.util.ArrayDeque<java.lang.String> arraydeque_str41 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    boolean b44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str41, str_array43);
    java.util.Queue<java.lang.String> queue_str45 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str41);
    boolean b46 = arraylist_str35.contains((java.lang.Object)arraydeque_str41);
    java.util.ArrayList<java.lang.Boolean> arraylist_b47 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array50 = new java.lang.Boolean[] { false, false };
    boolean b51 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b47, b_array50);
    boolean b52 = arraydeque_str41.containsAll((java.util.Collection<java.lang.Boolean>)arraylist_b47);
    java.lang.String str53 = arraydeque_str41.toString();
    java.util.Queue<java.lang.String> queue_str54 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str41);
    boolean b55 = arraylist_str9.addAll((java.util.Collection<java.lang.String>)queue_str54);
    
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
    org.junit.Assert.assertNotNull(str_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "[hi!]"+ "'", str53.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test45"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, (-1) };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array3);
    java.lang.Integer i5 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i0);
    int i7 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i0, (java.lang.Integer)10);
    java.util.ArrayList<java.lang.Integer> arraylist_i8 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array10 = new java.lang.Integer[] { 5 };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i8, i_array10);
    int i12 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i0, (java.util.List<java.lang.Integer>)arraylist_i8);
    java.util.ArrayList<java.lang.Integer> arraylist_i13 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array16 = new java.lang.Integer[] { 1, (-1) };
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i13, i_array16);
    java.lang.Integer i18 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i13);
    int i20 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i13, (java.lang.Integer)10);
    java.util.ArrayList<java.lang.Integer> arraylist_i21 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array23 = new java.lang.Integer[] { 5 };
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i21, i_array23);
    int i25 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i13, (java.util.List<java.lang.Integer>)arraylist_i21);
    int i27 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i21, (java.lang.Integer)4);
    int i29 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i21, (java.lang.Integer)5);
    int i30 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i8, (java.util.List<java.lang.Integer>)arraylist_i21);
    java.lang.Class<java.lang.Integer> cls31 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.Integer> list_i32 = java.util.Collections.checkedList((java.util.List<java.lang.Integer>)arraylist_i8, cls31);
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
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test46"); }


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
    java.util.Set<java.util.Random> set_random20 = java.util.Collections.emptySet();
    boolean b21 = arraylist_str0.contains((java.lang.Object)set_random20);
    java.util.NavigableSet<java.util.Collections> navigableset_collections22 = java.util.Collections.emptyNavigableSet();
    boolean b23 = arraylist_str0.removeAll((java.util.Collection<java.util.Collections>)navigableset_collections22);
    arraylist_str0.clear();
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str0);
    int i26 = arraylist_str0.size();
    
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
    org.junit.Assert.assertNotNull(set_random20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_collections22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test47"); }


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
    int i31 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)arraylist_str2, (java.lang.Object)100.0d);
    int i32 = arraylist_str2.size();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str34 = arraylist_str2.remove((int)(short)10);
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
    org.junit.Assert.assertNotNull(list_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test48"); }


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
    int i35 = arraylist_str8.size();
    java.util.function.Consumer<java.lang.String> consumer_str36 = null;
    // The following exception was thrown during execution in test generation
    try {
    arraylist_str8.forEach(consumer_str36);
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
    org.junit.Assert.assertTrue(i35 == 2);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test49"); }


    java.util.List<java.lang.Integer> list_i0 = java.util.Collections.emptyList();
    int i2 = java.util.Collections.binarySearch(list_i0, (java.lang.Integer)2);
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array6 = new java.lang.Integer[] { 1, (-1) };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array6);
    java.lang.Integer i8 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i3);
    int i10 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i3, (java.lang.Integer)10);
    java.util.ArrayList<java.lang.Integer> arraylist_i11 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array14 = new java.lang.Integer[] { 1, (-1) };
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i11, i_array14);
    java.lang.Integer i16 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i11);
    int i18 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i11, (java.lang.Integer)10);
    int i19 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i3, (java.util.List<java.lang.Integer>)arraylist_i11);
    int i20 = java.util.Collections.indexOfSubList(list_i0, (java.util.List<java.lang.Integer>)arraylist_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test50"); }


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
    java.util.Set<java.util.Random> set_random20 = java.util.Collections.emptySet();
    boolean b21 = arraylist_str0.contains((java.lang.Object)set_random20);
    java.util.NavigableSet<java.util.Collections> navigableset_collections22 = java.util.Collections.emptyNavigableSet();
    boolean b23 = arraylist_str0.removeAll((java.util.Collection<java.util.Collections>)navigableset_collections22);
    java.util.ArrayList<java.lang.String> arraylist_str24 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array27 = new java.lang.String[] { "hi!", "" };
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str24, str_array27);
    java.util.Collection<java.lang.String> collection_str29 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str24);
    arraylist_str24.trimToSize();
    java.util.ArrayDeque<java.lang.String> arraydeque_str31 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array33 = new java.lang.String[] { "hi!" };
    boolean b34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str31, str_array33);
    java.util.Queue<java.lang.String> queue_str35 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str31);
    int i36 = arraylist_str24.indexOf((java.lang.Object)arraydeque_str31);
    java.util.ArrayList<java.lang.String> arraylist_str38 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array41 = new java.lang.String[] { "hi!", "" };
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str38, str_array41);
    java.util.Collection<java.lang.String> collection_str43 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str38);
    java.util.ArrayList<java.lang.String> arraylist_str46 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i47 = arraylist_str46.size();
    boolean b48 = arraylist_str38.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str46);
    java.util.NavigableSet<java.util.Collections> navigableset_collections49 = java.util.Collections.emptyNavigableSet();
    boolean b50 = arraylist_str38.removeAll((java.util.Collection<java.util.Collections>)navigableset_collections49);
    java.util.Iterator<java.lang.String> iterator_str51 = arraylist_str38.iterator();
    arraylist_str38.trimToSize();
    boolean b53 = arraylist_str24.addAll((int)(short)0, (java.util.Collection<java.lang.String>)arraylist_str38);
    java.util.stream.Stream<java.lang.String> stream_str54 = arraylist_str24.stream();
    int i55 = arraylist_str24.size();
    boolean b56 = arraylist_str0.addAll((java.util.Collection<java.lang.String>)arraylist_str24);
    java.util.function.Consumer<java.lang.String> consumer_str57 = null;
    // The following exception was thrown during execution in test generation
    try {
    arraylist_str0.forEach(consumer_str57);
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
    org.junit.Assert.assertNotNull(set_random20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_collections22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_collections49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);

  }

}
