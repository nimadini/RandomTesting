
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test01"); }


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
    java.util.ArrayList<java.lang.String> arraylist_str31 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i32 = arraylist_str31.size();
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str31);
    boolean b34 = arraylist_str31.isEmpty();
    java.lang.Long[] long_array39 = new java.lang.Long[] { 100L, (-1L), 0L, 0L };
    java.lang.Long[] long_array40 = arraylist_str31.toArray(long_array39);
    java.util.Set<java.lang.Object[]> set_obj_array41 = java.util.Collections.singleton((java.lang.Object[])long_array39);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Long[] long_array42 = arraylist_str0.toArray(long_array39);
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
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array41);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test02"); }


    java.util.ArrayList<java.util.Random> arraylist_random0 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array1 = new java.util.Random[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random0, random_array1);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random0, (int)(short)0);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random0, 100);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random0, (-3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test03"); }


    java.util.TreeSet<java.lang.Integer> treeset_i0 = new java.util.TreeSet<java.lang.Integer>();
    java.lang.Integer[] i_array5 = new java.lang.Integer[] { (-1), 1, 10, 10 };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)treeset_i0, i_array5);
    java.util.SortedSet<java.lang.Integer> sortedset_i7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.Integer>)treeset_i0);
    java.util.SortedSet<java.lang.Integer> sortedset_i8 = java.util.Collections.synchronizedSortedSet(sortedset_i7);
    java.util.Set<java.lang.Integer> set_i9 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)sortedset_i8);
    java.util.Set<java.lang.Integer> set_i10 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)sortedset_i8);
    
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
    org.junit.Assert.assertNotNull(set_i10);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test04"); }


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
    boolean b21 = arraylist_str0.isEmpty();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test05"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, (-1) };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array3);
    java.lang.Integer i5 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i0);
    int i7 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i0, (java.lang.Integer)10);
    java.util.ArrayList<java.lang.Integer> arraylist_i8 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array10 = new java.lang.Integer[] { 5 };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i8, i_array10);
    int i12 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i0, (java.util.List<java.lang.Integer>)arraylist_i8);
    java.lang.Integer i13 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i8);
    
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
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 5+ "'", i13.equals(5));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test06"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>((int)'4');
    boolean b3 = arraylist_str1.equals((java.lang.Object)"[]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test07"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    java.util.ArrayList<java.lang.String> arraylist_str8 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i9 = arraylist_str8.size();
    boolean b10 = arraylist_str0.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str8);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = arraylist_str8.get(1);
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

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test08"); }


    java.util.SortedSet<java.util.Random> sortedset_random0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.SortedSet<java.util.Random> sortedset_random1 = java.util.Collections.unmodifiableSortedSet(sortedset_random0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test09"); }


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
    java.lang.Boolean[] b_array97 = new java.lang.Boolean[] {  };
    boolean b98 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>)arraylist_obj26, b_array97);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b98 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test10"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    java.util.Spliterator<java.lang.String> spliterator_str2 = arraylist_str1.spliterator();
    int i4 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)arraylist_str1, (java.lang.Object)10);
    java.util.function.Predicate<java.lang.Object> predicate_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = arraylist_str1.removeIf(predicate_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test11"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array2);
    java.util.Comparator<java.lang.String> comparator_str4 = null;
    java.lang.String str5 = java.util.Collections.min((java.util.Collection<java.lang.String>)arraylist_str0, comparator_str4);
    java.util.stream.Stream<java.lang.String> stream_str6 = arraylist_str0.parallelStream();
    java.util.Comparator<java.lang.String> comparator_str7 = null;
    java.lang.String str8 = java.util.Collections.min((java.util.Collection<java.lang.String>)arraylist_str0, comparator_str7);
    boolean b9 = arraylist_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test12"); }


    java.util.ArrayList<java.util.Random> arraylist_random0 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array1 = new java.util.Random[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random0, random_array1);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random0, (int)(byte)0);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random0, (int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test13"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    arraylist_str0.trimToSize();
    java.lang.String str8 = arraylist_str0.remove((int)(byte)1);
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
    org.junit.Assert.assertNotNull(collection_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
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
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test14"); }


    java.util.List<java.lang.String> list_str2 = java.util.Collections.nCopies((int)(short)10, "");
    java.util.Comparator<java.lang.String> comparator_str3 = null;
    java.lang.String str4 = java.util.Collections.min((java.util.Collection<java.lang.String>)list_str2, comparator_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test15"); }


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
    java.util.List<java.util.Collections> list_collections29 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections20);
    java.util.Collections collections30 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections20, collections30);
    
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
    org.junit.Assert.assertNotNull(list_collections29);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test16"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, (-1) };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array3);
    java.lang.Integer i5 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i0);
    int i7 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i0, (java.lang.Integer)(-3));
    java.lang.Class<java.lang.Integer> cls8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.Integer> list_i9 = java.util.Collections.checkedList((java.util.List<java.lang.Integer>)arraylist_i0, cls8);
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
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test17"); }


    java.util.TreeSet<java.lang.Integer> treeset_i0 = new java.util.TreeSet<java.lang.Integer>();
    java.lang.Integer[] i_array5 = new java.lang.Integer[] { (-1), 1, 10, 10 };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)treeset_i0, i_array5);
    java.util.SortedSet<java.lang.Integer> sortedset_i7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.Integer>)treeset_i0);
    java.util.SortedSet<java.lang.Integer> sortedset_i8 = java.util.Collections.synchronizedSortedSet(sortedset_i7);
    java.util.Set<java.lang.Integer> set_i9 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)sortedset_i8);
    java.util.SortedSet<java.lang.Integer> sortedset_i10 = java.util.Collections.synchronizedSortedSet(sortedset_i8);
    java.util.Set<java.lang.Integer> set_i11 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)sortedset_i8);
    
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
    org.junit.Assert.assertNotNull(set_i11);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test18"); }


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
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!", "" };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str16, str_array19);
    arraylist_str16.add((int)(byte)1, "hi!");
    java.util.ArrayList<java.lang.String> arraylist_str24 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array27 = new java.lang.String[] { "hi!", "" };
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str24, str_array27);
    java.util.Collection<java.lang.String> collection_str29 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str24);
    java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i33 = arraylist_str32.size();
    boolean b34 = arraylist_str24.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str32);
    boolean b35 = arraylist_str16.addAll((java.util.Collection<java.lang.String>)arraylist_str24);
    java.util.Collection<java.lang.String> collection_str36 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str16);
    boolean b37 = arraylist_str0.addAll(collection_str36);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str40 = arraylist_str0.set(10, "[hi!, ]");
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
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test19"); }


    java.util.TreeSet<java.lang.Long> treeset_long0 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array5 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long0, long_array5);
    java.util.NavigableSet<java.lang.Long> navigableset_long7 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long0);
    java.util.NavigableSet<java.lang.Long> navigableset_long8 = java.util.Collections.unmodifiableNavigableSet(navigableset_long7);
    java.lang.Long long9 = java.util.Collections.max((java.util.Collection<java.lang.Long>)navigableset_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L+ "'", long9.equals(10L));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test20"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, (-1) };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array3);
    java.lang.Integer i5 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i0);
    int i7 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i0, (java.lang.Integer)10);
    java.lang.Class<java.lang.Integer> cls8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.Integer> list_i9 = java.util.Collections.checkedList((java.util.List<java.lang.Integer>)arraylist_i0, cls8);
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

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test21"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, (-1) };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array3);
    java.lang.Integer i5 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i0);
    int i7 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i0, (java.lang.Integer)(-3));
    java.util.ArrayList<java.lang.Integer> arraylist_i8 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array11 = new java.lang.Integer[] { 1, (-1) };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i8, i_array11);
    java.lang.Integer i13 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i8);
    java.lang.Integer i14 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i8);
    java.lang.Integer i15 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i8);
    int i16 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i0, (java.util.List<java.lang.Integer>)arraylist_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test22"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.lang.Object[] obj_array5 = arraylist_str0.toArray();
    java.lang.Object obj6 = null;
    int i7 = arraylist_str0.indexOf(obj6);
    java.util.stream.Stream<java.lang.String> stream_str8 = arraylist_str0.parallelStream();
    java.lang.String str10 = arraylist_str0.remove(0);
    boolean b12 = arraylist_str0.add("");
    java.util.stream.Stream<java.lang.String> stream_str13 = arraylist_str0.parallelStream();
    
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
    org.junit.Assert.assertNotNull(stream_str13);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test23"); }


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
    java.lang.Class<java.util.Collections> cls24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.SortedSet<java.util.Collections> sortedset_collections25 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.util.Collections>)navigableset_collections22, cls24);
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

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test24"); }


    java.util.ArrayList<java.lang.Long> arraylist_long0 = new java.util.ArrayList<java.lang.Long>();
    java.lang.Long[] long_array5 = new java.lang.Long[] { 0L, 0L, 0L, 0L };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long0, long_array5);
    java.lang.Long long7 = java.util.Collections.max((java.util.Collection<java.lang.Long>)arraylist_long0);
    java.lang.Class<java.lang.Long> cls8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collection<java.lang.Long> collection_long9 = java.util.Collections.checkedCollection((java.util.Collection<java.lang.Long>)arraylist_long0, cls8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L+ "'", long7.equals(0L));

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test25"); }


    java.util.LinkedHashSet<java.lang.Integer> linkedhashset_i0 = new java.util.LinkedHashSet<java.lang.Integer>();
    java.lang.Integer[] i_array4 = new java.lang.Integer[] { 0, 1, 100 };
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)linkedhashset_i0, i_array4);
    java.util.Set<java.lang.Integer> set_i6 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)linkedhashset_i0);
    java.util.Set<java.lang.Integer> set_i7 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)linkedhashset_i0);
    java.lang.Integer i8 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)linkedhashset_i0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test26"); }


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
    java.util.Comparator<java.lang.String> comparator_str32 = null;
    arraylist_str1.sort(comparator_str32);
    boolean b35 = arraylist_str1.add("[hi!]");
    java.util.ArrayList<java.lang.String> arraylist_str36 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!", "" };
    boolean b40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str36, str_array39);
    java.util.Collection<java.lang.String> collection_str41 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str36);
    arraylist_str36.clear();
    java.util.ArrayList<java.lang.String> arraylist_str43 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array46 = new java.lang.String[] { "", "hi!" };
    boolean b47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str43, str_array46);
    java.lang.Object[] obj_array48 = arraylist_str43.toArray();
    java.util.ArrayDeque<java.lang.String> arraydeque_str49 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array51 = new java.lang.String[] { "hi!" };
    boolean b52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str49, str_array51);
    java.util.Queue<java.lang.String> queue_str53 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str49);
    boolean b54 = arraylist_str43.contains((java.lang.Object)arraydeque_str49);
    java.util.ArrayList<java.lang.Boolean> arraylist_b55 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array58 = new java.lang.Boolean[] { false, false };
    boolean b59 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b55, b_array58);
    boolean b60 = arraydeque_str49.containsAll((java.util.Collection<java.lang.Boolean>)arraylist_b55);
    boolean b61 = arraylist_str36.containsAll((java.util.Collection<java.lang.Boolean>)arraylist_b55);
    java.util.ArrayList<java.lang.String> arraylist_str63 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i64 = arraylist_str63.size();
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str63);
    boolean b66 = arraylist_str63.isEmpty();
    java.lang.Long[] long_array71 = new java.lang.Long[] { 100L, (-1L), 0L, 0L };
    java.lang.Long[] long_array72 = arraylist_str63.toArray(long_array71);
    java.util.Set<java.lang.Object[]> set_obj_array73 = java.util.Collections.singleton((java.lang.Object[])long_array71);
    java.lang.Long[] long_array74 = arraylist_str36.toArray(long_array71);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Long[] long_array75 = arraylist_str1.toArray(long_array74);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayStoreException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException, got " + e.getClass().getCanonicalName());
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
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array74);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test27"); }


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
    int i49 = arraylist_str20.size();
    java.util.function.UnaryOperator<java.lang.String> unaryoperator_str50 = null;
    // The following exception was thrown during execution in test generation
    try {
    arraylist_str20.replaceAll(unaryoperator_str50);
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
    org.junit.Assert.assertTrue(i49 == 1);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test28"); }


    java.util.TreeSet<java.lang.Integer> treeset_i0 = new java.util.TreeSet<java.lang.Integer>();
    java.lang.Integer[] i_array5 = new java.lang.Integer[] { (-1), 1, 10, 10 };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)treeset_i0, i_array5);
    java.util.SortedSet<java.lang.Integer> sortedset_i7 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.Integer>)treeset_i0);
    java.util.SortedSet<java.lang.Integer> sortedset_i8 = java.util.Collections.synchronizedSortedSet(sortedset_i7);
    java.util.Set<java.lang.Integer> set_i9 = java.util.Collections.synchronizedSet((java.util.Set<java.lang.Integer>)sortedset_i8);
    java.util.Set<java.lang.Integer> set_i10 = java.util.Collections.synchronizedSet(set_i9);
    java.lang.Integer i11 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)set_i9);
    
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
    org.junit.Assert.assertNotNull(set_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test29"); }


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
    java.util.Collections.sort(list_b45);
    
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
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test30"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array2);
    java.util.Comparator<java.lang.String> comparator_str4 = null;
    java.lang.String str5 = java.util.Collections.min((java.util.Collection<java.lang.String>)arraylist_str0, comparator_str4);
    java.util.stream.Stream<java.lang.String> stream_str6 = arraylist_str0.parallelStream();
    java.util.Comparator<java.lang.String> comparator_str7 = null;
    java.lang.String str8 = java.util.Collections.min((java.util.Collection<java.lang.String>)arraylist_str0, comparator_str7);
    java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str9, str_array12);
    java.lang.Object[] obj_array14 = arraylist_str9.toArray();
    java.util.ArrayDeque<java.lang.String> arraydeque_str15 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!" };
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str15, str_array17);
    java.util.Queue<java.lang.String> queue_str19 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str15);
    boolean b20 = arraylist_str9.contains((java.lang.Object)arraydeque_str15);
    java.util.Queue<java.lang.String> queue_str21 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str15);
    int i22 = arraylist_str0.indexOf((java.lang.Object)queue_str21);
    java.util.Comparator<java.lang.String> comparator_str23 = null;
    java.lang.String str24 = java.util.Collections.min((java.util.Collection<java.lang.String>)queue_str21, comparator_str23);
    java.util.ArrayList<java.lang.String> arraylist_str25 = new java.util.ArrayList<java.lang.String>((java.util.Collection<java.lang.String>)queue_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test31"); }


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
    java.util.Spliterator<java.lang.String> spliterator_str29 = arraylist_str2.spliterator();
    java.util.List<java.lang.String> list_str30 = java.util.Collections.synchronizedList((java.util.List<java.lang.String>)arraylist_str2);
    
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
    org.junit.Assert.assertNotNull(spliterator_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str30);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test32"); }


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
    java.util.Collection<java.util.Collections> collection_collections35 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b36 = arraylist_str2.removeAll(collection_collections35);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str34);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test33"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i2 = arraylist_str1.size();
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str1);
    boolean b4 = arraylist_str1.isEmpty();
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>((java.util.Collection<java.lang.String>)arraylist_str1);
    arraylist_str5.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = arraylist_str5.remove(4);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test34"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.lang.Object[] obj_array5 = arraylist_str0.toArray();
    java.util.ArrayDeque<java.lang.String> arraydeque_str6 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str6, str_array8);
    java.util.Queue<java.lang.String> queue_str10 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str6);
    boolean b11 = arraylist_str0.contains((java.lang.Object)arraydeque_str6);
    java.util.ArrayList<java.lang.Boolean> arraylist_b12 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array15 = new java.lang.Boolean[] { false, false };
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b12, b_array15);
    boolean b17 = arraydeque_str6.containsAll((java.util.Collection<java.lang.Boolean>)arraylist_b12);
    java.lang.String str18 = arraydeque_str6.toString();
    java.util.Queue<java.lang.String> queue_str19 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str6);
    java.util.Queue<java.lang.String> queue_str20 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str6);
    java.util.Queue<java.lang.String> queue_str21 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str6);
    
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
    org.junit.Assert.assertNotNull(b_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[hi!]"+ "'", str18.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(queue_str21);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test35"); }


    java.util.TreeSet<java.lang.Long> treeset_long0 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array5 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long0, long_array5);
    java.util.NavigableSet<java.lang.Long> navigableset_long7 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long0);
    java.util.NavigableSet<java.lang.Long> navigableset_long8 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long0);
    java.lang.Class<java.lang.Long> cls9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collection<java.lang.Long> collection_long10 = java.util.Collections.checkedCollection((java.util.Collection<java.lang.Long>)treeset_long0, cls9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long8);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test36"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    java.util.ArrayList<java.lang.String> arraylist_str8 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i9 = arraylist_str8.size();
    boolean b10 = arraylist_str0.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str8);
    java.util.NavigableSet<java.util.Collections> navigableset_collections11 = java.util.Collections.emptyNavigableSet();
    boolean b12 = arraylist_str0.removeAll((java.util.Collection<java.util.Collections>)navigableset_collections11);
    java.util.Iterator<java.lang.String> iterator_str13 = arraylist_str0.iterator();
    arraylist_str0.trimToSize();
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>((int)'4');
    boolean b17 = arraylist_str0.equals((java.lang.Object)'4');
    
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
    org.junit.Assert.assertNotNull(navigableset_collections11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test37"); }


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
    java.util.ListIterator<java.lang.String> listiterator_str16 = arraylist_str0.listIterator();
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = arraylist_str0.set((int)'#', "[]");
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
    org.junit.Assert.assertNotNull(listiterator_str16);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test38"); }


    java.util.ArrayList<java.util.Collections> arraylist_collections0 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array1 = new java.util.Collections[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections0, collections_array1);
    java.util.Collections collections3 = null;
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    int i5 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections0, collections3, comparator_obj4);
    java.util.Collection<java.util.Collections> collection_collections6 = java.util.Collections.unmodifiableCollection((java.util.Collection<java.util.Collections>)arraylist_collections0);
    java.util.Collection<java.util.Collections> collection_collections7 = java.util.Collections.unmodifiableCollection(collection_collections6);
    java.util.Collection<java.util.Collections> collection_collections8 = java.util.Collections.unmodifiableCollection(collection_collections6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_collections6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_collections7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_collections8);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test39"); }


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
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = arraylist_str0.set(10, "[hi!]");
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

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test40"); }


    java.util.TreeSet<java.lang.Long> treeset_long0 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array5 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long0, long_array5);
    java.util.NavigableSet<java.lang.Long> navigableset_long7 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long0);
    java.util.NavigableSet<java.lang.Long> navigableset_long8 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long0);
    java.util.NavigableSet<java.lang.Long> navigableset_long9 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long9);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test41"); }


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
    java.util.function.UnaryOperator<java.lang.String> unaryoperator_str24 = null;
    // The following exception was thrown during execution in test generation
    try {
    arraylist_str0.replaceAll(unaryoperator_str24);
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
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test42"); }


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
    java.util.List<java.lang.String> list_str14 = java.util.Collections.synchronizedList(list_str13);
    
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
    org.junit.Assert.assertNotNull(list_str14);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test43"); }


    java.util.List<java.lang.String> list_str2 = java.util.Collections.nCopies(4, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test44"); }


    java.util.List<java.lang.String> list_str0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collections.shuffle(list_str0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test45"); }


    java.util.TreeSet<java.lang.Long> treeset_long0 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array5 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long0, long_array5);
    java.util.NavigableSet<java.lang.Long> navigableset_long7 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long0);
    java.lang.Long long8 = java.util.Collections.max((java.util.Collection<java.lang.Long>)navigableset_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L+ "'", long8.equals(10L));

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test46"); }


    java.util.TreeSet<java.lang.Long> treeset_long0 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array2 = new java.lang.Long[] { 1L };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long0, long_array2);
    java.util.NavigableSet<java.lang.Long> navigableset_long4 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long0);
    java.lang.Long long5 = java.util.Collections.max((java.util.Collection<java.lang.Long>)navigableset_long4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L+ "'", long5.equals(1L));

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test47"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i2 = arraylist_str1.size();
    // The following exception was thrown during execution in test generation
    try {
    arraylist_str1.add((int)(short)-1, "[hi!]");
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test48"); }


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
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str28 = arraylist_str0.set(4, "[hi!]");
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
    org.junit.Assert.assertNotNull(set_random20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_collections22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test49"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, (-1) };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array3);
    java.lang.Integer i5 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i0);
    java.lang.Integer i6 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i0);
    java.lang.Integer i7 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i0);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collections.swap((java.util.List<java.lang.Integer>)arraylist_i0, (-1), 5);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test50"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array4 = new java.lang.Integer[] { 1, 2, (-1) };
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array4);
    java.lang.Integer i6 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i0);
    java.util.ArrayList<java.lang.Integer> arraylist_i7 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array11 = new java.lang.Integer[] { 1, 2, (-1) };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i7, i_array11);
    java.lang.Integer i13 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i7);
    int i15 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i7, (java.lang.Integer)1);
    int i16 = java.util.Collections.indexOfSubList((java.util.List<java.lang.Integer>)arraylist_i0, (java.util.List<java.lang.Integer>)arraylist_i7);
    java.lang.Class<java.lang.Integer> cls17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.Integer> list_i18 = java.util.Collections.checkedList((java.util.List<java.lang.Integer>)arraylist_i0, cls17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

}
