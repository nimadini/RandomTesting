
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test01"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>(10);
    java.util.Iterator<java.lang.String> iterator_str2 = arraylist_str1.iterator();
    arraylist_str1.ensureCapacity((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test02"); }


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
    java.util.ArrayList<java.util.Collections> arraylist_collections36 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array37 = new java.util.Collections[] {  };
    boolean b38 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections36, collections_array37);
    java.util.Collections collections39 = null;
    java.util.Comparator<java.lang.Object> comparator_obj40 = null;
    int i41 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections36, collections39, comparator_obj40);
    java.util.Collection<java.util.Collections> collection_collections42 = java.util.Collections.unmodifiableCollection((java.util.Collection<java.util.Collections>)arraylist_collections36);
    java.util.Collections collections43 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections36, collections43);
    java.util.Collections collections45 = null;
    java.util.List<java.lang.Boolean> list_b47 = java.util.Collections.singletonList((java.lang.Boolean)true);
    java.util.ArrayList<java.util.Collections> arraylist_collections48 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array49 = new java.util.Collections[] {  };
    boolean b50 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections48, collections_array49);
    java.util.Collections collections51 = null;
    java.util.Comparator<java.lang.Object> comparator_obj52 = null;
    int i53 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections48, collections51, comparator_obj52);
    java.util.Collections collections54 = null;
    java.util.Comparator<java.lang.Object> comparator_obj55 = null;
    java.util.Comparator<java.lang.Object> comparator_obj56 = java.util.Collections.reverseOrder(comparator_obj55);
    java.util.Comparator<java.lang.Object> comparator_obj57 = java.util.Collections.reverseOrder(comparator_obj56);
    int i58 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections48, collections54, comparator_obj56);
    java.util.Collections.sort(list_b47, comparator_obj56);
    java.util.Comparator<java.lang.Object> comparator_obj60 = java.util.Collections.reverseOrder(comparator_obj56);
    java.util.Comparator<java.lang.Object> comparator_obj61 = java.util.Collections.reverseOrder(comparator_obj56);
    int i62 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections36, collections45, comparator_obj56);
    java.util.Comparator<java.lang.Object> comparator_obj63 = java.util.Collections.reverseOrder(comparator_obj56);
    java.util.Comparator<java.lang.Object> comparator_obj64 = java.util.Collections.reverseOrder(comparator_obj63);
    java.util.Comparator<java.lang.Object> comparator_obj65 = java.util.Collections.reverseOrder(comparator_obj64);
    int i66 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections27, collections35, comparator_obj64);
    
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
    org.junit.Assert.assertNotNull(collections_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_collections42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == (-1));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test03"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.lang.Object[] obj_array5 = arraylist_str0.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long6 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long6, long_array11);
    java.util.NavigableSet<java.lang.Long> navigableset_long13 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long6);
    int i14 = arraylist_str0.lastIndexOf((java.lang.Object)treeset_long6);
    arraylist_str0.ensureCapacity((int)'a');
    
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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test04"); }


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
    java.lang.String str34 = arraylist_str2.toString();
    java.util.ArrayList<java.lang.String> arraylist_str36 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str37 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array40 = new java.lang.String[] { "", "hi!" };
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str37, str_array40);
    java.lang.Object[] obj_array42 = arraylist_str37.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long43 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array48 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b49 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long43, long_array48);
    java.util.NavigableSet<java.lang.Long> navigableset_long50 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long43);
    int i51 = arraylist_str37.lastIndexOf((java.lang.Object)treeset_long43);
    java.lang.String str53 = arraylist_str37.remove((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str54 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array57 = new java.lang.String[] { "hi!", "" };
    boolean b58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str54, str_array57);
    arraylist_str54.add((int)(byte)1, "hi!");
    int i62 = arraylist_str37.lastIndexOf((java.lang.Object)"hi!");
    boolean b63 = arraylist_str36.addAll((java.util.Collection<java.lang.String>)arraylist_str37);
    java.util.ArrayList<java.lang.String> arraylist_str64 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array67 = new java.lang.String[] { "hi!", "" };
    boolean b68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str64, str_array67);
    arraylist_str64.add((int)(byte)1, "hi!");
    java.util.ArrayList<java.lang.String> arraylist_str72 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array75 = new java.lang.String[] { "hi!", "" };
    boolean b76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str72, str_array75);
    java.util.Collection<java.lang.String> collection_str77 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str72);
    java.util.ArrayList<java.lang.String> arraylist_str80 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i81 = arraylist_str80.size();
    boolean b82 = arraylist_str72.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str80);
    boolean b83 = arraylist_str64.addAll((java.util.Collection<java.lang.String>)arraylist_str72);
    java.util.ArrayList<java.util.Collections> arraylist_collections84 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array85 = new java.util.Collections[] {  };
    boolean b86 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections84, collections_array85);
    java.util.Collections collections87 = null;
    java.util.Comparator<java.lang.Object> comparator_obj88 = null;
    int i89 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections84, collections87, comparator_obj88);
    boolean b90 = arraylist_str72.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections84);
    java.util.Collections collections91 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections84, collections91);
    java.util.List<java.util.Collections> list_collections93 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections84);
    boolean b94 = arraylist_str36.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections84);
    boolean b95 = arraylist_str2.equals((java.lang.Object)arraylist_str36);
    java.util.Comparator<java.lang.String> comparator_str96 = null;
    arraylist_str36.sort(comparator_str96);
    
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
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]"+ "'", str34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!"+ "'", str53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test05"); }


    java.util.Collection<java.lang.String> collection_str0 = null;
    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!", "" };
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str1, str_array4);
    arraylist_str1.add((int)(byte)1, "hi!");
    java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array12 = new java.lang.String[] { "hi!", "" };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str9, str_array12);
    java.util.Collection<java.lang.String> collection_str14 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str9);
    java.util.ArrayList<java.lang.String> arraylist_str17 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i18 = arraylist_str17.size();
    boolean b19 = arraylist_str9.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str17);
    boolean b20 = arraylist_str1.addAll((java.util.Collection<java.lang.String>)arraylist_str9);
    java.util.ArrayList<java.util.Collections> arraylist_collections21 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array22 = new java.util.Collections[] {  };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections21, collections_array22);
    java.util.Collections collections24 = null;
    java.util.Comparator<java.lang.Object> comparator_obj25 = null;
    int i26 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections21, collections24, comparator_obj25);
    boolean b27 = arraylist_str9.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections21);
    java.util.Collections collections28 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections21, collections28);
    java.util.List<java.util.Collections> list_collections30 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections21);
    java.util.List<java.util.Collections> list_collections31 = java.util.Collections.unmodifiableList(list_collections30);
    // The following exception was thrown during execution in test generation
    try {
    int i32 = java.util.Collections.frequency(collection_str0, (java.lang.Object)list_collections30);
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
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections31);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test06"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, (-1) };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array3);
    java.lang.Integer i5 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i0);
    java.lang.Integer i6 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i0);
    int i8 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i0, (java.lang.Integer)2);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collections.swap((java.util.List<java.lang.Integer>)arraylist_i0, (int)'a', 4);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
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
    org.junit.Assert.assertTrue(i8 == (-3));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test07"); }


    java.util.List<java.util.Collections> list_collections0 = null;
    java.util.Collections collections1 = null;
    java.util.ArrayList<java.lang.String> arraylist_str2 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "" };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str2, str_array5);
    java.util.Collection<java.lang.String> collection_str7 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str2);
    arraylist_str2.clear();
    java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str9, str_array12);
    java.lang.Object[] obj_array14 = arraylist_str9.toArray();
    java.util.ArrayDeque<java.lang.String> arraydeque_str15 = new java.util.ArrayDeque<java.lang.String>();
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!" };
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraydeque_str15, str_array17);
    java.util.Queue<java.lang.String> queue_str19 = java.util.Collections.asLifoQueue((java.util.Deque<java.lang.String>)arraydeque_str15);
    boolean b20 = arraylist_str9.contains((java.lang.Object)arraydeque_str15);
    java.util.ArrayList<java.lang.Boolean> arraylist_b21 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array24 = new java.lang.Boolean[] { false, false };
    boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b21, b_array24);
    boolean b26 = arraydeque_str15.containsAll((java.util.Collection<java.lang.Boolean>)arraylist_b21);
    boolean b27 = arraylist_str2.containsAll((java.util.Collection<java.lang.Boolean>)arraylist_b21);
    java.util.List<java.lang.Boolean> list_b29 = java.util.Collections.singletonList((java.lang.Boolean)true);
    java.util.ArrayList<java.util.Collections> arraylist_collections30 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array31 = new java.util.Collections[] {  };
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections30, collections_array31);
    java.util.Collections collections33 = null;
    java.util.Comparator<java.lang.Object> comparator_obj34 = null;
    int i35 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections30, collections33, comparator_obj34);
    java.util.Collections collections36 = null;
    java.util.Comparator<java.lang.Object> comparator_obj37 = null;
    java.util.Comparator<java.lang.Object> comparator_obj38 = java.util.Collections.reverseOrder(comparator_obj37);
    java.util.Comparator<java.lang.Object> comparator_obj39 = java.util.Collections.reverseOrder(comparator_obj38);
    int i40 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections30, collections36, comparator_obj38);
    java.util.Collections.sort(list_b29, comparator_obj38);
    java.util.Comparator<java.lang.Object> comparator_obj42 = java.util.Collections.reverseOrder(comparator_obj38);
    java.util.Comparator<java.lang.Object> comparator_obj43 = java.util.Collections.reverseOrder(comparator_obj38);
    java.util.Collections.sort((java.util.List<java.lang.Boolean>)arraylist_b21, comparator_obj38);
    // The following exception was thrown during execution in test generation
    try {
    int i45 = java.util.Collections.binarySearch(list_collections0, collections1, comparator_obj38);
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
    org.junit.Assert.assertNotNull(collection_str7);
    
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
    org.junit.Assert.assertNotNull(b_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj43);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test08"); }


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
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = arraylist_str0.get((int)(short)-1);
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

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test09"); }


    java.util.ArrayList<java.lang.String> arraylist_str1 = new java.util.ArrayList<java.lang.String>(10);
    java.util.Iterator<java.lang.String> iterator_str2 = arraylist_str1.iterator();
    java.util.ArrayList<java.lang.String> arraylist_str4 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array8);
    java.lang.Object[] obj_array10 = arraylist_str5.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long11 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long11, long_array16);
    java.util.NavigableSet<java.lang.Long> navigableset_long18 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long11);
    int i19 = arraylist_str5.lastIndexOf((java.lang.Object)treeset_long11);
    java.lang.String str21 = arraylist_str5.remove((int)(short)1);
    java.util.ArrayList<java.lang.String> arraylist_str22 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!", "" };
    boolean b26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str22, str_array25);
    arraylist_str22.add((int)(byte)1, "hi!");
    int i30 = arraylist_str5.lastIndexOf((java.lang.Object)"hi!");
    boolean b31 = arraylist_str4.addAll((java.util.Collection<java.lang.String>)arraylist_str5);
    java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!", "" };
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str32, str_array35);
    arraylist_str32.add((int)(byte)1, "hi!");
    java.util.ArrayList<java.lang.String> arraylist_str40 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!", "" };
    boolean b44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str40, str_array43);
    java.util.Collection<java.lang.String> collection_str45 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str40);
    java.util.ArrayList<java.lang.String> arraylist_str48 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i49 = arraylist_str48.size();
    boolean b50 = arraylist_str40.addAll((int)(short)1, (java.util.Collection<java.lang.String>)arraylist_str48);
    boolean b51 = arraylist_str32.addAll((java.util.Collection<java.lang.String>)arraylist_str40);
    java.util.ArrayList<java.util.Collections> arraylist_collections52 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array53 = new java.util.Collections[] {  };
    boolean b54 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections52, collections_array53);
    java.util.Collections collections55 = null;
    java.util.Comparator<java.lang.Object> comparator_obj56 = null;
    int i57 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections52, collections55, comparator_obj56);
    boolean b58 = arraylist_str40.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections52);
    java.util.Collections collections59 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections52, collections59);
    java.util.List<java.util.Collections> list_collections61 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections52);
    boolean b62 = arraylist_str4.removeAll((java.util.Collection<java.util.Collections>)arraylist_collections52);
    int i63 = arraylist_str1.lastIndexOf((java.lang.Object)arraylist_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == (-1));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test10"); }


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
    java.util.function.UnaryOperator<java.lang.String> unaryoperator_str79 = null;
    // The following exception was thrown during execution in test generation
    try {
    arraylist_str22.replaceAll(unaryoperator_str79);
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
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test11"); }


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
    java.util.ArrayList<java.util.Collections> arraylist_collections23 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array24 = new java.util.Collections[] {  };
    boolean b25 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections23, collections_array24);
    java.util.Collections collections26 = null;
    java.util.Comparator<java.lang.Object> comparator_obj27 = null;
    int i28 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections23, collections26, comparator_obj27);
    java.util.Collection<java.util.Collections> collection_collections29 = java.util.Collections.unmodifiableCollection((java.util.Collection<java.util.Collections>)arraylist_collections23);
    java.util.Collections collections30 = null;
    java.util.Collections.fill((java.util.List<java.util.Collections>)arraylist_collections23, collections30);
    java.util.Collections collections32 = null;
    java.util.List<java.lang.Boolean> list_b34 = java.util.Collections.singletonList((java.lang.Boolean)true);
    java.util.ArrayList<java.util.Collections> arraylist_collections35 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array36 = new java.util.Collections[] {  };
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections35, collections_array36);
    java.util.Collections collections38 = null;
    java.util.Comparator<java.lang.Object> comparator_obj39 = null;
    int i40 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections35, collections38, comparator_obj39);
    java.util.Collections collections41 = null;
    java.util.Comparator<java.lang.Object> comparator_obj42 = null;
    java.util.Comparator<java.lang.Object> comparator_obj43 = java.util.Collections.reverseOrder(comparator_obj42);
    java.util.Comparator<java.lang.Object> comparator_obj44 = java.util.Collections.reverseOrder(comparator_obj43);
    int i45 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections35, collections41, comparator_obj43);
    java.util.Collections.sort(list_b34, comparator_obj43);
    java.util.Comparator<java.lang.Object> comparator_obj47 = java.util.Collections.reverseOrder(comparator_obj43);
    java.util.Comparator<java.lang.Object> comparator_obj48 = java.util.Collections.reverseOrder(comparator_obj43);
    int i49 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections23, collections32, comparator_obj43);
    java.util.Comparator<java.lang.Object> comparator_obj50 = java.util.Collections.reverseOrder(comparator_obj43);
    java.util.Comparator<java.lang.Object> comparator_obj51 = java.util.Collections.reverseOrder(comparator_obj50);
    java.util.Comparator<java.lang.Object> comparator_obj52 = java.util.Collections.reverseOrder(comparator_obj51);
    boolean b53 = arraylist_str8.remove((java.lang.Object)comparator_obj52);
    java.lang.String str54 = arraylist_str8.toString();
    java.util.TreeSet<java.lang.Integer> treeset_i55 = new java.util.TreeSet<java.lang.Integer>();
    java.lang.Integer[] i_array57 = new java.lang.Integer[] { 0 };
    boolean b58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)treeset_i55, i_array57);
    java.util.SortedSet<java.lang.Integer> sortedset_i59 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.lang.Integer>)treeset_i55);
    java.util.SortedSet<java.lang.Integer> sortedset_i60 = java.util.Collections.synchronizedSortedSet(sortedset_i59);
    int i61 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)arraylist_str8, (java.lang.Object)sortedset_i60);
    java.util.ArrayList<java.lang.String> arraylist_str62 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array65 = new java.lang.String[] { "hi!", "" };
    boolean b66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str62, str_array65);
    java.util.Comparator<java.lang.String> comparator_str67 = null;
    arraylist_str62.sort(comparator_str67);
    int i69 = arraylist_str62.size();
    java.util.stream.Stream<java.lang.String> stream_str70 = arraylist_str62.parallelStream();
    java.util.ArrayList<java.lang.Integer> arraylist_i71 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array74 = new java.lang.Integer[] { 1, (-1) };
    boolean b75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i71, i_array74);
    java.lang.Integer i76 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i71);
    int i77 = java.util.Collections.frequency((java.util.Collection<java.lang.String>)arraylist_str62, (java.lang.Object)i76);
    boolean b78 = arraylist_str8.equals((java.lang.Object)arraylist_str62);
    
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
    org.junit.Assert.assertNotNull(collections_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_collections29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "[hi!, ]"+ "'", str54.equals("[hi!, ]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_i60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i76 + "' != '" + (-1)+ "'", i76.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test12"); }


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
    java.util.List<java.util.Collections> list_collections20 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections11);
    
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
    org.junit.Assert.assertNotNull(list_collections20);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test13"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array2);
    java.util.Comparator<java.lang.String> comparator_str4 = null;
    java.lang.String str5 = java.util.Collections.min((java.util.Collection<java.lang.String>)arraylist_str0, comparator_str4);
    java.util.stream.Stream<java.lang.String> stream_str6 = arraylist_str0.parallelStream();
    java.util.ArrayList<java.lang.String> arraylist_str7 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str7, str_array10);
    java.lang.Object[] obj_array12 = arraylist_str7.toArray();
    java.util.TreeSet<java.lang.Long> treeset_long13 = new java.util.TreeSet<java.lang.Long>();
    java.lang.Long[] long_array18 = new java.lang.Long[] { 10L, 0L, (-1L), (-1L) };
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)treeset_long13, long_array18);
    java.util.NavigableSet<java.lang.Long> navigableset_long20 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.lang.Long>)treeset_long13);
    int i21 = arraylist_str7.lastIndexOf((java.lang.Object)treeset_long13);
    java.lang.Long long22 = java.util.Collections.max((java.util.Collection<java.lang.Long>)treeset_long13);
    boolean b23 = arraylist_str0.contains((java.lang.Object)treeset_long13);
    java.util.Spliterator<java.lang.String> spliterator_str24 = arraylist_str0.spliterator();
    java.util.Iterator<java.lang.String> iterator_str25 = arraylist_str0.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L+ "'", long22.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str25);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test14"); }


    java.util.ArrayList<java.lang.Integer> arraylist_i0 = new java.util.ArrayList<java.lang.Integer>();
    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, (-1) };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i0, i_array3);
    java.lang.Integer i5 = java.util.Collections.min((java.util.Collection<java.lang.Integer>)arraylist_i0);
    int i7 = java.util.Collections.binarySearch((java.util.List<java.lang.Integer>)arraylist_i0, (java.lang.Integer)2);
    
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
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test15"); }


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
    java.util.Comparator<java.lang.String> comparator_str23 = null;
    arraylist_str0.sort(comparator_str23);
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

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test16"); }


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
    java.util.ListIterator<java.lang.String> listiterator_str18 = arraylist_str0.listIterator((int)(short)0);
    java.util.stream.Stream<java.lang.String> stream_str19 = arraylist_str0.stream();
    java.util.List<java.lang.Boolean> list_b21 = java.util.Collections.singletonList((java.lang.Boolean)true);
    java.util.Collections.sort(list_b21);
    java.util.Collections.sort(list_b21);
    boolean b24 = arraylist_str0.containsAll((java.util.Collection<java.lang.Boolean>)list_b21);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test17"); }


    java.util.ArrayList<java.util.Collections> arraylist_collections0 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array1 = new java.util.Collections[] {  };
    boolean b2 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections0, collections_array1);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections0);
    java.util.Collections.reverse((java.util.List<java.util.Collections>)arraylist_collections0);
    java.util.Collections collections5 = null;
    java.util.ArrayList<java.util.Collections> arraylist_collections6 = new java.util.ArrayList<java.util.Collections>();
    java.util.Collections[] collections_array7 = new java.util.Collections[] {  };
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.util.Collections>)arraylist_collections6, collections_array7);
    java.util.Collections collections9 = null;
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    int i11 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections6, collections9, comparator_obj10);
    java.util.Collection<java.util.Collections> collection_collections12 = java.util.Collections.unmodifiableCollection((java.util.Collection<java.util.Collections>)arraylist_collections6);
    java.util.List<java.util.Collections> list_collections13 = java.util.Collections.unmodifiableList((java.util.List<java.util.Collections>)arraylist_collections6);
    java.util.Collections collections14 = null;
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    java.util.Comparator<java.lang.Object> comparator_obj16 = java.util.Collections.reverseOrder(comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj17 = java.util.Collections.reverseOrder(comparator_obj16);
    int i18 = java.util.Collections.binarySearch(list_collections13, collections14, comparator_obj16);
    int i19 = java.util.Collections.binarySearch((java.util.List<java.util.Collections>)arraylist_collections0, collections5, comparator_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collections_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_collections12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_collections13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparator_obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test18"); }


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
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str0);
    java.util.Iterator<java.lang.String> iterator_str39 = arraylist_str0.iterator();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str39);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test19"); }


    java.util.ArrayList<java.lang.String> arraylist_str0 = new java.util.ArrayList<java.lang.String>();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "" };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str0, str_array3);
    java.util.Collection<java.lang.String> collection_str5 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str0);
    arraylist_str0.clear();
    boolean b8 = arraylist_str0.add("[hi!]");
    boolean b10 = arraylist_str0.add("[hi!, ]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test20"); }


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
    java.util.ArrayList<java.lang.String> arraylist_str27 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i28 = arraylist_str27.size();
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str27);
    boolean b30 = arraylist_str27.isEmpty();
    java.lang.Long[] long_array35 = new java.lang.Long[] { 100L, (-1L), 0L, 0L };
    java.lang.Long[] long_array36 = arraylist_str27.toArray(long_array35);
    java.util.Set<java.lang.Object[]> set_obj_array37 = java.util.Collections.singleton((java.lang.Object[])long_array35);
    java.lang.Long[] long_array38 = arraylist_str0.toArray(long_array35);
    java.util.Set<java.lang.Object[]> set_obj_array39 = java.util.Collections.singleton((java.lang.Object[])long_array35);
    
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
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj_array39);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test21"); }


    java.util.ArrayList<java.lang.Long> arraylist_long0 = new java.util.ArrayList<java.lang.Long>();
    java.lang.Long[] long_array3 = new java.lang.Long[] { 10L, 10L };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long0, long_array3);
    java.lang.Long long5 = java.util.Collections.max((java.util.Collection<java.lang.Long>)arraylist_long0);
    boolean b8 = java.util.Collections.replaceAll((java.util.List<java.lang.Long>)arraylist_long0, (java.lang.Long)(-1L), (java.lang.Long)100L);
    boolean b11 = java.util.Collections.replaceAll((java.util.List<java.lang.Long>)arraylist_long0, (java.lang.Long)100L, (java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L+ "'", long5.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test22"); }


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
    java.util.Collection<java.lang.String> collection_str21 = java.util.Collections.synchronizedCollection((java.util.Collection<java.lang.String>)arraylist_str8);
    java.util.Iterator<java.lang.String> iterator_str22 = arraylist_str8.iterator();
    arraylist_str8.ensureCapacity(0);
    java.lang.String str27 = arraylist_str8.set((int)(short)1, "[hi!]");
    java.util.Collections.shuffle((java.util.List<java.lang.String>)arraylist_str8);
    java.util.ArrayList<java.lang.String> arraylist_str30 = new java.util.ArrayList<java.lang.String>((int)(short)1);
    int i31 = arraylist_str30.size();
    int i32 = arraylist_str8.lastIndexOf((java.lang.Object)arraylist_str30);
    
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
    org.junit.Assert.assertNotNull(collection_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == (-1));

  }

}
