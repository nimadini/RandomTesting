
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.lang.Long[] long_array11 = new java.lang.Long[] { 1L, 1L, 10L, (-1L), 0L, 1L };
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Long[] long_array12 = arraylist_str0.toArray(long_array11);
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
    org.junit.Assert.assertNotNull(long_array11);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    java.util.Random random0 = null;
    java.util.Map<java.util.Random,java.lang.Integer> map_random_i2 = java.util.Collections.singletonMap(random0, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_random_i2);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    java.util.Map<java.util.Random,java.lang.Boolean> map_random_b0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.util.Random> set_random1 = java.util.Collections.newSetFromMap(map_random_b0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    java.util.Comparator<java.lang.String> comparator_str6 = null;
    java.lang.String str7 = java.util.Collections.min(collection_str5, comparator_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    java.util.Map<java.lang.String,java.lang.String> map_str_str0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = java.util.Collections.synchronizedMap(map_str_str0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    java.util.function.Predicate<java.lang.Object> predicate_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = arraylist_str0.removeIf(predicate_obj6);
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

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    java.util.List<java.lang.Integer> list_i0 = null;
    java.lang.Class<java.lang.Integer> cls1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.Integer> list_i2 = java.util.Collections.checkedList(list_i0, cls1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    java.util.Iterator<java.lang.Boolean> iterator_b0 = java.util.Collections.emptyIterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    java.util.Comparator<java.lang.Long> comparator_long0 = java.util.Collections.reverseOrder();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_long0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    java.util.Enumeration<java.util.Collections> enumeration_collections0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.ArrayList<java.util.Collections> arraylist_collections1 = java.util.Collections.list(enumeration_collections0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    java.util.Map<java.lang.Integer,java.lang.Long> map_i_long0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map<java.lang.Integer,java.lang.Long> map_i_long1 = java.util.Collections.unmodifiableMap(map_i_long0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    java.util.SortedMap<java.util.Collections,java.util.Collections> sortedmap_collections_collections0 = java.util.Collections.emptySortedMap();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedmap_collections_collections0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


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
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = arraylist_str0.get((int)(short)100);
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

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


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
    java.util.function.UnaryOperator<java.lang.String> unaryoperator_str20 = null;
    // The following exception was thrown during execution in test generation
    try {
    arraylist_str8.replaceAll(unaryoperator_str20);
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

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


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
    java.lang.Long[] long_array24 = new java.lang.Long[] { (-1L), 100L, (-1L), 0L };
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Long[] long_array25 = arraylist_str0.toArray(long_array24);
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
    org.junit.Assert.assertNotNull(long_array24);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    java.util.ArrayList<java.lang.Long> arraylist_long0 = new java.util.ArrayList<java.lang.Long>();
    java.lang.Long[] long_array3 = new java.lang.Long[] { 10L, 10L };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long0, long_array3);
    java.lang.Long long5 = java.util.Collections.max((java.util.Collection<java.lang.Long>)arraylist_long0);
    boolean b8 = java.util.Collections.replaceAll((java.util.List<java.lang.Long>)arraylist_long0, (java.lang.Long)100L, (java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L+ "'", long5.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, (-1) };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array3);
    java.lang.Integer i5 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i0);
    java.lang.Class<java.lang.Integer> cls6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.Integer> list_i7 = java.util.Collections.checkedList((java.util.List<java.lang.Integer>)arraylist_i0, cls6);
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

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    java.util.SortedMap<java.lang.String,java.lang.Object[]> sortedmap_str_obj_array0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.SortedMap<java.lang.String,java.lang.Object[]> sortedmap_str_obj_array1 = java.util.Collections.unmodifiableSortedMap(sortedmap_str_obj_array0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


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
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = arraylist_str0.get((int)(byte)10);
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
    org.junit.Assert.assertNotNull(navigableset_collections11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str13);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Comparator<java.lang.String> comparator_str5 = null;
    arraylist_str0.sort(comparator_str5);
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str9 = arraylist_str0.subList(1, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    java.util.Collection<java.lang.Long> collection_long0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Long long1 = java.util.Collections.max(collection_long0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    java.util.SortedMap<java.lang.Object[],java.util.Collections> sortedmap_obj_array_collections0 = null;
    java.lang.Class<java.lang.Object[]> cls1 = null;
    java.lang.Class<java.util.Collections> cls2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.SortedMap<java.lang.Object[],java.util.Collections> sortedmap_obj_array_collections3 = java.util.Collections.checkedSortedMap(sortedmap_obj_array_collections0, cls1, cls2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    java.util.TreeSet<java.util.Collections> treeset_collections0 = new java.util.TreeSet<java.util.Collections>();
    java.util.Collections[] collections_array1 = new java.util.Collections[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)treeset_collections0, collections_array1);
    java.lang.Class<java.util.Collections> cls3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.SortedSet<java.util.Collections> sortedset_collections4 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.util.Collections>)treeset_collections0, cls3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    java.util.NavigableMap<java.lang.Integer,java.lang.String> navigablemap_i_str0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.NavigableMap<java.lang.Integer,java.lang.String> navigablemap_i_str1 = java.util.Collections.unmodifiableNavigableMap(navigablemap_i_str0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str3 = arraylist_str1.remove((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    java.util.List<java.util.Random> list_random0 = java.util.Collections.EMPTY_LIST;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_random0);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    java.util.ArrayList<java.lang.String> arraylist_str8 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i9 = arraylist_str8.size();
    boolean b10 = arraylist_str0.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str8);
    java.util.NavigableSet<java.util.Collections> navigableset_collections11 = java.util.Collections.emptyNavigableSet();
    boolean b12 = arraylist_str0.removeAll((java.util.Collection<java.util.Collections>)navigableset_collections11);
    java.lang.Class<java.util.Collections> cls13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.SortedSet<java.util.Collections> sortedset_collections14 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.util.Collections>)navigableset_collections11, cls13);
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
    org.junit.Assert.assertNotNull(navigableset_collections11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    java.util.NavigableMap<java.util.Collections,java.lang.Boolean> navigablemap_collections_b0 = java.util.Collections.emptyNavigableMap();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigablemap_collections_b0);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    java.util.NavigableMap<java.lang.Object,java.util.Collections> navigablemap_obj_collections0 = null;
    java.lang.Class<java.lang.Object> cls1 = null;
    java.lang.Class<java.util.Collections> cls2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.NavigableMap<java.lang.Object,java.util.Collections> navigablemap_obj_collections3 = java.util.Collections.checkedNavigableMap(navigablemap_obj_collections0, cls1, cls2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    java.util.SortedMap<java.lang.Object,java.lang.String> sortedmap_obj_str0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.SortedMap<java.lang.Object,java.lang.String> sortedmap_obj_str1 = java.util.Collections.synchronizedSortedMap(sortedmap_obj_str0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array6 = new java.lang.Integer[] { 100, 100, 1, 100, 100 };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array6);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collections.swap((java.util.List<java.lang.Integer>)arraylist_i0, 0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    java.util.TreeSet<java.util.Random> treeset_random0 = new java.util.TreeSet<java.util.Random>();
    java.util.Random[] random_array1 = new java.util.Random[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)treeset_random0, random_array1);
    java.lang.Class<java.util.Random> cls3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.NavigableSet<java.util.Random> navigableset_random4 = java.util.Collections.checkedNavigableSet((java.util.NavigableSet<java.util.Random>)treeset_random0, cls3);
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

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i2 = arraylist_str1.size();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = arraylist_str1.set((int)(short)100, "");
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
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    java.util.Map<java.util.Collections,java.lang.Integer> map_collections_i0 = java.util.Collections.EMPTY_MAP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_collections_i0);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array2);
    java.util.Comparator<java.lang.String> comparator_str4 = null;
    java.lang.String str5 = java.util.Collections.min((java.util.Collection<java.lang.String>)arraylist_str0, comparator_str4);
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "" };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array9);
    arraylist_str6.add((int)(byte)1, "hi!");
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!", "" };
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array17);
    java.util.Collection<java.lang.String> collection_str19 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str14);
    java.util.ArrayList<java.lang.String> arraylist_str22 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i23 = arraylist_str22.size();
    boolean b24 = arraylist_str14.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str22);
    boolean b25 = arraylist_str6.addAll((java.util.Collection<java.lang.String>)arraylist_str14);
    java.util.Collection<java.lang.String> collection_str26 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b27 = arraylist_str0.addAll(collection_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
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
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    java.util.LinkedHashSet<java.lang.Object[]> linkedhashset_obj_array0 = new java.util.LinkedHashSet<java.lang.Object[]>();
    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!", "" };
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str1, str_array4);
    java.util.Collection<java.lang.String> collection_str6 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str1);
    arraylist_str1.trimToSize();
    java.util.Iterator<java.lang.String> iterator_str8 = arraylist_str1.iterator();
    java.util.Iterator<java.lang.String> iterator_str9 = arraylist_str1.iterator();
    java.util.ArrayList<java.util.Random> arraylist_random10 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array11 = new java.util.Random[] {  };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random10, random_array11);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random10, (int)(byte)0);
    java.lang.Object[] obj_array15 = new java.lang.Object[] { arraylist_str1, (byte)0 };
    java.util.Set<java.lang.Object[]> set_obj_array16 = java.util.Collections.singleton(obj_array15);
    java.util.ArrayList<java.lang.String> arraylist_str17 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!", "" };
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str17, str_array20);
    java.util.Collection<java.lang.String> collection_str22 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str17);
    arraylist_str17.trimToSize();
    java.util.Iterator<java.lang.String> iterator_str24 = arraylist_str17.iterator();
    java.util.Iterator<java.lang.String> iterator_str25 = arraylist_str17.iterator();
    java.util.ArrayList<java.util.Random> arraylist_random26 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array27 = new java.util.Random[] {  };
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random26, random_array27);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random26, (int)(byte)0);
    java.lang.Object[] obj_array31 = new java.lang.Object[] { arraylist_str17, (byte)0 };
    java.util.Set<java.lang.Object[]> set_obj_array32 = java.util.Collections.singleton(obj_array31);
    java.lang.Object[][] obj_array_array33 = new java.lang.Object[][] { obj_array15, obj_array31 };
    boolean b34 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)linkedhashset_obj_array0, obj_array_array33);
    java.lang.Class<java.lang.Object[]> cls35 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.lang.Object[]> set_obj_array36 = java.util.Collections.checkedSet((java.util.Set<java.lang.Object[]>)linkedhashset_obj_array0, cls35);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    java.util.Spliterator<java.lang.String> spliterator_str2 = arraylist_str1.spliterator();
    // The following exception was thrown during execution in test generation
    try {
    java.util.ListIterator<java.lang.String> listiterator_str4 = arraylist_str1.listIterator((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str2);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    int i7 = arraylist_str0.lastIndexOf((java.lang.Object)10L);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = arraylist_str0.get((int)'#');
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
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


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
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str31 = arraylist_str2.get(1);
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
    org.junit.Assert.assertNotNull(stream_str29);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    arraylist_str0.trimToSize();
    java.util.Iterator<java.lang.String> iterator_str7 = arraylist_str0.iterator();
    java.util.Iterator<java.lang.String> iterator_str8 = arraylist_str0.iterator();
    java.lang.Long[] long_array11 = new java.lang.Long[] { (-1L), 100L };
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Long[] long_array12 = arraylist_str0.toArray(long_array11);
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
    org.junit.Assert.assertNotNull(iterator_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


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
    java.util.function.Predicate<java.lang.Object> predicate_obj24 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b25 = arraylist_str0.removeIf(predicate_obj24);
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
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, (-1) };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array3);
    java.lang.Integer i5 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i0);
    java.lang.Integer i6 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i0);
    int i8 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i0, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    java.util.ArrayList<java.lang.Object[]> arraylist_obj_array0 = new java.util.ArrayList<java.lang.Object[]>();
    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!", "" };
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str1, str_array4);
    java.util.Collection<java.lang.String> collection_str6 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str1);
    arraylist_str1.trimToSize();
    java.util.Iterator<java.lang.String> iterator_str8 = arraylist_str1.iterator();
    java.util.Iterator<java.lang.String> iterator_str9 = arraylist_str1.iterator();
    java.util.ArrayList<java.util.Random> arraylist_random10 = new java.util.ArrayList<java.util.Random>();
    java.util.Random[] random_array11 = new java.util.Random[] {  };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.util.Random>)arraylist_random10, random_array11);
    java.util.Collections.rotate((java.util.List<java.util.Random>)arraylist_random10, (int)(byte)0);
    java.lang.Object[] obj_array15 = new java.lang.Object[] { arraylist_str1, (byte)0 };
    java.util.Set<java.lang.Object[]> set_obj_array16 = java.util.Collections.singleton(obj_array15);
    java.util.ArrayList<java.lang.String> arraylist_str17 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array20 = new java.lang.String[] { "", "hi!" };
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str17, str_array20);
    java.lang.Object[] obj_array22 = arraylist_str17.toArray();
    java.util.ArrayList<java.lang.String> arraylist_str24 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str25 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array28 = new java.lang.String[] { "", "hi!" };
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str25, str_array28);
    java.lang.Object[] obj_array30 = arraylist_str25.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long31 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array36 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long31, long_array36);
    java.util.NavigableSet<java.lang.Long> navigableset_long38 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long31);
    int i39 = arraylist_str25.lastIndexOf((java.lang.Object)treeset_long31);
    java.lang.String str41 = arraylist_str25.remove((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str42 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array45 = new java.lang.String[] { "hi!", "" };
    boolean b46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str42, str_array45);
    arraylist_str42.add((int)(byte)1, "hi!");
    int i50 = arraylist_str25.lastIndexOf((java.lang.Object)"hi!");
    boolean b51 = arraylist_str24.addAll((java.util.Collection<java.lang.String>)arraylist_str25);
    arraylist_str24.add((int)(byte)0, "");
    java.lang.Object[] obj_array55 = arraylist_str24.toArray();
    java.lang.Object[][] obj_array_array56 = new java.lang.Object[][] { obj_array15, obj_array22, obj_array55 };
    boolean b57 = java.util.Collections.addAll((java.util.Collection<java.lang.Object[]>)arraylist_obj_array0, obj_array_array56);
    java.util.Comparator<java.lang.Object[]> comparator_obj_array58 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object[] obj_array59 = java.util.Collections.max((java.util.Collection<java.lang.Object[]>)arraylist_obj_array0, comparator_obj_array58);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


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
    java.lang.Class<java.lang.Object[]> cls16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.lang.Object[]> set_obj_array17 = java.util.Collections.checkedSet(set_obj_array15, cls16);
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

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    java.util.NavigableMap<java.util.Collections,java.util.Random> navigablemap_collections_random0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.NavigableMap<java.util.Collections,java.util.Random> navigablemap_collections_random1 = java.util.Collections.synchronizedNavigableMap(navigablemap_collections_random0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    java.util.ArrayList<java.lang.Long> arraylist_long0 = new java.util.ArrayList<java.lang.Long>();
    java.lang.Long[] long_array3 = new java.lang.Long[] { 10L, 10L };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long0, long_array3);
    java.lang.Long long5 = java.util.Collections.max((java.util.Collection<java.lang.Long>)arraylist_long0);
    boolean b8 = java.util.Collections.replaceAll((java.util.List<java.lang.Long>)arraylist_long0, (java.lang.Long)(-1L), (java.lang.Long)100L);
    java.lang.Class<java.lang.Long> cls9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collection<java.lang.Long> collection_long10 = java.util.Collections.checkedCollection((java.util.Collection<java.lang.Long>)arraylist_long0, cls9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L+ "'", long5.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    java.util.List<java.lang.Object[]> list_obj_array0 = null;
    java.util.Random random1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collections.shuffle(list_obj_array0, random1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }


    java.util.List<java.lang.String> list_str2 = java.util.Collections.nCopies(2, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }


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
    java.lang.Object[] obj_array32 = arraylist_str1.toArray();
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str35 = arraylist_str1.subList((int)(short)100, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
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
    org.junit.Assert.assertNotNull(obj_array32);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i2 = arraylist_str1.size();
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str1);
    java.util.function.UnaryOperator<java.lang.String> unaryoperator_str4 = null;
    // The following exception was thrown during execution in test generation
    try {
    arraylist_str1.replaceAll(unaryoperator_str4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

}
