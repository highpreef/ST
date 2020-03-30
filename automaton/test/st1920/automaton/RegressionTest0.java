package st1920.automaton;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        st1920.automaton.REGEXWrapper rEGEXWrapper0 = new st1920.automaton.REGEXWrapper();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString7 = rEString4.makeExclude(rEString6);
        st1920.automaton.REString rEString8 = rEString2.makeAnyChar(rEString7);
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString13 = rEString10.makeExclude(rEString12);
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = rEString17.makeExclude(rEString19);
        st1920.automaton.REString rEString21 = rEString15.makeAnyChar(rEString20);
        st1920.automaton.REString rEString22 = rEString12.makeExclude(rEString15);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = rEString12.makeAlpha(rEString24);
        st1920.automaton.REString rEString26 = rEString7.makeAny(rEString25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = st1920.automaton.REGEXWrapper.matches("", rEString7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = rEString16.makeExclude(rEString18);
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = rEString23.makeExclude(rEString25);
        st1920.automaton.REString rEString27 = rEString21.makeAnyChar(rEString26);
        st1920.automaton.REString rEString28 = rEString18.makeExclude(rEString21);
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = rEString18.makeAlpha(rEString30);
        st1920.automaton.REString rEString32 = rEString14.makeAlpha(rEString30);
        st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = rEString34.makeExclude(rEString36);
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = rEString41.makeExclude(rEString43);
        st1920.automaton.REString rEString45 = rEString39.makeAnyChar(rEString44);
        st1920.automaton.REString rEString46 = rEString36.makeExclude(rEString39);
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString49 = rEString36.makeAlpha(rEString48);
        st1920.automaton.REString rEString52 = rEString14.makeRange(rEString36, (int) (byte) 1, (int) (byte) 100);
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString57 = rEString54.makeExclude(rEString56);
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = rEString61.makeExclude(rEString63);
        st1920.automaton.REString rEString65 = rEString59.makeAnyChar(rEString64);
        st1920.automaton.REString rEString66 = rEString56.makeExclude(rEString59);
        st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString73 = rEString70.makeExclude(rEString72);
        st1920.automaton.REString rEString74 = rEString68.makeAnyChar(rEString73);
        st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString79 = rEString76.makeExclude(rEString78);
        st1920.automaton.REString rEString80 = rEString73.makeAnyChar(rEString79);
        st1920.automaton.REString rEString81 = rEString66.makeZeroOrOne(rEString79);
        st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString87 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString88 = rEString85.makeExclude(rEString87);
        st1920.automaton.REString rEString89 = rEString83.makeAnyChar(rEString88);
        st1920.automaton.REString rEString91 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString93 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString94 = rEString91.makeExclude(rEString93);
        st1920.automaton.REString rEString95 = rEString88.makeAnyChar(rEString94);
        st1920.automaton.REString rEString96 = rEString66.makeOneOrMore(rEString95);
        st1920.automaton.REString rEString97 = rEString14.makeAnyChar(rEString96);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean98 = st1920.automaton.REGEXWrapper.matches("hi!", rEString14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString97);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString22 = rEString16.makeAnyChar(rEString21);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString21.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString14.makeZeroOrOne(rEString27);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = rEString31.makeExclude(rEString33);
        java.lang.String str35 = rEString33.string;
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = rEString37.makeExclude(rEString39);
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = rEString44.makeExclude(rEString46);
        st1920.automaton.REString rEString48 = rEString42.makeAnyChar(rEString47);
        st1920.automaton.REString rEString49 = rEString39.makeExclude(rEString42);
        st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = rEString39.makeAlpha(rEString51);
        st1920.automaton.REString rEString53 = rEString33.makeExclude(rEString51);
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString62 = rEString59.makeExclude(rEString61);
        st1920.automaton.REString rEString63 = rEString57.makeAnyChar(rEString62);
        st1920.automaton.REString rEString64 = rEString55.makeAnyChar(rEString63);
        st1920.automaton.REString rEString65 = rEString33.makeNothing(rEString64);
        st1920.automaton.REString rEString66 = rEString29.makeAnyChar(rEString65);
        boolean boolean67 = st1920.automaton.REGEXWrapper.matches("a@", rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString7 = rEString4.makeExclude(rEString6);
        st1920.automaton.REString rEString8 = rEString2.makeAnyChar(rEString7);
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString13 = rEString10.makeExclude(rEString12);
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = rEString17.makeExclude(rEString19);
        st1920.automaton.REString rEString21 = rEString15.makeAnyChar(rEString20);
        st1920.automaton.REString rEString22 = rEString12.makeExclude(rEString15);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = rEString12.makeAlpha(rEString24);
        st1920.automaton.REString rEString26 = rEString7.makeAny(rEString25);
        st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = rEString28.makeExclude(rEString30);
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = rEString35.makeExclude(rEString37);
        st1920.automaton.REString rEString39 = rEString33.makeAnyChar(rEString38);
        st1920.automaton.REString rEString40 = rEString30.makeExclude(rEString33);
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = rEString44.makeExclude(rEString46);
        st1920.automaton.REString rEString48 = rEString42.makeAnyChar(rEString47);
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString53 = rEString50.makeExclude(rEString52);
        st1920.automaton.REString rEString54 = rEString47.makeAnyChar(rEString53);
        st1920.automaton.REString rEString55 = rEString40.makeZeroOrOne(rEString53);
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = rEString57.makeExclude(rEString59);
        st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString67 = rEString64.makeExclude(rEString66);
        st1920.automaton.REString rEString68 = rEString62.makeAnyChar(rEString67);
        st1920.automaton.REString rEString69 = rEString59.makeExclude(rEString62);
        st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString74 = rEString71.makeExclude(rEString73);
        st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString81 = rEString78.makeExclude(rEString80);
        st1920.automaton.REString rEString82 = rEString76.makeAnyChar(rEString81);
        st1920.automaton.REString rEString83 = rEString73.makeExclude(rEString76);
        st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString86 = rEString73.makeAlpha(rEString85);
        st1920.automaton.REString rEString87 = rEString69.makeAlpha(rEString85);
        st1920.automaton.REString rEString89 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString91 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString92 = rEString89.makeExclude(rEString91);
        st1920.automaton.REString rEString93 = rEString55.makeOr(rEString69, rEString92);
        st1920.automaton.REString rEString94 = rEString26.makeAnyChar(rEString93);
        java.lang.String str95 = rEString26.string;
        boolean boolean96 = st1920.automaton.REGEXWrapper.matches("~.+", rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str95 + "' != '" + "a@" + "'", str95.equals("a@"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString22 = rEString16.makeAnyChar(rEString21);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString21.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString14.makeZeroOrOne(rEString27);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = rEString31.makeExclude(rEString33);
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = rEString38.makeExclude(rEString40);
        st1920.automaton.REString rEString42 = rEString36.makeAnyChar(rEString41);
        st1920.automaton.REString rEString43 = rEString33.makeExclude(rEString36);
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = rEString45.makeExclude(rEString47);
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = rEString52.makeExclude(rEString54);
        st1920.automaton.REString rEString56 = rEString50.makeAnyChar(rEString55);
        st1920.automaton.REString rEString57 = rEString47.makeExclude(rEString50);
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = rEString47.makeAlpha(rEString59);
        st1920.automaton.REString rEString61 = rEString43.makeAlpha(rEString59);
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = rEString63.makeExclude(rEString65);
        st1920.automaton.REString rEString67 = rEString29.makeOr(rEString43, rEString66);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean68 = st1920.automaton.REGEXWrapper.matches("#", rEString43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        st1920.automaton.REString rEString1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = st1920.automaton.REGEXWrapper.matches("~.+", rEString1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString22 = rEString16.makeAnyChar(rEString21);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString21.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString14.makeZeroOrOne(rEString27);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = rEString31.makeExclude(rEString33);
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = rEString38.makeExclude(rEString40);
        st1920.automaton.REString rEString42 = rEString36.makeAnyChar(rEString41);
        st1920.automaton.REString rEString43 = rEString33.makeExclude(rEString36);
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = rEString33.makeAlpha(rEString45);
        st1920.automaton.REString rEString47 = rEString14.makeClass(rEString33);
        st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = rEString49.makeExclude(rEString51);
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString59 = rEString56.makeExclude(rEString58);
        st1920.automaton.REString rEString60 = rEString54.makeAnyChar(rEString59);
        st1920.automaton.REString rEString61 = rEString51.makeExclude(rEString54);
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString68 = rEString65.makeExclude(rEString67);
        st1920.automaton.REString rEString69 = rEString63.makeAnyChar(rEString68);
        st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString74 = rEString71.makeExclude(rEString73);
        st1920.automaton.REString rEString75 = rEString68.makeAnyChar(rEString74);
        st1920.automaton.REString rEString76 = rEString51.makeOneOrMore(rEString74);
        st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString81 = rEString78.makeExclude(rEString80);
        rEString78.string = "hi!";
        st1920.automaton.REString rEString84 = rEString33.makeAnd(rEString51, rEString78);
        boolean boolean85 = st1920.automaton.REGEXWrapper.matches("~", rEString78);
        st1920.automaton.REString rEString88 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString90 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString92 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString94 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString95 = rEString92.makeExclude(rEString94);
        st1920.automaton.REString rEString96 = rEString90.makeAnyChar(rEString95);
        st1920.automaton.REString rEString97 = rEString88.makeAnyChar(rEString96);
        boolean boolean98 = st1920.automaton.REGEXWrapper.matches("~.+", rEString88);
        st1920.automaton.REString rEString99 = rEString78.makeAny(rEString88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString99);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = rEString16.makeExclude(rEString18);
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = rEString23.makeExclude(rEString25);
        st1920.automaton.REString rEString27 = rEString21.makeAnyChar(rEString26);
        st1920.automaton.REString rEString28 = rEString18.makeExclude(rEString21);
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = rEString18.makeAlpha(rEString30);
        st1920.automaton.REString rEString32 = rEString14.makeAlpha(rEString30);
        boolean boolean33 = st1920.automaton.REGEXWrapper.matches("~.+", rEString30);
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = rEString35.makeExclude(rEString37);
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = rEString40.makeExclude(rEString42);
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = rEString45.makeExclude(rEString47);
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = rEString52.makeExclude(rEString54);
        st1920.automaton.REString rEString56 = rEString50.makeAnyChar(rEString55);
        st1920.automaton.REString rEString57 = rEString47.makeExclude(rEString50);
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = rEString61.makeExclude(rEString63);
        st1920.automaton.REString rEString65 = rEString59.makeAnyChar(rEString64);
        st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString70 = rEString67.makeExclude(rEString69);
        st1920.automaton.REString rEString71 = rEString64.makeAnyChar(rEString70);
        st1920.automaton.REString rEString72 = rEString57.makeZeroOrOne(rEString70);
        st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString77 = rEString74.makeExclude(rEString76);
        st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString84 = rEString81.makeExclude(rEString83);
        st1920.automaton.REString rEString85 = rEString79.makeAnyChar(rEString84);
        st1920.automaton.REString rEString86 = rEString76.makeExclude(rEString79);
        st1920.automaton.REString rEString88 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString89 = rEString76.makeAlpha(rEString88);
        st1920.automaton.REString rEString90 = rEString57.makeClass(rEString76);
        st1920.automaton.REString rEString93 = rEString42.makeRep(rEString57, (int) 'a', (int) (short) 1);
        st1920.automaton.REString rEString94 = rEString38.makeZeroOrMore(rEString42);
        st1920.automaton.REString rEString96 = new st1920.automaton.REString("#");
        st1920.automaton.REString rEString97 = rEString42.makeGroup(rEString96);
        st1920.automaton.REString rEString98 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString99 = rEString30.makeAnd(rEString96, rEString98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString97);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        java.lang.String str6 = rEString4.string;
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = rEString8.makeExclude(rEString10);
        st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = rEString15.makeExclude(rEString17);
        st1920.automaton.REString rEString19 = rEString13.makeAnyChar(rEString18);
        st1920.automaton.REString rEString20 = rEString10.makeExclude(rEString13);
        st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = rEString10.makeAlpha(rEString22);
        st1920.automaton.REString rEString24 = rEString4.makeExclude(rEString22);
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = rEString30.makeExclude(rEString32);
        st1920.automaton.REString rEString34 = rEString28.makeAnyChar(rEString33);
        st1920.automaton.REString rEString35 = rEString26.makeAnyChar(rEString34);
        st1920.automaton.REString rEString36 = rEString4.makeNothing(rEString35);
        boolean boolean37 = st1920.automaton.REGEXWrapper.matches("*", rEString35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString22 = rEString16.makeAnyChar(rEString21);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString21.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString14.makeZeroOrOne(rEString27);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = rEString31.makeExclude(rEString33);
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = rEString38.makeExclude(rEString40);
        st1920.automaton.REString rEString42 = rEString36.makeAnyChar(rEString41);
        st1920.automaton.REString rEString43 = rEString33.makeExclude(rEString36);
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = rEString33.makeAlpha(rEString45);
        st1920.automaton.REString rEString47 = rEString14.makeClass(rEString33);
        st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString56 = rEString53.makeExclude(rEString55);
        st1920.automaton.REString rEString57 = rEString51.makeAnyChar(rEString56);
        st1920.automaton.REString rEString58 = rEString49.makeAnyChar(rEString57);
        java.lang.String str59 = rEString57.string;
        st1920.automaton.REString rEString60 = rEString14.makeNum(rEString57);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean61 = st1920.automaton.REGEXWrapper.matches("~?", rEString14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "~." + "'", str59.equals("~."));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = rEString6.makeExclude(rEString8);
        st1920.automaton.REString rEString10 = rEString4.makeAnyChar(rEString9);
        st1920.automaton.REString rEString11 = rEString2.makeAnyChar(rEString10);
        boolean boolean12 = st1920.automaton.REGEXWrapper.matches("~.+", rEString2);
        java.lang.String str13 = rEString2.string;
        java.lang.Class<?> wildcardClass14 = rEString2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString22 = rEString16.makeAnyChar(rEString21);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString21.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString14.makeZeroOrOne(rEString27);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString36 = rEString33.makeExclude(rEString35);
        st1920.automaton.REString rEString37 = rEString31.makeAnyChar(rEString36);
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = rEString39.makeExclude(rEString41);
        st1920.automaton.REString rEString43 = rEString36.makeAnyChar(rEString42);
        st1920.automaton.REString rEString44 = rEString14.makeOneOrMore(rEString43);
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString49 = rEString46.makeExclude(rEString48);
        st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString56 = rEString53.makeExclude(rEString55);
        st1920.automaton.REString rEString57 = rEString51.makeAnyChar(rEString56);
        st1920.automaton.REString rEString58 = rEString48.makeExclude(rEString51);
        st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = rEString62.makeExclude(rEString64);
        st1920.automaton.REString rEString66 = rEString60.makeAnyChar(rEString65);
        st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString71 = rEString68.makeExclude(rEString70);
        st1920.automaton.REString rEString72 = rEString65.makeAnyChar(rEString71);
        st1920.automaton.REString rEString73 = rEString58.makeZeroOrOne(rEString71);
        st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString77 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString78 = rEString75.makeExclude(rEString77);
        st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString82 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString84 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString85 = rEString82.makeExclude(rEString84);
        st1920.automaton.REString rEString86 = rEString80.makeAnyChar(rEString85);
        st1920.automaton.REString rEString87 = rEString77.makeExclude(rEString80);
        st1920.automaton.REString rEString89 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString90 = rEString77.makeAlpha(rEString89);
        st1920.automaton.REString rEString91 = rEString58.makeClass(rEString77);
        st1920.automaton.REString rEString92 = rEString44.makeExclude(rEString91);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean93 = st1920.automaton.REGEXWrapper.matches("a@", rEString91);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: expected ']' at position 2");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString92);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = rEString7.makeExclude(rEString9);
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString15 = rEString12.makeExclude(rEString14);
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString22 = rEString19.makeExclude(rEString21);
        st1920.automaton.REString rEString23 = rEString17.makeAnyChar(rEString22);
        st1920.automaton.REString rEString24 = rEString14.makeExclude(rEString17);
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = rEString28.makeExclude(rEString30);
        st1920.automaton.REString rEString32 = rEString26.makeAnyChar(rEString31);
        st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = rEString34.makeExclude(rEString36);
        st1920.automaton.REString rEString38 = rEString31.makeAnyChar(rEString37);
        st1920.automaton.REString rEString39 = rEString24.makeZeroOrOne(rEString37);
        st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = rEString41.makeExclude(rEString43);
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = rEString48.makeExclude(rEString50);
        st1920.automaton.REString rEString52 = rEString46.makeAnyChar(rEString51);
        st1920.automaton.REString rEString53 = rEString43.makeExclude(rEString46);
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString56 = rEString43.makeAlpha(rEString55);
        st1920.automaton.REString rEString57 = rEString24.makeClass(rEString43);
        st1920.automaton.REString rEString60 = rEString9.makeRep(rEString24, (int) 'a', (int) (short) 1);
        st1920.automaton.REString rEString61 = rEString5.makeZeroOrMore(rEString9);
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("#");
        st1920.automaton.REString rEString64 = rEString9.makeGroup(rEString63);
        boolean boolean65 = st1920.automaton.REGEXWrapper.matches("a@", rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString7 = rEString4.makeExclude(rEString6);
        st1920.automaton.REString rEString8 = rEString2.makeAnyChar(rEString7);
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString13 = rEString10.makeExclude(rEString12);
        st1920.automaton.REString rEString16 = rEString2.makeRange(rEString12, 10, 0);
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString28 = rEString25.makeExclude(rEString27);
        st1920.automaton.REString rEString29 = rEString23.makeAnyChar(rEString28);
        st1920.automaton.REString rEString30 = rEString20.makeExclude(rEString23);
        st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = rEString34.makeExclude(rEString36);
        st1920.automaton.REString rEString38 = rEString32.makeAnyChar(rEString37);
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = rEString40.makeExclude(rEString42);
        st1920.automaton.REString rEString44 = rEString37.makeAnyChar(rEString43);
        st1920.automaton.REString rEString45 = rEString30.makeZeroOrOne(rEString43);
        st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = rEString49.makeExclude(rEString51);
        st1920.automaton.REString rEString53 = rEString47.makeAnyChar(rEString52);
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString58 = rEString55.makeExclude(rEString57);
        st1920.automaton.REString rEString59 = rEString52.makeAnyChar(rEString58);
        st1920.automaton.REString rEString60 = rEString30.makeOneOrMore(rEString59);
        st1920.automaton.REString rEString61 = rEString12.makeNothing(rEString30);
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString70 = rEString67.makeExclude(rEString69);
        st1920.automaton.REString rEString71 = rEString65.makeAnyChar(rEString70);
        st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString76 = rEString73.makeExclude(rEString75);
        st1920.automaton.REString rEString79 = rEString65.makeRange(rEString75, 10, 0);
        st1920.automaton.REString rEString82 = rEString63.makeRep(rEString65, (int) 'a', (int) '4');
        st1920.automaton.REString rEString83 = rEString12.makeZeroOrOne(rEString65);
        boolean boolean84 = st1920.automaton.REGEXWrapper.matches("~.", rEString83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString22 = rEString16.makeAnyChar(rEString21);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString21.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString4.makeOneOrMore(rEString27);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = rEString35.makeExclude(rEString37);
        st1920.automaton.REString rEString39 = rEString33.makeAnyChar(rEString38);
        st1920.automaton.REString rEString40 = rEString31.makeAnyChar(rEString39);
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = rEString44.makeExclude(rEString46);
        st1920.automaton.REString rEString48 = rEString42.makeAnyChar(rEString47);
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString53 = rEString50.makeExclude(rEString52);
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = rEString57.makeExclude(rEString59);
        st1920.automaton.REString rEString61 = rEString55.makeAnyChar(rEString60);
        st1920.automaton.REString rEString62 = rEString52.makeExclude(rEString55);
        st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = rEString52.makeAlpha(rEString64);
        st1920.automaton.REString rEString66 = rEString47.makeAny(rEString65);
        st1920.automaton.REString rEString67 = rEString31.makeClass(rEString65);
        st1920.automaton.REString rEString68 = rEString4.makeOneOrMore(rEString67);
        st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString73 = rEString70.makeExclude(rEString72);
        st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString77 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString80 = rEString77.makeExclude(rEString79);
        st1920.automaton.REString rEString81 = rEString75.makeAnyChar(rEString80);
        st1920.automaton.REString rEString82 = rEString72.makeExclude(rEString75);
        st1920.automaton.REString rEString84 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString86 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString88 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString89 = rEString86.makeExclude(rEString88);
        st1920.automaton.REString rEString90 = rEString84.makeAnyChar(rEString89);
        st1920.automaton.REString rEString92 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString94 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString95 = rEString92.makeExclude(rEString94);
        st1920.automaton.REString rEString96 = rEString89.makeAnyChar(rEString95);
        st1920.automaton.REString rEString97 = rEString82.makeZeroOrOne(rEString95);
        st1920.automaton.REString rEString98 = rEString68.makeExcludeClass(rEString97);
        boolean boolean99 = st1920.automaton.REGEXWrapper.matches("~..", rEString97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString7 = rEString4.makeExclude(rEString6);
        st1920.automaton.REString rEString8 = rEString2.makeAnyChar(rEString7);
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString13 = rEString10.makeExclude(rEString12);
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = rEString17.makeExclude(rEString19);
        st1920.automaton.REString rEString21 = rEString15.makeAnyChar(rEString20);
        st1920.automaton.REString rEString22 = rEString12.makeExclude(rEString15);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString29 = rEString26.makeExclude(rEString28);
        st1920.automaton.REString rEString30 = rEString24.makeAnyChar(rEString29);
        st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = rEString32.makeExclude(rEString34);
        st1920.automaton.REString rEString36 = rEString29.makeAnyChar(rEString35);
        st1920.automaton.REString rEString37 = rEString22.makeZeroOrOne(rEString35);
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = rEString39.makeExclude(rEString41);
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString49 = rEString46.makeExclude(rEString48);
        st1920.automaton.REString rEString50 = rEString44.makeAnyChar(rEString49);
        st1920.automaton.REString rEString51 = rEString41.makeExclude(rEString44);
        st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString58 = rEString55.makeExclude(rEString57);
        st1920.automaton.REString rEString59 = rEString53.makeAnyChar(rEString58);
        st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = rEString61.makeExclude(rEString63);
        st1920.automaton.REString rEString65 = rEString58.makeAnyChar(rEString64);
        st1920.automaton.REString rEString66 = rEString51.makeZeroOrOne(rEString64);
        st1920.automaton.REString rEString67 = rEString35.makeExcludeClass(rEString66);
        st1920.automaton.REString rEString68 = rEString8.makeOneOrMore(rEString67);
        boolean boolean69 = st1920.automaton.REGEXWrapper.matches("hi!", rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString22 = rEString16.makeAnyChar(rEString21);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString21.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString14.makeZeroOrOne(rEString27);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = rEString31.makeExclude(rEString33);
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = rEString38.makeExclude(rEString40);
        st1920.automaton.REString rEString42 = rEString36.makeAnyChar(rEString41);
        st1920.automaton.REString rEString43 = rEString33.makeExclude(rEString36);
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = rEString45.makeExclude(rEString47);
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = rEString52.makeExclude(rEString54);
        st1920.automaton.REString rEString56 = rEString50.makeAnyChar(rEString55);
        st1920.automaton.REString rEString57 = rEString47.makeExclude(rEString50);
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = rEString47.makeAlpha(rEString59);
        st1920.automaton.REString rEString61 = rEString43.makeAlpha(rEString59);
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = rEString63.makeExclude(rEString65);
        st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString73 = rEString70.makeExclude(rEString72);
        st1920.automaton.REString rEString74 = rEString68.makeAnyChar(rEString73);
        st1920.automaton.REString rEString75 = rEString65.makeExclude(rEString68);
        st1920.automaton.REString rEString77 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString82 = rEString79.makeExclude(rEString81);
        st1920.automaton.REString rEString83 = rEString77.makeAnyChar(rEString82);
        st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString87 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString88 = rEString85.makeExclude(rEString87);
        st1920.automaton.REString rEString89 = rEString82.makeAnyChar(rEString88);
        st1920.automaton.REString rEString90 = rEString75.makeZeroOrOne(rEString88);
        st1920.automaton.REString rEString91 = rEString43.makeExclude(rEString90);
        st1920.automaton.REString rEString94 = rEString29.makeRange(rEString91, (int) (byte) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean95 = st1920.automaton.REGEXWrapper.matches("*", rEString94);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: expected '}' at position 7");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString94);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = rEString3.makeExclude(rEString5);
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString13 = rEString10.makeExclude(rEString12);
        st1920.automaton.REString rEString14 = rEString8.makeAnyChar(rEString13);
        st1920.automaton.REString rEString15 = rEString5.makeExclude(rEString8);
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString22 = rEString19.makeExclude(rEString21);
        st1920.automaton.REString rEString23 = rEString17.makeAnyChar(rEString22);
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString28 = rEString25.makeExclude(rEString27);
        st1920.automaton.REString rEString29 = rEString22.makeAnyChar(rEString28);
        st1920.automaton.REString rEString30 = rEString15.makeZeroOrOne(rEString28);
        st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = rEString32.makeExclude(rEString34);
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = rEString39.makeExclude(rEString41);
        st1920.automaton.REString rEString43 = rEString37.makeAnyChar(rEString42);
        st1920.automaton.REString rEString44 = rEString34.makeExclude(rEString37);
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = rEString34.makeAlpha(rEString46);
        st1920.automaton.REString rEString48 = rEString15.makeClass(rEString34);
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString53 = rEString50.makeExclude(rEString52);
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = rEString57.makeExclude(rEString59);
        st1920.automaton.REString rEString61 = rEString55.makeAnyChar(rEString60);
        st1920.automaton.REString rEString62 = rEString52.makeExclude(rEString55);
        st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString69 = rEString66.makeExclude(rEString68);
        st1920.automaton.REString rEString70 = rEString64.makeAnyChar(rEString69);
        st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString75 = rEString72.makeExclude(rEString74);
        st1920.automaton.REString rEString76 = rEString69.makeAnyChar(rEString75);
        st1920.automaton.REString rEString77 = rEString52.makeOneOrMore(rEString75);
        st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString82 = rEString79.makeExclude(rEString81);
        rEString79.string = "hi!";
        st1920.automaton.REString rEString85 = rEString34.makeAnd(rEString52, rEString79);
        boolean boolean86 = st1920.automaton.REGEXWrapper.matches("~", rEString79);
        boolean boolean87 = st1920.automaton.REGEXWrapper.matches("", rEString79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString7 = rEString4.makeExclude(rEString6);
        st1920.automaton.REString rEString8 = rEString2.makeAnyChar(rEString7);
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString13 = rEString10.makeExclude(rEString12);
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = rEString17.makeExclude(rEString19);
        st1920.automaton.REString rEString21 = rEString15.makeAnyChar(rEString20);
        st1920.automaton.REString rEString22 = rEString12.makeExclude(rEString15);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = rEString12.makeAlpha(rEString24);
        st1920.automaton.REString rEString26 = rEString7.makeAny(rEString25);
        st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = rEString28.makeExclude(rEString30);
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = rEString35.makeExclude(rEString37);
        st1920.automaton.REString rEString39 = rEString33.makeAnyChar(rEString38);
        st1920.automaton.REString rEString40 = rEString30.makeExclude(rEString33);
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = rEString44.makeExclude(rEString46);
        st1920.automaton.REString rEString48 = rEString42.makeAnyChar(rEString47);
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString53 = rEString50.makeExclude(rEString52);
        st1920.automaton.REString rEString54 = rEString47.makeAnyChar(rEString53);
        st1920.automaton.REString rEString55 = rEString40.makeZeroOrOne(rEString53);
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = rEString57.makeExclude(rEString59);
        st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString67 = rEString64.makeExclude(rEString66);
        st1920.automaton.REString rEString68 = rEString62.makeAnyChar(rEString67);
        st1920.automaton.REString rEString69 = rEString59.makeExclude(rEString62);
        st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString74 = rEString71.makeExclude(rEString73);
        st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString81 = rEString78.makeExclude(rEString80);
        st1920.automaton.REString rEString82 = rEString76.makeAnyChar(rEString81);
        st1920.automaton.REString rEString83 = rEString73.makeExclude(rEString76);
        st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString86 = rEString73.makeAlpha(rEString85);
        st1920.automaton.REString rEString87 = rEString69.makeAlpha(rEString85);
        st1920.automaton.REString rEString89 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString91 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString92 = rEString89.makeExclude(rEString91);
        st1920.automaton.REString rEString93 = rEString55.makeOr(rEString69, rEString92);
        st1920.automaton.REString rEString94 = rEString26.makeAnyChar(rEString93);
        java.lang.String str95 = rEString26.string;
        boolean boolean96 = st1920.automaton.REGEXWrapper.matches("a@", rEString26);
        rEString26.string = "a@";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str95 + "' != '" + "a@" + "'", str95.equals("a@"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = rEString7.makeExclude(rEString9);
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = rEString14.makeExclude(rEString16);
        st1920.automaton.REString rEString18 = rEString12.makeAnyChar(rEString17);
        st1920.automaton.REString rEString19 = rEString9.makeExclude(rEString12);
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = rEString23.makeExclude(rEString25);
        st1920.automaton.REString rEString27 = rEString21.makeAnyChar(rEString26);
        st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString32 = rEString29.makeExclude(rEString31);
        st1920.automaton.REString rEString33 = rEString26.makeAnyChar(rEString32);
        st1920.automaton.REString rEString34 = rEString19.makeZeroOrOne(rEString32);
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString39 = rEString36.makeExclude(rEString38);
        st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = rEString43.makeExclude(rEString45);
        st1920.automaton.REString rEString47 = rEString41.makeAnyChar(rEString46);
        st1920.automaton.REString rEString48 = rEString38.makeExclude(rEString41);
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString53 = rEString50.makeExclude(rEString52);
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = rEString57.makeExclude(rEString59);
        st1920.automaton.REString rEString61 = rEString55.makeAnyChar(rEString60);
        st1920.automaton.REString rEString62 = rEString52.makeExclude(rEString55);
        st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString69 = rEString66.makeExclude(rEString68);
        st1920.automaton.REString rEString70 = rEString64.makeAnyChar(rEString69);
        st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString75 = rEString72.makeExclude(rEString74);
        st1920.automaton.REString rEString76 = rEString69.makeAnyChar(rEString75);
        st1920.automaton.REString rEString77 = rEString52.makeOneOrMore(rEString75);
        st1920.automaton.REString rEString78 = rEString32.makeOr(rEString48, rEString52);
        st1920.automaton.REString rEString79 = rEString2.makeAny(rEString32);
        rEString79.string = "";
        boolean boolean82 = st1920.automaton.REGEXWrapper.matches("~.1", rEString79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = st1920.automaton.REGEXWrapper.matches("~.+", rEString5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = rEString1.makeExclude(rEString3);
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = rEString8.makeExclude(rEString10);
        st1920.automaton.REString rEString12 = rEString6.makeAnyChar(rEString11);
        st1920.automaton.REString rEString13 = rEString3.makeExclude(rEString6);
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = rEString17.makeExclude(rEString19);
        st1920.automaton.REString rEString21 = rEString15.makeAnyChar(rEString20);
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = rEString23.makeExclude(rEString25);
        st1920.automaton.REString rEString27 = rEString20.makeAnyChar(rEString26);
        st1920.automaton.REString rEString28 = rEString13.makeZeroOrOne(rEString26);
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = rEString32.makeExclude(rEString34);
        st1920.automaton.REString rEString36 = rEString30.makeAnyChar(rEString35);
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = rEString38.makeExclude(rEString40);
        st1920.automaton.REString rEString42 = rEString35.makeAnyChar(rEString41);
        st1920.automaton.REString rEString43 = rEString13.makeOneOrMore(rEString42);
        java.lang.String str44 = rEString43.string;
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString53 = rEString50.makeExclude(rEString52);
        st1920.automaton.REString rEString54 = rEString48.makeAnyChar(rEString53);
        st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString59 = rEString56.makeExclude(rEString58);
        st1920.automaton.REString rEString62 = rEString48.makeRange(rEString58, 10, 0);
        st1920.automaton.REString rEString65 = rEString46.makeRep(rEString48, (int) 'a', (int) '4');
        st1920.automaton.REString rEString66 = rEString43.makeAnyChar(rEString48);
        st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString76 = rEString73.makeExclude(rEString75);
        st1920.automaton.REString rEString77 = rEString71.makeAnyChar(rEString76);
        st1920.automaton.REString rEString78 = rEString69.makeAnyChar(rEString77);
        boolean boolean79 = st1920.automaton.REGEXWrapper.matches("~.+", rEString69);
        java.lang.String str80 = rEString69.string;
        st1920.automaton.REString rEString81 = rEString43.makeOneOrMore(rEString69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "~.+" + "'", str44.equals("~.+"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "" + "'", str80.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString81);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString7 = rEString4.makeExclude(rEString6);
        st1920.automaton.REString rEString8 = rEString2.makeAnyChar(rEString7);
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString13 = rEString10.makeExclude(rEString12);
        st1920.automaton.REString rEString16 = rEString2.makeRange(rEString12, 10, 0);
        boolean boolean17 = st1920.automaton.REGEXWrapper.matches("", rEString2);
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = rEString23.makeExclude(rEString25);
        st1920.automaton.REString rEString27 = rEString21.makeAnyChar(rEString26);
        st1920.automaton.REString rEString28 = rEString19.makeAnyChar(rEString27);
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = rEString30.makeExclude(rEString32);
        java.lang.String str34 = rEString32.string;
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString39 = rEString36.makeExclude(rEString38);
        st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = rEString43.makeExclude(rEString45);
        st1920.automaton.REString rEString47 = rEString41.makeAnyChar(rEString46);
        st1920.automaton.REString rEString48 = rEString38.makeExclude(rEString41);
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = rEString38.makeAlpha(rEString50);
        st1920.automaton.REString rEString52 = rEString32.makeExclude(rEString50);
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString59 = rEString56.makeExclude(rEString58);
        st1920.automaton.REString rEString60 = rEString54.makeAnyChar(rEString59);
        st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = rEString62.makeExclude(rEString64);
        st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = rEString69.makeExclude(rEString71);
        st1920.automaton.REString rEString73 = rEString67.makeAnyChar(rEString72);
        st1920.automaton.REString rEString74 = rEString64.makeExclude(rEString67);
        st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString77 = rEString64.makeAlpha(rEString76);
        st1920.automaton.REString rEString78 = rEString59.makeAny(rEString77);
        st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString82 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString83 = rEString80.makeExclude(rEString82);
        st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString87 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString89 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString90 = rEString87.makeExclude(rEString89);
        st1920.automaton.REString rEString91 = rEString85.makeAnyChar(rEString90);
        st1920.automaton.REString rEString92 = rEString82.makeExclude(rEString85);
        st1920.automaton.REString rEString93 = rEString52.makeAnd(rEString59, rEString85);
        st1920.automaton.REString rEString94 = rEString27.makeExclude(rEString93);
        st1920.automaton.REString rEString97 = rEString2.makeRange(rEString94, 10, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString97);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = rEString7.makeExclude(rEString9);
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString15 = rEString12.makeExclude(rEString14);
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString22 = rEString19.makeExclude(rEString21);
        st1920.automaton.REString rEString23 = rEString17.makeAnyChar(rEString22);
        st1920.automaton.REString rEString24 = rEString14.makeExclude(rEString17);
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = rEString28.makeExclude(rEString30);
        st1920.automaton.REString rEString32 = rEString26.makeAnyChar(rEString31);
        st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = rEString34.makeExclude(rEString36);
        st1920.automaton.REString rEString38 = rEString31.makeAnyChar(rEString37);
        st1920.automaton.REString rEString39 = rEString24.makeZeroOrOne(rEString37);
        st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = rEString41.makeExclude(rEString43);
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = rEString48.makeExclude(rEString50);
        st1920.automaton.REString rEString52 = rEString46.makeAnyChar(rEString51);
        st1920.automaton.REString rEString53 = rEString43.makeExclude(rEString46);
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString56 = rEString43.makeAlpha(rEString55);
        st1920.automaton.REString rEString57 = rEString24.makeClass(rEString43);
        st1920.automaton.REString rEString60 = rEString9.makeRep(rEString24, (int) 'a', (int) (short) 1);
        st1920.automaton.REString rEString61 = rEString5.makeZeroOrMore(rEString9);
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = rEString63.makeExclude(rEString65);
        st1920.automaton.REString rEString67 = rEString61.makeNum(rEString65);
        boolean boolean68 = st1920.automaton.REGEXWrapper.matches("", rEString61);
        rEString61.string = "a@";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = rEString1.makeExclude(rEString3);
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = rEString6.makeExclude(rEString8);
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString14 = rEString11.makeExclude(rEString13);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString22 = rEString16.makeAnyChar(rEString21);
        st1920.automaton.REString rEString23 = rEString13.makeExclude(rEString16);
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString30 = rEString27.makeExclude(rEString29);
        st1920.automaton.REString rEString31 = rEString25.makeAnyChar(rEString30);
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString36 = rEString33.makeExclude(rEString35);
        st1920.automaton.REString rEString37 = rEString30.makeAnyChar(rEString36);
        st1920.automaton.REString rEString38 = rEString23.makeZeroOrOne(rEString36);
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = rEString40.makeExclude(rEString42);
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = rEString47.makeExclude(rEString49);
        st1920.automaton.REString rEString51 = rEString45.makeAnyChar(rEString50);
        st1920.automaton.REString rEString52 = rEString42.makeExclude(rEString45);
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = rEString42.makeAlpha(rEString54);
        st1920.automaton.REString rEString56 = rEString23.makeClass(rEString42);
        st1920.automaton.REString rEString59 = rEString8.makeRep(rEString23, (int) 'a', (int) (short) 1);
        st1920.automaton.REString rEString60 = rEString4.makeZeroOrMore(rEString8);
        st1920.automaton.REString rEString62 = new st1920.automaton.REString("#");
        st1920.automaton.REString rEString63 = rEString8.makeGroup(rEString62);
        st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString71 = rEString68.makeExclude(rEString70);
        st1920.automaton.REString rEString72 = rEString66.makeAnyChar(rEString71);
        st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString77 = rEString74.makeExclude(rEString76);
        st1920.automaton.REString rEString80 = rEString66.makeRange(rEString76, 10, 0);
        boolean boolean81 = st1920.automaton.REGEXWrapper.matches("~.", rEString76);
        st1920.automaton.REString rEString82 = rEString8.makeGroup(rEString76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString82);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = rEString7.makeExclude(rEString9);
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = rEString14.makeExclude(rEString16);
        st1920.automaton.REString rEString18 = rEString12.makeAnyChar(rEString17);
        st1920.automaton.REString rEString19 = rEString9.makeExclude(rEString12);
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = rEString23.makeExclude(rEString25);
        st1920.automaton.REString rEString27 = rEString21.makeAnyChar(rEString26);
        st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString32 = rEString29.makeExclude(rEString31);
        st1920.automaton.REString rEString33 = rEString26.makeAnyChar(rEString32);
        st1920.automaton.REString rEString34 = rEString19.makeZeroOrOne(rEString32);
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString39 = rEString36.makeExclude(rEString38);
        st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = rEString43.makeExclude(rEString45);
        st1920.automaton.REString rEString47 = rEString41.makeAnyChar(rEString46);
        st1920.automaton.REString rEString48 = rEString38.makeExclude(rEString41);
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = rEString38.makeAlpha(rEString50);
        st1920.automaton.REString rEString52 = rEString19.makeClass(rEString38);
        st1920.automaton.REString rEString55 = rEString4.makeRep(rEString19, (int) 'a', (int) (short) 1);
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = rEString61.makeExclude(rEString63);
        st1920.automaton.REString rEString65 = rEString59.makeAnyChar(rEString64);
        st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString70 = rEString67.makeExclude(rEString69);
        st1920.automaton.REString rEString73 = rEString59.makeRange(rEString69, 10, 0);
        st1920.automaton.REString rEString76 = rEString57.makeRep(rEString59, (int) 'a', (int) '4');
        st1920.automaton.REString rEString77 = rEString4.makeZeroOrOne(rEString57);
        java.lang.String str78 = rEString4.string;
        boolean boolean79 = st1920.automaton.REGEXWrapper.matches("", rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "" + "'", str78.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString22 = rEString16.makeAnyChar(rEString21);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString21.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString4.makeOneOrMore(rEString27);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = rEString35.makeExclude(rEString37);
        st1920.automaton.REString rEString39 = rEString33.makeAnyChar(rEString38);
        st1920.automaton.REString rEString40 = rEString31.makeAnyChar(rEString39);
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = rEString44.makeExclude(rEString46);
        st1920.automaton.REString rEString48 = rEString42.makeAnyChar(rEString47);
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString53 = rEString50.makeExclude(rEString52);
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = rEString57.makeExclude(rEString59);
        st1920.automaton.REString rEString61 = rEString55.makeAnyChar(rEString60);
        st1920.automaton.REString rEString62 = rEString52.makeExclude(rEString55);
        st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = rEString52.makeAlpha(rEString64);
        st1920.automaton.REString rEString66 = rEString47.makeAny(rEString65);
        st1920.automaton.REString rEString67 = rEString31.makeClass(rEString65);
        st1920.automaton.REString rEString68 = rEString4.makeOneOrMore(rEString67);
        st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString73 = rEString70.makeExclude(rEString72);
        st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString77 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString80 = rEString77.makeExclude(rEString79);
        st1920.automaton.REString rEString81 = rEString75.makeAnyChar(rEString80);
        st1920.automaton.REString rEString82 = rEString72.makeExclude(rEString75);
        st1920.automaton.REString rEString84 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString86 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString88 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString89 = rEString86.makeExclude(rEString88);
        st1920.automaton.REString rEString90 = rEString84.makeAnyChar(rEString89);
        st1920.automaton.REString rEString92 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString94 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString95 = rEString92.makeExclude(rEString94);
        st1920.automaton.REString rEString96 = rEString89.makeAnyChar(rEString95);
        st1920.automaton.REString rEString97 = rEString82.makeZeroOrOne(rEString95);
        st1920.automaton.REString rEString98 = rEString4.makeAnyChar(rEString97);
        boolean boolean99 = st1920.automaton.REGEXWrapper.matches("~~&", rEString97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        java.lang.String str6 = rEString4.string;
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = rEString8.makeExclude(rEString10);
        st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = rEString15.makeExclude(rEString17);
        st1920.automaton.REString rEString19 = rEString13.makeAnyChar(rEString18);
        st1920.automaton.REString rEString20 = rEString10.makeExclude(rEString13);
        st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = rEString10.makeAlpha(rEString22);
        st1920.automaton.REString rEString24 = rEString4.makeExclude(rEString22);
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = rEString28.makeExclude(rEString30);
        st1920.automaton.REString rEString32 = rEString26.makeAnyChar(rEString31);
        st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = rEString34.makeExclude(rEString36);
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = rEString41.makeExclude(rEString43);
        st1920.automaton.REString rEString45 = rEString39.makeAnyChar(rEString44);
        st1920.automaton.REString rEString46 = rEString36.makeExclude(rEString39);
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString49 = rEString36.makeAlpha(rEString48);
        st1920.automaton.REString rEString50 = rEString31.makeAny(rEString49);
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = rEString52.makeExclude(rEString54);
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString62 = rEString59.makeExclude(rEString61);
        st1920.automaton.REString rEString63 = rEString57.makeAnyChar(rEString62);
        st1920.automaton.REString rEString64 = rEString54.makeExclude(rEString57);
        st1920.automaton.REString rEString65 = rEString24.makeAnd(rEString31, rEString57);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean66 = st1920.automaton.REGEXWrapper.matches("", rEString24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = rEString6.makeExclude(rEString8);
        st1920.automaton.REString rEString10 = rEString4.makeAnyChar(rEString9);
        st1920.automaton.REString rEString11 = rEString2.makeAnyChar(rEString10);
        boolean boolean12 = st1920.automaton.REGEXWrapper.matches("~.+", rEString2);
        st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString22 = rEString16.makeAnyChar(rEString21);
        st1920.automaton.REString rEString23 = rEString14.makeAnyChar(rEString22);
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString28 = rEString25.makeExclude(rEString27);
        java.lang.String str29 = rEString27.string;
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = rEString31.makeExclude(rEString33);
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = rEString38.makeExclude(rEString40);
        st1920.automaton.REString rEString42 = rEString36.makeAnyChar(rEString41);
        st1920.automaton.REString rEString43 = rEString33.makeExclude(rEString36);
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = rEString33.makeAlpha(rEString45);
        st1920.automaton.REString rEString47 = rEString27.makeExclude(rEString45);
        st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString54 = rEString51.makeExclude(rEString53);
        st1920.automaton.REString rEString55 = rEString49.makeAnyChar(rEString54);
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = rEString57.makeExclude(rEString59);
        st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString67 = rEString64.makeExclude(rEString66);
        st1920.automaton.REString rEString68 = rEString62.makeAnyChar(rEString67);
        st1920.automaton.REString rEString69 = rEString59.makeExclude(rEString62);
        st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = rEString59.makeAlpha(rEString71);
        st1920.automaton.REString rEString73 = rEString54.makeAny(rEString72);
        st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString77 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString78 = rEString75.makeExclude(rEString77);
        st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString82 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString84 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString85 = rEString82.makeExclude(rEString84);
        st1920.automaton.REString rEString86 = rEString80.makeAnyChar(rEString85);
        st1920.automaton.REString rEString87 = rEString77.makeExclude(rEString80);
        st1920.automaton.REString rEString88 = rEString47.makeAnd(rEString54, rEString80);
        st1920.automaton.REString rEString89 = rEString22.makeExclude(rEString88);
        rEString88.string = "";
        st1920.automaton.REString rEString92 = rEString2.makeGroup(rEString88);
        java.lang.Class<?> wildcardClass93 = rEString92.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        java.lang.String str6 = rEString4.string;
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = rEString8.makeExclude(rEString10);
        st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = rEString15.makeExclude(rEString17);
        st1920.automaton.REString rEString19 = rEString13.makeAnyChar(rEString18);
        st1920.automaton.REString rEString20 = rEString10.makeExclude(rEString13);
        st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = rEString10.makeAlpha(rEString22);
        st1920.automaton.REString rEString24 = rEString4.makeExclude(rEString22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = st1920.automaton.REGEXWrapper.matches("[~..]<0-1>", rEString24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString24);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString7 = rEString4.makeExclude(rEString6);
        st1920.automaton.REString rEString8 = rEString2.makeAnyChar(rEString7);
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString13 = rEString10.makeExclude(rEString12);
        st1920.automaton.REString rEString16 = rEString2.makeRange(rEString12, 10, 0);
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString28 = rEString25.makeExclude(rEString27);
        st1920.automaton.REString rEString29 = rEString23.makeAnyChar(rEString28);
        st1920.automaton.REString rEString30 = rEString20.makeExclude(rEString23);
        st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = rEString34.makeExclude(rEString36);
        st1920.automaton.REString rEString38 = rEString32.makeAnyChar(rEString37);
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = rEString40.makeExclude(rEString42);
        st1920.automaton.REString rEString44 = rEString37.makeAnyChar(rEString43);
        st1920.automaton.REString rEString45 = rEString30.makeZeroOrOne(rEString43);
        st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = rEString49.makeExclude(rEString51);
        st1920.automaton.REString rEString53 = rEString47.makeAnyChar(rEString52);
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString58 = rEString55.makeExclude(rEString57);
        st1920.automaton.REString rEString59 = rEString52.makeAnyChar(rEString58);
        st1920.automaton.REString rEString60 = rEString30.makeOneOrMore(rEString59);
        st1920.automaton.REString rEString61 = rEString12.makeNothing(rEString30);
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString70 = rEString67.makeExclude(rEString69);
        st1920.automaton.REString rEString71 = rEString65.makeAnyChar(rEString70);
        st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString76 = rEString73.makeExclude(rEString75);
        st1920.automaton.REString rEString79 = rEString65.makeRange(rEString75, 10, 0);
        st1920.automaton.REString rEString82 = rEString63.makeRep(rEString65, (int) 'a', (int) '4');
        st1920.automaton.REString rEString83 = rEString12.makeZeroOrOne(rEString65);
        boolean boolean84 = st1920.automaton.REGEXWrapper.matches("", rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        st1920.automaton.REString rEString1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = st1920.automaton.REGEXWrapper.matches("~.", rEString1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = rEString3.makeExclude(rEString5);
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString13 = rEString10.makeExclude(rEString12);
        st1920.automaton.REString rEString14 = rEString8.makeAnyChar(rEString13);
        st1920.automaton.REString rEString15 = rEString5.makeExclude(rEString8);
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = rEString17.makeExclude(rEString19);
        st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString22.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString19.makeExclude(rEString22);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString32 = rEString19.makeAlpha(rEString31);
        st1920.automaton.REString rEString33 = rEString15.makeAlpha(rEString31);
        boolean boolean34 = st1920.automaton.REGEXWrapper.matches("~.+", rEString31);
        boolean boolean35 = st1920.automaton.REGEXWrapper.matches("hi!", rEString31);
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString45 = rEString42.makeExclude(rEString44);
        st1920.automaton.REString rEString46 = rEString40.makeAnyChar(rEString45);
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = rEString48.makeExclude(rEString50);
        st1920.automaton.REString rEString54 = rEString40.makeRange(rEString50, 10, 0);
        st1920.automaton.REString rEString57 = rEString38.makeRep(rEString40, (int) 'a', (int) '4');
        boolean boolean58 = st1920.automaton.REGEXWrapper.matches("*", rEString57);
        st1920.automaton.REString rEString59 = rEString31.makeZeroOrMore(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = rEString16.makeExclude(rEString18);
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = rEString23.makeExclude(rEString25);
        st1920.automaton.REString rEString27 = rEString21.makeAnyChar(rEString26);
        st1920.automaton.REString rEString28 = rEString18.makeExclude(rEString21);
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = rEString18.makeAlpha(rEString30);
        st1920.automaton.REString rEString32 = rEString14.makeAlpha(rEString30);
        st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = rEString34.makeExclude(rEString36);
        java.lang.String str38 = rEString36.string;
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = rEString40.makeExclude(rEString42);
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = rEString47.makeExclude(rEString49);
        st1920.automaton.REString rEString51 = rEString45.makeAnyChar(rEString50);
        st1920.automaton.REString rEString52 = rEString42.makeExclude(rEString45);
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = rEString42.makeAlpha(rEString54);
        st1920.automaton.REString rEString56 = rEString36.makeExclude(rEString54);
        st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString63 = rEString60.makeExclude(rEString62);
        st1920.automaton.REString rEString64 = rEString58.makeAnyChar(rEString63);
        st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString69 = rEString66.makeExclude(rEString68);
        st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString76 = rEString73.makeExclude(rEString75);
        st1920.automaton.REString rEString77 = rEString71.makeAnyChar(rEString76);
        st1920.automaton.REString rEString78 = rEString68.makeExclude(rEString71);
        st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString81 = rEString68.makeAlpha(rEString80);
        st1920.automaton.REString rEString82 = rEString63.makeAny(rEString81);
        st1920.automaton.REString rEString84 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString86 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString87 = rEString84.makeExclude(rEString86);
        st1920.automaton.REString rEString89 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString91 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString93 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString94 = rEString91.makeExclude(rEString93);
        st1920.automaton.REString rEString95 = rEString89.makeAnyChar(rEString94);
        st1920.automaton.REString rEString96 = rEString86.makeExclude(rEString89);
        st1920.automaton.REString rEString97 = rEString56.makeAnd(rEString63, rEString89);
        st1920.automaton.REString rEString98 = rEString14.makeAlpha(rEString63);
        boolean boolean99 = st1920.automaton.REGEXWrapper.matches("[~..]<0-1>", rEString98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = rEString6.makeExclude(rEString8);
        st1920.automaton.REString rEString10 = rEString4.makeAnyChar(rEString9);
        st1920.automaton.REString rEString11 = rEString2.makeAnyChar(rEString10);
        st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = rEString15.makeExclude(rEString17);
        st1920.automaton.REString rEString19 = rEString13.makeAnyChar(rEString18);
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString24 = rEString21.makeExclude(rEString23);
        st1920.automaton.REString rEString27 = rEString13.makeRange(rEString23, 10, 0);
        st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString32 = rEString29.makeExclude(rEString31);
        st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString39 = rEString36.makeExclude(rEString38);
        st1920.automaton.REString rEString40 = rEString34.makeAnyChar(rEString39);
        st1920.automaton.REString rEString41 = rEString31.makeExclude(rEString34);
        st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = rEString45.makeExclude(rEString47);
        st1920.automaton.REString rEString49 = rEString43.makeAnyChar(rEString48);
        st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString54 = rEString51.makeExclude(rEString53);
        st1920.automaton.REString rEString55 = rEString48.makeAnyChar(rEString54);
        st1920.automaton.REString rEString56 = rEString41.makeZeroOrOne(rEString54);
        st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString63 = rEString60.makeExclude(rEString62);
        st1920.automaton.REString rEString64 = rEString58.makeAnyChar(rEString63);
        st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString69 = rEString66.makeExclude(rEString68);
        st1920.automaton.REString rEString70 = rEString63.makeAnyChar(rEString69);
        st1920.automaton.REString rEString71 = rEString41.makeOneOrMore(rEString70);
        st1920.automaton.REString rEString72 = rEString23.makeNothing(rEString41);
        st1920.automaton.REString rEString73 = rEString2.makeAnyChar(rEString72);
        boolean boolean74 = st1920.automaton.REGEXWrapper.matches("~", rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = rEString3.makeExclude(rEString5);
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString13 = rEString10.makeExclude(rEString12);
        st1920.automaton.REString rEString14 = rEString8.makeAnyChar(rEString13);
        st1920.automaton.REString rEString15 = rEString5.makeExclude(rEString8);
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = rEString17.makeExclude(rEString19);
        st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString22.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString19.makeExclude(rEString22);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString36 = rEString33.makeExclude(rEString35);
        st1920.automaton.REString rEString37 = rEString31.makeAnyChar(rEString36);
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = rEString39.makeExclude(rEString41);
        st1920.automaton.REString rEString43 = rEString36.makeAnyChar(rEString42);
        st1920.automaton.REString rEString44 = rEString29.makeZeroOrOne(rEString42);
        rEString44.string = "";
        st1920.automaton.REString rEString47 = rEString5.makeOneOrMore(rEString44);
        st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = rEString49.makeExclude(rEString51);
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString59 = rEString56.makeExclude(rEString58);
        st1920.automaton.REString rEString60 = rEString54.makeAnyChar(rEString59);
        st1920.automaton.REString rEString61 = rEString51.makeExclude(rEString54);
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString68 = rEString65.makeExclude(rEString67);
        st1920.automaton.REString rEString69 = rEString63.makeAnyChar(rEString68);
        st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString74 = rEString71.makeExclude(rEString73);
        st1920.automaton.REString rEString75 = rEString68.makeAnyChar(rEString74);
        st1920.automaton.REString rEString76 = rEString61.makeZeroOrOne(rEString74);
        st1920.automaton.REString rEString77 = rEString44.makeOneOrMore(rEString76);
        boolean boolean78 = st1920.automaton.REGEXWrapper.matches("+", rEString44);
        boolean boolean79 = st1920.automaton.REGEXWrapper.matches("~", rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = rEString16.makeExclude(rEString18);
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = rEString23.makeExclude(rEString25);
        st1920.automaton.REString rEString27 = rEString21.makeAnyChar(rEString26);
        st1920.automaton.REString rEString28 = rEString18.makeExclude(rEString21);
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = rEString30.makeExclude(rEString32);
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = rEString37.makeExclude(rEString39);
        st1920.automaton.REString rEString41 = rEString35.makeAnyChar(rEString40);
        st1920.automaton.REString rEString42 = rEString32.makeExclude(rEString35);
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString45 = rEString32.makeAlpha(rEString44);
        st1920.automaton.REString rEString46 = rEString28.makeAlpha(rEString44);
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString53 = rEString50.makeExclude(rEString52);
        st1920.automaton.REString rEString54 = rEString48.makeAnyChar(rEString53);
        st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString63 = rEString60.makeExclude(rEString62);
        st1920.automaton.REString rEString64 = rEString58.makeAnyChar(rEString63);
        st1920.automaton.REString rEString65 = rEString56.makeAnyChar(rEString64);
        st1920.automaton.REString rEString66 = rEString48.makeClass(rEString65);
        st1920.automaton.REString rEString67 = rEString14.makeConcatenation(rEString28, rEString48);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean68 = st1920.automaton.REGEXWrapper.matches("*", rEString14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = rEString7.makeExclude(rEString9);
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString15 = rEString12.makeExclude(rEString14);
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = rEString17.makeExclude(rEString19);
        st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString22.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString19.makeExclude(rEString22);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString36 = rEString33.makeExclude(rEString35);
        st1920.automaton.REString rEString37 = rEString31.makeAnyChar(rEString36);
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = rEString39.makeExclude(rEString41);
        st1920.automaton.REString rEString43 = rEString36.makeAnyChar(rEString42);
        st1920.automaton.REString rEString44 = rEString29.makeZeroOrOne(rEString42);
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString49 = rEString46.makeExclude(rEString48);
        st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString56 = rEString53.makeExclude(rEString55);
        st1920.automaton.REString rEString57 = rEString51.makeAnyChar(rEString56);
        st1920.automaton.REString rEString58 = rEString48.makeExclude(rEString51);
        st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString61 = rEString48.makeAlpha(rEString60);
        st1920.automaton.REString rEString62 = rEString29.makeClass(rEString48);
        st1920.automaton.REString rEString65 = rEString14.makeRep(rEString29, (int) 'a', (int) (short) 1);
        st1920.automaton.REString rEString66 = rEString10.makeZeroOrMore(rEString14);
        st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString73 = rEString70.makeExclude(rEString72);
        st1920.automaton.REString rEString74 = rEString68.makeAnyChar(rEString73);
        st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString79 = rEString76.makeExclude(rEString78);
        st1920.automaton.REString rEString82 = rEString68.makeRange(rEString78, 10, 0);
        st1920.automaton.REString rEString83 = rEString10.makeNum(rEString78);
        st1920.automaton.REString rEString84 = rEString5.makeExclude(rEString83);
        boolean boolean85 = st1920.automaton.REGEXWrapper.matches("~..1", rEString83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString7 = rEString4.makeExclude(rEString6);
        st1920.automaton.REString rEString8 = rEString2.makeAnyChar(rEString7);
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString13 = rEString10.makeExclude(rEString12);
        st1920.automaton.REString rEString16 = rEString2.makeRange(rEString12, 10, 0);
        boolean boolean17 = st1920.automaton.REGEXWrapper.matches("~.", rEString12);
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString22 = rEString19.makeExclude(rEString21);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString29 = rEString26.makeExclude(rEString28);
        st1920.automaton.REString rEString30 = rEString24.makeAnyChar(rEString29);
        st1920.automaton.REString rEString31 = rEString21.makeExclude(rEString24);
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = rEString35.makeExclude(rEString37);
        st1920.automaton.REString rEString39 = rEString33.makeAnyChar(rEString38);
        st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = rEString41.makeExclude(rEString43);
        st1920.automaton.REString rEString45 = rEString38.makeAnyChar(rEString44);
        st1920.automaton.REString rEString46 = rEString31.makeZeroOrOne(rEString44);
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = rEString48.makeExclude(rEString50);
        st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString58 = rEString55.makeExclude(rEString57);
        st1920.automaton.REString rEString59 = rEString53.makeAnyChar(rEString58);
        st1920.automaton.REString rEString60 = rEString50.makeExclude(rEString53);
        st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString63 = rEString50.makeAlpha(rEString62);
        st1920.automaton.REString rEString64 = rEString31.makeClass(rEString50);
        st1920.automaton.REString rEString67 = rEString12.makeRange(rEString31, (int) '4', (-1));
        java.lang.String str68 = rEString12.string;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "" + "'", str68.equals(""));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString22 = rEString16.makeAnyChar(rEString21);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString21.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString14.makeZeroOrOne(rEString27);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = rEString31.makeExclude(rEString33);
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = rEString38.makeExclude(rEString40);
        st1920.automaton.REString rEString42 = rEString36.makeAnyChar(rEString41);
        st1920.automaton.REString rEString43 = rEString33.makeExclude(rEString36);
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = rEString45.makeExclude(rEString47);
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = rEString52.makeExclude(rEString54);
        st1920.automaton.REString rEString56 = rEString50.makeAnyChar(rEString55);
        st1920.automaton.REString rEString57 = rEString47.makeExclude(rEString50);
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = rEString61.makeExclude(rEString63);
        st1920.automaton.REString rEString65 = rEString59.makeAnyChar(rEString64);
        st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString70 = rEString67.makeExclude(rEString69);
        st1920.automaton.REString rEString71 = rEString64.makeAnyChar(rEString70);
        st1920.automaton.REString rEString72 = rEString47.makeOneOrMore(rEString70);
        st1920.automaton.REString rEString73 = rEString27.makeOr(rEString43, rEString47);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean74 = st1920.automaton.REGEXWrapper.matches("~.+", rEString27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString22 = rEString16.makeAnyChar(rEString21);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString21.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString14.makeZeroOrOne(rEString27);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = rEString31.makeExclude(rEString33);
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = rEString38.makeExclude(rEString40);
        st1920.automaton.REString rEString42 = rEString36.makeAnyChar(rEString41);
        st1920.automaton.REString rEString43 = rEString33.makeExclude(rEString36);
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = rEString45.makeExclude(rEString47);
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = rEString52.makeExclude(rEString54);
        st1920.automaton.REString rEString56 = rEString50.makeAnyChar(rEString55);
        st1920.automaton.REString rEString57 = rEString47.makeExclude(rEString50);
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = rEString47.makeAlpha(rEString59);
        st1920.automaton.REString rEString61 = rEString43.makeAlpha(rEString59);
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = rEString63.makeExclude(rEString65);
        st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString73 = rEString70.makeExclude(rEString72);
        st1920.automaton.REString rEString74 = rEString68.makeAnyChar(rEString73);
        st1920.automaton.REString rEString75 = rEString65.makeExclude(rEString68);
        st1920.automaton.REString rEString77 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString82 = rEString79.makeExclude(rEString81);
        st1920.automaton.REString rEString83 = rEString77.makeAnyChar(rEString82);
        st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString87 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString88 = rEString85.makeExclude(rEString87);
        st1920.automaton.REString rEString89 = rEString82.makeAnyChar(rEString88);
        st1920.automaton.REString rEString90 = rEString75.makeZeroOrOne(rEString88);
        st1920.automaton.REString rEString91 = rEString43.makeExclude(rEString90);
        st1920.automaton.REString rEString94 = rEString29.makeRange(rEString91, (int) (byte) 10, (-1));
        rEString91.string = "~|?";
        boolean boolean97 = st1920.automaton.REGEXWrapper.matches("~", rEString91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString22 = rEString16.makeAnyChar(rEString21);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString21.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString4.makeOneOrMore(rEString27);
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString36 = rEString33.makeExclude(rEString35);
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = rEString40.makeExclude(rEString42);
        st1920.automaton.REString rEString44 = rEString38.makeAnyChar(rEString43);
        st1920.automaton.REString rEString45 = rEString35.makeExclude(rEString38);
        st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = rEString47.makeExclude(rEString49);
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString57 = rEString54.makeExclude(rEString56);
        st1920.automaton.REString rEString58 = rEString52.makeAnyChar(rEString57);
        st1920.automaton.REString rEString59 = rEString49.makeExclude(rEString52);
        st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString62 = rEString49.makeAlpha(rEString61);
        st1920.automaton.REString rEString63 = rEString45.makeAlpha(rEString61);
        boolean boolean64 = st1920.automaton.REGEXWrapper.matches("~.+", rEString61);
        boolean boolean65 = st1920.automaton.REGEXWrapper.matches("hi!", rEString61);
        st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString70 = rEString67.makeExclude(rEString69);
        st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString77 = rEString74.makeExclude(rEString76);
        st1920.automaton.REString rEString78 = rEString72.makeAnyChar(rEString77);
        st1920.automaton.REString rEString79 = rEString69.makeExclude(rEString72);
        st1920.automaton.REString rEString80 = rEString61.makeAnyChar(rEString72);
        st1920.automaton.REString rEString81 = rEString29.makeNothing(rEString80);
        boolean boolean82 = st1920.automaton.REGEXWrapper.matches("*", rEString80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = rEString3.makeExclude(rEString5);
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString13 = rEString10.makeExclude(rEString12);
        st1920.automaton.REString rEString14 = rEString8.makeAnyChar(rEString13);
        st1920.automaton.REString rEString15 = rEString5.makeExclude(rEString8);
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = rEString17.makeExclude(rEString19);
        st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString22.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString19.makeExclude(rEString22);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString32 = rEString19.makeAlpha(rEString31);
        st1920.automaton.REString rEString33 = rEString15.makeAlpha(rEString31);
        boolean boolean34 = st1920.automaton.REGEXWrapper.matches("~.+", rEString31);
        boolean boolean35 = st1920.automaton.REGEXWrapper.matches("hi!", rEString31);
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = rEString37.makeExclude(rEString39);
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = rEString44.makeExclude(rEString46);
        st1920.automaton.REString rEString48 = rEString42.makeAnyChar(rEString47);
        st1920.automaton.REString rEString49 = rEString39.makeExclude(rEString42);
        st1920.automaton.REString rEString50 = rEString31.makeAnyChar(rEString42);
        java.lang.String str51 = rEString42.string;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = rEString16.makeExclude(rEString18);
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = rEString23.makeExclude(rEString25);
        st1920.automaton.REString rEString27 = rEString21.makeAnyChar(rEString26);
        st1920.automaton.REString rEString28 = rEString18.makeExclude(rEString21);
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = rEString18.makeAlpha(rEString30);
        st1920.automaton.REString rEString32 = rEString14.makeAlpha(rEString30);
        st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = rEString34.makeExclude(rEString36);
        java.lang.String str38 = rEString36.string;
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = rEString40.makeExclude(rEString42);
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = rEString47.makeExclude(rEString49);
        st1920.automaton.REString rEString51 = rEString45.makeAnyChar(rEString50);
        st1920.automaton.REString rEString52 = rEString42.makeExclude(rEString45);
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = rEString42.makeAlpha(rEString54);
        st1920.automaton.REString rEString56 = rEString36.makeExclude(rEString54);
        st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString63 = rEString60.makeExclude(rEString62);
        st1920.automaton.REString rEString64 = rEString58.makeAnyChar(rEString63);
        st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString69 = rEString66.makeExclude(rEString68);
        st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString76 = rEString73.makeExclude(rEString75);
        st1920.automaton.REString rEString77 = rEString71.makeAnyChar(rEString76);
        st1920.automaton.REString rEString78 = rEString68.makeExclude(rEString71);
        st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString81 = rEString68.makeAlpha(rEString80);
        st1920.automaton.REString rEString82 = rEString63.makeAny(rEString81);
        st1920.automaton.REString rEString84 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString86 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString87 = rEString84.makeExclude(rEString86);
        st1920.automaton.REString rEString89 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString91 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString93 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString94 = rEString91.makeExclude(rEString93);
        st1920.automaton.REString rEString95 = rEString89.makeAnyChar(rEString94);
        st1920.automaton.REString rEString96 = rEString86.makeExclude(rEString89);
        st1920.automaton.REString rEString97 = rEString56.makeAnd(rEString63, rEString89);
        st1920.automaton.REString rEString98 = rEString32.makeNothing(rEString89);
        boolean boolean99 = st1920.automaton.REGEXWrapper.matches("~.1", rEString89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString8 = rEString5.makeExclude(rEString7);
        st1920.automaton.REString rEString9 = rEString3.makeAnyChar(rEString8);
        st1920.automaton.REString rEString10 = rEString1.makeAnyChar(rEString9);
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = rEString16.makeExclude(rEString18);
        st1920.automaton.REString rEString20 = rEString14.makeAnyChar(rEString19);
        st1920.automaton.REString rEString21 = rEString12.makeAnyChar(rEString20);
        java.lang.String str22 = rEString20.string;
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = rEString31.makeExclude(rEString33);
        st1920.automaton.REString rEString35 = rEString29.makeAnyChar(rEString34);
        st1920.automaton.REString rEString36 = rEString26.makeExclude(rEString29);
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = rEString40.makeExclude(rEString42);
        st1920.automaton.REString rEString44 = rEString38.makeAnyChar(rEString43);
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString49 = rEString46.makeExclude(rEString48);
        st1920.automaton.REString rEString50 = rEString43.makeAnyChar(rEString49);
        st1920.automaton.REString rEString51 = rEString36.makeZeroOrOne(rEString49);
        st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString58 = rEString55.makeExclude(rEString57);
        st1920.automaton.REString rEString59 = rEString53.makeAnyChar(rEString58);
        st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = rEString61.makeExclude(rEString63);
        st1920.automaton.REString rEString65 = rEString58.makeAnyChar(rEString64);
        st1920.automaton.REString rEString66 = rEString36.makeOneOrMore(rEString65);
        st1920.automaton.REString rEString67 = rEString20.makeClass(rEString66);
        st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString77 = rEString74.makeExclude(rEString76);
        st1920.automaton.REString rEString78 = rEString72.makeAnyChar(rEString77);
        st1920.automaton.REString rEString79 = rEString70.makeAnyChar(rEString78);
        boolean boolean80 = st1920.automaton.REGEXWrapper.matches("~.+", rEString70);
        java.lang.String str81 = rEString70.string;
        st1920.automaton.REString rEString82 = rEString67.makeZeroOrMore(rEString70);
        st1920.automaton.REString rEString83 = rEString10.makeExcludeClass(rEString82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "~." + "'", str22.equals("~."));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "" + "'", str81.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString83);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString7 = rEString4.makeExclude(rEString6);
        st1920.automaton.REString rEString8 = rEString2.makeAnyChar(rEString7);
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString13 = rEString10.makeExclude(rEString12);
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = rEString17.makeExclude(rEString19);
        st1920.automaton.REString rEString21 = rEString15.makeAnyChar(rEString20);
        st1920.automaton.REString rEString22 = rEString12.makeExclude(rEString15);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = rEString12.makeAlpha(rEString24);
        st1920.automaton.REString rEString26 = rEString7.makeAny(rEString25);
        st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = rEString28.makeExclude(rEString30);
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = rEString35.makeExclude(rEString37);
        st1920.automaton.REString rEString39 = rEString33.makeAnyChar(rEString38);
        st1920.automaton.REString rEString40 = rEString30.makeExclude(rEString33);
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = rEString44.makeExclude(rEString46);
        st1920.automaton.REString rEString48 = rEString42.makeAnyChar(rEString47);
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString53 = rEString50.makeExclude(rEString52);
        st1920.automaton.REString rEString54 = rEString47.makeAnyChar(rEString53);
        st1920.automaton.REString rEString55 = rEString40.makeZeroOrOne(rEString53);
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = rEString57.makeExclude(rEString59);
        st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString67 = rEString64.makeExclude(rEString66);
        st1920.automaton.REString rEString68 = rEString62.makeAnyChar(rEString67);
        st1920.automaton.REString rEString69 = rEString59.makeExclude(rEString62);
        st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString74 = rEString71.makeExclude(rEString73);
        st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString81 = rEString78.makeExclude(rEString80);
        st1920.automaton.REString rEString82 = rEString76.makeAnyChar(rEString81);
        st1920.automaton.REString rEString83 = rEString73.makeExclude(rEString76);
        st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString86 = rEString73.makeAlpha(rEString85);
        st1920.automaton.REString rEString87 = rEString69.makeAlpha(rEString85);
        st1920.automaton.REString rEString89 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString91 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString92 = rEString89.makeExclude(rEString91);
        st1920.automaton.REString rEString93 = rEString55.makeOr(rEString69, rEString92);
        st1920.automaton.REString rEString94 = rEString26.makeAnyChar(rEString93);
        boolean boolean95 = st1920.automaton.REGEXWrapper.matches("~..1", rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString22 = rEString16.makeAnyChar(rEString21);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString21.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString14.makeZeroOrOne(rEString27);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = rEString31.makeExclude(rEString33);
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = rEString38.makeExclude(rEString40);
        st1920.automaton.REString rEString42 = rEString36.makeAnyChar(rEString41);
        st1920.automaton.REString rEString43 = rEString33.makeExclude(rEString36);
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = rEString45.makeExclude(rEString47);
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = rEString52.makeExclude(rEString54);
        st1920.automaton.REString rEString56 = rEString50.makeAnyChar(rEString55);
        st1920.automaton.REString rEString57 = rEString47.makeExclude(rEString50);
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = rEString47.makeAlpha(rEString59);
        st1920.automaton.REString rEString61 = rEString43.makeAlpha(rEString59);
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = rEString63.makeExclude(rEString65);
        st1920.automaton.REString rEString67 = rEString29.makeOr(rEString43, rEString66);
        st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = rEString69.makeExclude(rEString71);
        st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString79 = rEString76.makeExclude(rEString78);
        st1920.automaton.REString rEString80 = rEString74.makeAnyChar(rEString79);
        st1920.automaton.REString rEString81 = rEString71.makeExclude(rEString74);
        st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString87 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString88 = rEString85.makeExclude(rEString87);
        st1920.automaton.REString rEString89 = rEString83.makeAnyChar(rEString88);
        st1920.automaton.REString rEString91 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString93 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString94 = rEString91.makeExclude(rEString93);
        st1920.automaton.REString rEString95 = rEString88.makeAnyChar(rEString94);
        st1920.automaton.REString rEString96 = rEString81.makeZeroOrOne(rEString94);
        st1920.automaton.REString rEString97 = rEString29.makeExcludeClass(rEString96);
        boolean boolean98 = st1920.automaton.REGEXWrapper.matches("[~..]<0-1>", rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = rEString6.makeExclude(rEString8);
        st1920.automaton.REString rEString10 = rEString4.makeAnyChar(rEString9);
        st1920.automaton.REString rEString11 = rEString2.makeAnyChar(rEString10);
        boolean boolean12 = st1920.automaton.REGEXWrapper.matches("~.+", rEString2);
        st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString22 = rEString16.makeAnyChar(rEString21);
        st1920.automaton.REString rEString23 = rEString14.makeAnyChar(rEString22);
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString28 = rEString25.makeExclude(rEString27);
        java.lang.String str29 = rEString27.string;
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = rEString31.makeExclude(rEString33);
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = rEString38.makeExclude(rEString40);
        st1920.automaton.REString rEString42 = rEString36.makeAnyChar(rEString41);
        st1920.automaton.REString rEString43 = rEString33.makeExclude(rEString36);
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = rEString33.makeAlpha(rEString45);
        st1920.automaton.REString rEString47 = rEString27.makeExclude(rEString45);
        st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString54 = rEString51.makeExclude(rEString53);
        st1920.automaton.REString rEString55 = rEString49.makeAnyChar(rEString54);
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = rEString57.makeExclude(rEString59);
        st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString67 = rEString64.makeExclude(rEString66);
        st1920.automaton.REString rEString68 = rEString62.makeAnyChar(rEString67);
        st1920.automaton.REString rEString69 = rEString59.makeExclude(rEString62);
        st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = rEString59.makeAlpha(rEString71);
        st1920.automaton.REString rEString73 = rEString54.makeAny(rEString72);
        st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString77 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString78 = rEString75.makeExclude(rEString77);
        st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString82 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString84 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString85 = rEString82.makeExclude(rEString84);
        st1920.automaton.REString rEString86 = rEString80.makeAnyChar(rEString85);
        st1920.automaton.REString rEString87 = rEString77.makeExclude(rEString80);
        st1920.automaton.REString rEString88 = rEString47.makeAnd(rEString54, rEString80);
        st1920.automaton.REString rEString89 = rEString22.makeExclude(rEString88);
        rEString88.string = "";
        st1920.automaton.REString rEString92 = rEString2.makeGroup(rEString88);
        java.lang.Class<?> wildcardClass93 = rEString88.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString7 = rEString4.makeExclude(rEString6);
        st1920.automaton.REString rEString8 = rEString2.makeAnyChar(rEString7);
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = rEString14.makeExclude(rEString16);
        st1920.automaton.REString rEString18 = rEString12.makeAnyChar(rEString17);
        st1920.automaton.REString rEString19 = rEString10.makeAnyChar(rEString18);
        st1920.automaton.REString rEString20 = rEString2.makeClass(rEString19);
        boolean boolean21 = st1920.automaton.REGEXWrapper.matches("*", rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        boolean boolean15 = st1920.automaton.REGEXWrapper.matches("+", rEString7);
        java.lang.Class<?> wildcardClass16 = rEString7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = rEString6.makeExclude(rEString8);
        st1920.automaton.REString rEString10 = rEString4.makeAnyChar(rEString9);
        st1920.automaton.REString rEString11 = rEString2.makeAnyChar(rEString10);
        boolean boolean12 = st1920.automaton.REGEXWrapper.matches("~.+", rEString2);
        java.lang.String str13 = rEString2.string;
        st1920.automaton.REString rEString14 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString15 = rEString2.makeOneOrMore(rEString14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = rEString16.makeExclude(rEString18);
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = rEString23.makeExclude(rEString25);
        st1920.automaton.REString rEString27 = rEString21.makeAnyChar(rEString26);
        st1920.automaton.REString rEString28 = rEString18.makeExclude(rEString21);
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = rEString32.makeExclude(rEString34);
        st1920.automaton.REString rEString36 = rEString30.makeAnyChar(rEString35);
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = rEString38.makeExclude(rEString40);
        st1920.automaton.REString rEString42 = rEString35.makeAnyChar(rEString41);
        st1920.automaton.REString rEString43 = rEString28.makeZeroOrOne(rEString41);
        rEString43.string = "";
        st1920.automaton.REString rEString46 = rEString4.makeOneOrMore(rEString43);
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = rEString48.makeExclude(rEString50);
        st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString58 = rEString55.makeExclude(rEString57);
        st1920.automaton.REString rEString59 = rEString53.makeAnyChar(rEString58);
        st1920.automaton.REString rEString60 = rEString50.makeExclude(rEString53);
        st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString67 = rEString64.makeExclude(rEString66);
        st1920.automaton.REString rEString68 = rEString62.makeAnyChar(rEString67);
        st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString73 = rEString70.makeExclude(rEString72);
        st1920.automaton.REString rEString74 = rEString67.makeAnyChar(rEString73);
        st1920.automaton.REString rEString75 = rEString60.makeZeroOrOne(rEString73);
        st1920.automaton.REString rEString76 = rEString43.makeOneOrMore(rEString75);
        boolean boolean77 = st1920.automaton.REGEXWrapper.matches("+", rEString43);
        java.lang.Class<?> wildcardClass78 = rEString43.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        boolean boolean15 = st1920.automaton.REGEXWrapper.matches("+", rEString7);
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = rEString17.makeExclude(rEString19);
        st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString29 = rEString26.makeExclude(rEString28);
        st1920.automaton.REString rEString30 = rEString24.makeAnyChar(rEString29);
        st1920.automaton.REString rEString31 = rEString22.makeAnyChar(rEString30);
        java.lang.String str32 = rEString30.string;
        st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = rEString34.makeExclude(rEString36);
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = rEString41.makeExclude(rEString43);
        st1920.automaton.REString rEString45 = rEString39.makeAnyChar(rEString44);
        st1920.automaton.REString rEString46 = rEString36.makeExclude(rEString39);
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString53 = rEString50.makeExclude(rEString52);
        st1920.automaton.REString rEString54 = rEString48.makeAnyChar(rEString53);
        st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString59 = rEString56.makeExclude(rEString58);
        st1920.automaton.REString rEString60 = rEString53.makeAnyChar(rEString59);
        st1920.automaton.REString rEString61 = rEString46.makeZeroOrOne(rEString59);
        st1920.automaton.REString rEString62 = rEString30.makeGroup(rEString59);
        st1920.automaton.REString rEString63 = rEString19.makeExclude(rEString62);
        st1920.automaton.REString rEString66 = rEString7.makeRange(rEString62, 10, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "~." + "'", str32.equals("~."));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString22 = rEString16.makeAnyChar(rEString21);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString21.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString14.makeZeroOrOne(rEString27);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = rEString31.makeExclude(rEString33);
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = rEString38.makeExclude(rEString40);
        st1920.automaton.REString rEString42 = rEString36.makeAnyChar(rEString41);
        st1920.automaton.REString rEString43 = rEString33.makeExclude(rEString36);
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = rEString33.makeAlpha(rEString45);
        st1920.automaton.REString rEString47 = rEString14.makeClass(rEString33);
        st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = rEString49.makeExclude(rEString51);
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString59 = rEString56.makeExclude(rEString58);
        st1920.automaton.REString rEString60 = rEString54.makeAnyChar(rEString59);
        st1920.automaton.REString rEString61 = rEString51.makeExclude(rEString54);
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString68 = rEString65.makeExclude(rEString67);
        st1920.automaton.REString rEString69 = rEString63.makeAnyChar(rEString68);
        st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString74 = rEString71.makeExclude(rEString73);
        st1920.automaton.REString rEString75 = rEString68.makeAnyChar(rEString74);
        st1920.automaton.REString rEString76 = rEString51.makeOneOrMore(rEString74);
        st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString81 = rEString78.makeExclude(rEString80);
        rEString78.string = "hi!";
        st1920.automaton.REString rEString84 = rEString33.makeAnd(rEString51, rEString78);
        boolean boolean85 = st1920.automaton.REGEXWrapper.matches("~", rEString78);
        java.lang.Class<?> wildcardClass86 = rEString78.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        java.lang.String str6 = rEString4.string;
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = rEString8.makeExclude(rEString10);
        st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = rEString15.makeExclude(rEString17);
        st1920.automaton.REString rEString19 = rEString13.makeAnyChar(rEString18);
        st1920.automaton.REString rEString20 = rEString10.makeExclude(rEString13);
        st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = rEString10.makeAlpha(rEString22);
        st1920.automaton.REString rEString24 = rEString4.makeExclude(rEString22);
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString29 = rEString26.makeExclude(rEString28);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString36 = rEString33.makeExclude(rEString35);
        st1920.automaton.REString rEString37 = rEString31.makeAnyChar(rEString36);
        st1920.automaton.REString rEString38 = rEString28.makeExclude(rEString31);
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString45 = rEString42.makeExclude(rEString44);
        st1920.automaton.REString rEString46 = rEString40.makeAnyChar(rEString45);
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = rEString48.makeExclude(rEString50);
        st1920.automaton.REString rEString52 = rEString45.makeAnyChar(rEString51);
        st1920.automaton.REString rEString53 = rEString38.makeZeroOrOne(rEString51);
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString58 = rEString55.makeExclude(rEString57);
        st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = rEString62.makeExclude(rEString64);
        st1920.automaton.REString rEString66 = rEString60.makeAnyChar(rEString65);
        st1920.automaton.REString rEString67 = rEString57.makeExclude(rEString60);
        st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString70 = rEString57.makeAlpha(rEString69);
        st1920.automaton.REString rEString71 = rEString38.makeClass(rEString57);
        st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString76 = rEString73.makeExclude(rEString75);
        java.lang.String str77 = rEString75.string;
        st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString82 = rEString79.makeExclude(rEString81);
        st1920.automaton.REString rEString84 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString86 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString88 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString89 = rEString86.makeExclude(rEString88);
        st1920.automaton.REString rEString90 = rEString84.makeAnyChar(rEString89);
        st1920.automaton.REString rEString91 = rEString81.makeExclude(rEString84);
        st1920.automaton.REString rEString93 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString94 = rEString81.makeAlpha(rEString93);
        st1920.automaton.REString rEString95 = rEString75.makeExclude(rEString93);
        st1920.automaton.REString rEString96 = rEString38.makeGroup(rEString75);
        st1920.automaton.REString rEString97 = rEString24.makeGroup(rEString75);
        boolean boolean98 = st1920.automaton.REGEXWrapper.matches("a@", rEString75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "" + "'", str77.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString22 = rEString16.makeAnyChar(rEString21);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString21.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString14.makeZeroOrOne(rEString27);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = rEString31.makeExclude(rEString33);
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = rEString38.makeExclude(rEString40);
        st1920.automaton.REString rEString42 = rEString36.makeAnyChar(rEString41);
        st1920.automaton.REString rEString43 = rEString33.makeExclude(rEString36);
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = rEString45.makeExclude(rEString47);
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = rEString52.makeExclude(rEString54);
        st1920.automaton.REString rEString56 = rEString50.makeAnyChar(rEString55);
        st1920.automaton.REString rEString57 = rEString47.makeExclude(rEString50);
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = rEString47.makeAlpha(rEString59);
        st1920.automaton.REString rEString61 = rEString43.makeAlpha(rEString59);
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = rEString63.makeExclude(rEString65);
        st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString73 = rEString70.makeExclude(rEString72);
        st1920.automaton.REString rEString74 = rEString68.makeAnyChar(rEString73);
        st1920.automaton.REString rEString75 = rEString65.makeExclude(rEString68);
        st1920.automaton.REString rEString77 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString82 = rEString79.makeExclude(rEString81);
        st1920.automaton.REString rEString83 = rEString77.makeAnyChar(rEString82);
        st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString87 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString88 = rEString85.makeExclude(rEString87);
        st1920.automaton.REString rEString89 = rEString82.makeAnyChar(rEString88);
        st1920.automaton.REString rEString90 = rEString75.makeZeroOrOne(rEString88);
        st1920.automaton.REString rEString91 = rEString43.makeExclude(rEString90);
        st1920.automaton.REString rEString94 = rEString29.makeRange(rEString91, (int) (byte) 10, (-1));
        boolean boolean95 = st1920.automaton.REGEXWrapper.matches("~.", rEString29);
        java.lang.String str96 = rEString29.string;
        java.lang.String str97 = rEString29.string;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str96 + "' != '" + "~?" + "'", str96.equals("~?"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str97 + "' != '" + "~?" + "'", str97.equals("~?"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        java.lang.String str6 = rEString4.string;
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = rEString8.makeExclude(rEString10);
        st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = rEString15.makeExclude(rEString17);
        st1920.automaton.REString rEString19 = rEString13.makeAnyChar(rEString18);
        st1920.automaton.REString rEString20 = rEString10.makeExclude(rEString13);
        st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = rEString10.makeAlpha(rEString22);
        st1920.automaton.REString rEString24 = rEString4.makeExclude(rEString22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = st1920.automaton.REGEXWrapper.matches("~", rEString24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString24);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = rEString1.makeExclude(rEString3);
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = rEString8.makeExclude(rEString10);
        st1920.automaton.REString rEString12 = rEString6.makeAnyChar(rEString11);
        st1920.automaton.REString rEString13 = rEString3.makeExclude(rEString6);
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString16 = rEString3.makeAlpha(rEString15);
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = rEString23.makeExclude(rEString25);
        st1920.automaton.REString rEString27 = rEString21.makeAnyChar(rEString26);
        st1920.automaton.REString rEString28 = rEString19.makeAnyChar(rEString27);
        boolean boolean29 = st1920.automaton.REGEXWrapper.matches("~.+", rEString19);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = rEString31.makeExclude(rEString33);
        java.lang.String str35 = rEString33.string;
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = rEString37.makeExclude(rEString39);
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = rEString44.makeExclude(rEString46);
        st1920.automaton.REString rEString48 = rEString42.makeAnyChar(rEString47);
        st1920.automaton.REString rEString49 = rEString39.makeExclude(rEString42);
        st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = rEString39.makeAlpha(rEString51);
        st1920.automaton.REString rEString53 = rEString33.makeExclude(rEString51);
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString58 = rEString55.makeExclude(rEString57);
        st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = rEString62.makeExclude(rEString64);
        st1920.automaton.REString rEString66 = rEString60.makeAnyChar(rEString65);
        st1920.automaton.REString rEString67 = rEString57.makeExclude(rEString60);
        st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = rEString69.makeExclude(rEString71);
        st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString79 = rEString76.makeExclude(rEString78);
        st1920.automaton.REString rEString80 = rEString74.makeAnyChar(rEString79);
        st1920.automaton.REString rEString81 = rEString71.makeExclude(rEString74);
        st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString84 = rEString71.makeAlpha(rEString83);
        st1920.automaton.REString rEString85 = rEString67.makeAlpha(rEString83);
        st1920.automaton.REString rEString86 = rEString53.makeNothing(rEString67);
        st1920.automaton.REString rEString87 = rEString19.makeClass(rEString86);
        st1920.automaton.REString rEString89 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString91 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString92 = rEString89.makeExclude(rEString91);
        st1920.automaton.REString rEString93 = rEString19.makeZeroOrOne(rEString91);
        st1920.automaton.REString rEString94 = rEString15.makeExclude(rEString93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString94);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString22 = rEString16.makeAnyChar(rEString21);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString21.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString4.makeOneOrMore(rEString27);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = rEString31.makeExclude(rEString33);
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString39 = rEString36.makeExclude(rEString38);
        st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = rEString41.makeExclude(rEString43);
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = rEString48.makeExclude(rEString50);
        st1920.automaton.REString rEString52 = rEString46.makeAnyChar(rEString51);
        st1920.automaton.REString rEString53 = rEString43.makeExclude(rEString46);
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = rEString57.makeExclude(rEString59);
        st1920.automaton.REString rEString61 = rEString55.makeAnyChar(rEString60);
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = rEString63.makeExclude(rEString65);
        st1920.automaton.REString rEString67 = rEString60.makeAnyChar(rEString66);
        st1920.automaton.REString rEString68 = rEString53.makeZeroOrOne(rEString66);
        st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString73 = rEString70.makeExclude(rEString72);
        st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString77 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString80 = rEString77.makeExclude(rEString79);
        st1920.automaton.REString rEString81 = rEString75.makeAnyChar(rEString80);
        st1920.automaton.REString rEString82 = rEString72.makeExclude(rEString75);
        st1920.automaton.REString rEString84 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString85 = rEString72.makeAlpha(rEString84);
        st1920.automaton.REString rEString86 = rEString53.makeClass(rEString72);
        st1920.automaton.REString rEString89 = rEString38.makeRep(rEString53, (int) 'a', (int) (short) 1);
        st1920.automaton.REString rEString90 = rEString34.makeZeroOrMore(rEString38);
        st1920.automaton.REString rEString92 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString94 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString95 = rEString92.makeExclude(rEString94);
        st1920.automaton.REString rEString96 = rEString90.makeNum(rEString94);
        java.lang.String str97 = rEString90.string;
        st1920.automaton.REString rEString98 = rEString27.makeNum(rEString90);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean99 = st1920.automaton.REGEXWrapper.matches("[]", rEString27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str97 + "' != '" + "*" + "'", str97.equals("*"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString98);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        st1920.automaton.REString rEString1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = st1920.automaton.REGEXWrapper.matches("+", rEString1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString7 = rEString4.makeExclude(rEString6);
        st1920.automaton.REString rEString8 = rEString2.makeAnyChar(rEString7);
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString13 = rEString10.makeExclude(rEString12);
        st1920.automaton.REString rEString16 = rEString2.makeRange(rEString12, 10, 0);
        boolean boolean17 = st1920.automaton.REGEXWrapper.matches("~.", rEString12);
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString22 = rEString19.makeExclude(rEString21);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString29 = rEString26.makeExclude(rEString28);
        st1920.automaton.REString rEString30 = rEString24.makeAnyChar(rEString29);
        st1920.automaton.REString rEString31 = rEString21.makeExclude(rEString24);
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = rEString35.makeExclude(rEString37);
        st1920.automaton.REString rEString39 = rEString33.makeAnyChar(rEString38);
        st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = rEString41.makeExclude(rEString43);
        st1920.automaton.REString rEString45 = rEString38.makeAnyChar(rEString44);
        st1920.automaton.REString rEString46 = rEString31.makeZeroOrOne(rEString44);
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = rEString48.makeExclude(rEString50);
        st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString58 = rEString55.makeExclude(rEString57);
        st1920.automaton.REString rEString59 = rEString53.makeAnyChar(rEString58);
        st1920.automaton.REString rEString60 = rEString50.makeExclude(rEString53);
        st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString63 = rEString50.makeAlpha(rEString62);
        st1920.automaton.REString rEString64 = rEString31.makeClass(rEString50);
        st1920.automaton.REString rEString67 = rEString12.makeRange(rEString31, (int) '4', (-1));
        rEString31.string = "[^~?]";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = rEString3.makeExclude(rEString5);
        st1920.automaton.REString rEString7 = rEString1.makeAnyChar(rEString6);
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString6.makeAnyChar(rEString12);
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = rEString17.makeExclude(rEString19);
        st1920.automaton.REString rEString21 = rEString15.makeAnyChar(rEString20);
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = rEString23.makeExclude(rEString25);
        st1920.automaton.REString rEString27 = rEString20.makeAnyChar(rEString26);
        st1920.automaton.REString rEString28 = rEString13.makeAny(rEString26);
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = rEString30.makeExclude(rEString32);
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = rEString37.makeExclude(rEString39);
        st1920.automaton.REString rEString41 = rEString35.makeAnyChar(rEString40);
        st1920.automaton.REString rEString42 = rEString32.makeExclude(rEString35);
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString49 = rEString46.makeExclude(rEString48);
        st1920.automaton.REString rEString50 = rEString44.makeAnyChar(rEString49);
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = rEString52.makeExclude(rEString54);
        st1920.automaton.REString rEString56 = rEString49.makeAnyChar(rEString55);
        st1920.automaton.REString rEString57 = rEString42.makeZeroOrOne(rEString55);
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = rEString61.makeExclude(rEString63);
        st1920.automaton.REString rEString65 = rEString59.makeAnyChar(rEString64);
        st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString70 = rEString67.makeExclude(rEString69);
        st1920.automaton.REString rEString71 = rEString64.makeAnyChar(rEString70);
        st1920.automaton.REString rEString72 = rEString42.makeOneOrMore(rEString71);
        st1920.automaton.REString rEString73 = rEString13.makeExcludeClass(rEString42);
        st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString82 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString83 = rEString80.makeExclude(rEString82);
        st1920.automaton.REString rEString84 = rEString78.makeAnyChar(rEString83);
        st1920.automaton.REString rEString85 = rEString76.makeAnyChar(rEString84);
        boolean boolean86 = st1920.automaton.REGEXWrapper.matches("~.+", rEString76);
        java.lang.String str87 = rEString76.string;
        st1920.automaton.REString rEString89 = new st1920.automaton.REString("a@");
        st1920.automaton.REString rEString90 = rEString73.makeOr(rEString76, rEString89);
        java.lang.Class<?> wildcardClass91 = rEString90.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str87 + "' != '" + "" + "'", str87.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = rEString4.makeAlpha(rEString16);
        rEString17.string = "";
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = rEString23.makeExclude(rEString25);
        st1920.automaton.REString rEString27 = rEString21.makeAnyChar(rEString26);
        st1920.automaton.REString rEString28 = rEString17.makeZeroOrMore(rEString27);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = rEString31.makeExclude(rEString33);
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = rEString38.makeExclude(rEString40);
        st1920.automaton.REString rEString42 = rEString36.makeAnyChar(rEString41);
        st1920.automaton.REString rEString43 = rEString33.makeExclude(rEString36);
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = rEString45.makeExclude(rEString47);
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = rEString52.makeExclude(rEString54);
        st1920.automaton.REString rEString56 = rEString50.makeAnyChar(rEString55);
        st1920.automaton.REString rEString57 = rEString47.makeExclude(rEString50);
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = rEString47.makeAlpha(rEString59);
        st1920.automaton.REString rEString61 = rEString43.makeAlpha(rEString59);
        boolean boolean62 = st1920.automaton.REGEXWrapper.matches("~.+", rEString59);
        st1920.automaton.REString rEString63 = rEString17.makeAlpha(rEString59);
        st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString68 = rEString65.makeExclude(rEString67);
        st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString75 = rEString72.makeExclude(rEString74);
        st1920.automaton.REString rEString76 = rEString70.makeAnyChar(rEString75);
        st1920.automaton.REString rEString77 = rEString67.makeExclude(rEString70);
        st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString82 = rEString79.makeExclude(rEString81);
        st1920.automaton.REString rEString84 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString86 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString88 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString89 = rEString86.makeExclude(rEString88);
        st1920.automaton.REString rEString90 = rEString84.makeAnyChar(rEString89);
        st1920.automaton.REString rEString91 = rEString81.makeExclude(rEString84);
        st1920.automaton.REString rEString93 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString94 = rEString81.makeAlpha(rEString93);
        st1920.automaton.REString rEString95 = rEString77.makeAlpha(rEString93);
        st1920.automaton.REString rEString96 = rEString17.makeClass(rEString93);
        boolean boolean97 = st1920.automaton.REGEXWrapper.matches("~~&", rEString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        st1920.automaton.REString rEString1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = st1920.automaton.REGEXWrapper.matches("~~.", rEString1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = rEString3.makeExclude(rEString5);
        st1920.automaton.REString rEString7 = rEString1.makeAnyChar(rEString6);
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = rEString16.makeExclude(rEString18);
        st1920.automaton.REString rEString20 = rEString14.makeAnyChar(rEString19);
        st1920.automaton.REString rEString21 = rEString11.makeExclude(rEString14);
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString24 = rEString11.makeAlpha(rEString23);
        st1920.automaton.REString rEString25 = rEString6.makeAny(rEString24);
        st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = rEString30.makeExclude(rEString32);
        st1920.automaton.REString rEString34 = rEString28.makeAnyChar(rEString33);
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString39 = rEString36.makeExclude(rEString38);
        st1920.automaton.REString rEString42 = rEString28.makeRange(rEString38, 10, 0);
        boolean boolean43 = st1920.automaton.REGEXWrapper.matches("~.", rEString38);
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = rEString45.makeExclude(rEString47);
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = rEString52.makeExclude(rEString54);
        st1920.automaton.REString rEString56 = rEString50.makeAnyChar(rEString55);
        st1920.automaton.REString rEString57 = rEString47.makeExclude(rEString50);
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = rEString61.makeExclude(rEString63);
        st1920.automaton.REString rEString65 = rEString59.makeAnyChar(rEString64);
        st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString70 = rEString67.makeExclude(rEString69);
        st1920.automaton.REString rEString71 = rEString64.makeAnyChar(rEString70);
        st1920.automaton.REString rEString72 = rEString57.makeZeroOrOne(rEString70);
        st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString77 = rEString74.makeExclude(rEString76);
        st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString84 = rEString81.makeExclude(rEString83);
        st1920.automaton.REString rEString85 = rEString79.makeAnyChar(rEString84);
        st1920.automaton.REString rEString86 = rEString76.makeExclude(rEString79);
        st1920.automaton.REString rEString88 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString89 = rEString76.makeAlpha(rEString88);
        st1920.automaton.REString rEString90 = rEString57.makeClass(rEString76);
        st1920.automaton.REString rEString93 = rEString38.makeRange(rEString57, (int) '4', (-1));
        st1920.automaton.REString rEString96 = rEString6.makeRange(rEString93, (int) (short) -1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString96);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString7 = rEString4.makeExclude(rEString6);
        st1920.automaton.REString rEString8 = rEString2.makeAnyChar(rEString7);
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString15 = rEString12.makeExclude(rEString14);
        st1920.automaton.REString rEString16 = rEString10.makeAnyChar(rEString15);
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString22 = rEString15.makeAnyChar(rEString21);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString29 = rEString26.makeExclude(rEString28);
        st1920.automaton.REString rEString30 = rEString24.makeAnyChar(rEString29);
        st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = rEString32.makeExclude(rEString34);
        st1920.automaton.REString rEString36 = rEString29.makeAnyChar(rEString35);
        st1920.automaton.REString rEString37 = rEString22.makeAny(rEString35);
        st1920.automaton.REString rEString40 = rEString8.makeRep(rEString22, 0, (-1));
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString45 = rEString42.makeExclude(rEString44);
        st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = rEString49.makeExclude(rEString51);
        st1920.automaton.REString rEString53 = rEString47.makeAnyChar(rEString52);
        st1920.automaton.REString rEString54 = rEString44.makeExclude(rEString47);
        st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString61 = rEString58.makeExclude(rEString60);
        st1920.automaton.REString rEString62 = rEString56.makeAnyChar(rEString61);
        st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString67 = rEString64.makeExclude(rEString66);
        st1920.automaton.REString rEString68 = rEString61.makeAnyChar(rEString67);
        st1920.automaton.REString rEString69 = rEString54.makeZeroOrOne(rEString67);
        st1920.automaton.REString rEString72 = rEString40.makeRange(rEString69, (int) '#', (int) '#');
        boolean boolean73 = st1920.automaton.REGEXWrapper.matches("~&#", rEString69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString22 = rEString16.makeAnyChar(rEString21);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString21.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString14.makeZeroOrOne(rEString27);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = rEString31.makeExclude(rEString33);
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = rEString38.makeExclude(rEString40);
        st1920.automaton.REString rEString42 = rEString36.makeAnyChar(rEString41);
        st1920.automaton.REString rEString43 = rEString33.makeExclude(rEString36);
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = rEString33.makeAlpha(rEString45);
        st1920.automaton.REString rEString47 = rEString14.makeClass(rEString33);
        st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString56 = rEString53.makeExclude(rEString55);
        st1920.automaton.REString rEString57 = rEString51.makeAnyChar(rEString56);
        st1920.automaton.REString rEString58 = rEString49.makeAnyChar(rEString57);
        st1920.automaton.REString rEString61 = rEString33.makeRep(rEString49, (int) ' ', (int) (short) 10);
        boolean boolean62 = st1920.automaton.REGEXWrapper.matches("~?", rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = rEString3.makeExclude(rEString5);
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString13 = rEString10.makeExclude(rEString12);
        st1920.automaton.REString rEString14 = rEString8.makeAnyChar(rEString13);
        st1920.automaton.REString rEString15 = rEString5.makeExclude(rEString8);
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = rEString17.makeExclude(rEString19);
        st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString22.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString19.makeExclude(rEString22);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString32 = rEString19.makeAlpha(rEString31);
        st1920.automaton.REString rEString33 = rEString15.makeAlpha(rEString31);
        boolean boolean34 = st1920.automaton.REGEXWrapper.matches("~.+", rEString31);
        boolean boolean35 = st1920.automaton.REGEXWrapper.matches("hi!", rEString31);
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = rEString37.makeExclude(rEString39);
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = rEString44.makeExclude(rEString46);
        st1920.automaton.REString rEString48 = rEString42.makeAnyChar(rEString47);
        st1920.automaton.REString rEString49 = rEString39.makeExclude(rEString42);
        st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = rEString39.makeAlpha(rEString51);
        rEString52.string = "";
        st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString61 = rEString58.makeExclude(rEString60);
        st1920.automaton.REString rEString62 = rEString56.makeAnyChar(rEString61);
        st1920.automaton.REString rEString63 = rEString52.makeZeroOrMore(rEString62);
        st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString69 = rEString66.makeExclude(rEString68);
        st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString76 = rEString73.makeExclude(rEString75);
        st1920.automaton.REString rEString77 = rEString71.makeAnyChar(rEString76);
        st1920.automaton.REString rEString78 = rEString68.makeExclude(rEString71);
        st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString82 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString83 = rEString80.makeExclude(rEString82);
        st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString87 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString89 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString90 = rEString87.makeExclude(rEString89);
        st1920.automaton.REString rEString91 = rEString85.makeAnyChar(rEString90);
        st1920.automaton.REString rEString92 = rEString82.makeExclude(rEString85);
        st1920.automaton.REString rEString94 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString95 = rEString82.makeAlpha(rEString94);
        st1920.automaton.REString rEString96 = rEString78.makeAlpha(rEString94);
        boolean boolean97 = st1920.automaton.REGEXWrapper.matches("~.+", rEString94);
        st1920.automaton.REString rEString98 = rEString52.makeAlpha(rEString94);
        st1920.automaton.REString rEString99 = rEString31.makeAny(rEString94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString99);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = rEString1.makeExclude(rEString3);
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = rEString8.makeExclude(rEString10);
        st1920.automaton.REString rEString12 = rEString6.makeAnyChar(rEString11);
        st1920.automaton.REString rEString13 = rEString3.makeExclude(rEString6);
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = rEString17.makeExclude(rEString19);
        st1920.automaton.REString rEString21 = rEString15.makeAnyChar(rEString20);
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = rEString23.makeExclude(rEString25);
        st1920.automaton.REString rEString27 = rEString20.makeAnyChar(rEString26);
        st1920.automaton.REString rEString28 = rEString13.makeZeroOrOne(rEString26);
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = rEString30.makeExclude(rEString32);
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = rEString37.makeExclude(rEString39);
        st1920.automaton.REString rEString41 = rEString35.makeAnyChar(rEString40);
        st1920.automaton.REString rEString42 = rEString32.makeExclude(rEString35);
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString45 = rEString32.makeAlpha(rEString44);
        st1920.automaton.REString rEString46 = rEString13.makeClass(rEString32);
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = rEString52.makeExclude(rEString54);
        st1920.automaton.REString rEString56 = rEString50.makeAnyChar(rEString55);
        st1920.automaton.REString rEString57 = rEString48.makeAnyChar(rEString56);
        st1920.automaton.REString rEString60 = rEString32.makeRep(rEString48, (int) ' ', (int) (short) 10);
        rEString32.string = "+";
        st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = rEString69.makeExclude(rEString71);
        st1920.automaton.REString rEString73 = rEString67.makeAnyChar(rEString72);
        st1920.automaton.REString rEString74 = rEString65.makeAnyChar(rEString73);
        boolean boolean75 = st1920.automaton.REGEXWrapper.matches("~.+", rEString65);
        java.lang.String str76 = rEString65.string;
        st1920.automaton.REString rEString77 = rEString32.makeZeroOrOne(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "" + "'", str76.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString77);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString22 = rEString16.makeAnyChar(rEString21);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString21.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString14.makeZeroOrOne(rEString27);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = rEString31.makeExclude(rEString33);
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = rEString38.makeExclude(rEString40);
        st1920.automaton.REString rEString42 = rEString36.makeAnyChar(rEString41);
        st1920.automaton.REString rEString43 = rEString33.makeExclude(rEString36);
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = rEString45.makeExclude(rEString47);
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = rEString52.makeExclude(rEString54);
        st1920.automaton.REString rEString56 = rEString50.makeAnyChar(rEString55);
        st1920.automaton.REString rEString57 = rEString47.makeExclude(rEString50);
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = rEString47.makeAlpha(rEString59);
        st1920.automaton.REString rEString61 = rEString43.makeAlpha(rEString59);
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = rEString63.makeExclude(rEString65);
        st1920.automaton.REString rEString67 = rEString29.makeOr(rEString43, rEString66);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean68 = st1920.automaton.REGEXWrapper.matches("*", rEString43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = rEString1.makeExclude(rEString3);
        java.lang.String str5 = rEString3.string;
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = rEString7.makeExclude(rEString9);
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = rEString14.makeExclude(rEString16);
        st1920.automaton.REString rEString18 = rEString12.makeAnyChar(rEString17);
        st1920.automaton.REString rEString19 = rEString9.makeExclude(rEString12);
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString22 = rEString9.makeAlpha(rEString21);
        st1920.automaton.REString rEString23 = rEString3.makeExclude(rEString21);
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString32 = rEString29.makeExclude(rEString31);
        st1920.automaton.REString rEString33 = rEString27.makeAnyChar(rEString32);
        st1920.automaton.REString rEString34 = rEString25.makeAnyChar(rEString33);
        java.lang.String str35 = rEString33.string;
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = rEString37.makeExclude(rEString39);
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = rEString44.makeExclude(rEString46);
        st1920.automaton.REString rEString48 = rEString42.makeAnyChar(rEString47);
        st1920.automaton.REString rEString49 = rEString39.makeExclude(rEString42);
        st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString56 = rEString53.makeExclude(rEString55);
        st1920.automaton.REString rEString57 = rEString51.makeAnyChar(rEString56);
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString62 = rEString59.makeExclude(rEString61);
        st1920.automaton.REString rEString63 = rEString56.makeAnyChar(rEString62);
        st1920.automaton.REString rEString64 = rEString49.makeZeroOrOne(rEString62);
        st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString71 = rEString68.makeExclude(rEString70);
        st1920.automaton.REString rEString72 = rEString66.makeAnyChar(rEString71);
        st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString77 = rEString74.makeExclude(rEString76);
        st1920.automaton.REString rEString78 = rEString71.makeAnyChar(rEString77);
        st1920.automaton.REString rEString79 = rEString49.makeOneOrMore(rEString78);
        st1920.automaton.REString rEString80 = rEString33.makeClass(rEString79);
        st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString87 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString89 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString90 = rEString87.makeExclude(rEString89);
        st1920.automaton.REString rEString91 = rEString85.makeAnyChar(rEString90);
        st1920.automaton.REString rEString92 = rEString83.makeAnyChar(rEString91);
        boolean boolean93 = st1920.automaton.REGEXWrapper.matches("~.+", rEString83);
        java.lang.String str94 = rEString83.string;
        st1920.automaton.REString rEString95 = rEString80.makeZeroOrMore(rEString83);
        st1920.automaton.REString rEString98 = rEString3.makeRange(rEString83, (int) (byte) -1, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "~." + "'", str35.equals("~."));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str94 + "' != '" + "" + "'", str94.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString98);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString7 = rEString4.makeExclude(rEString6);
        st1920.automaton.REString rEString8 = rEString2.makeAnyChar(rEString7);
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString13 = rEString10.makeExclude(rEString12);
        st1920.automaton.REString rEString14 = rEString7.makeAnyChar(rEString13);
        boolean boolean15 = st1920.automaton.REGEXWrapper.matches("a@", rEString14);
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString22 = rEString19.makeExclude(rEString21);
        st1920.automaton.REString rEString23 = rEString17.makeAnyChar(rEString22);
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString32 = rEString29.makeExclude(rEString31);
        st1920.automaton.REString rEString33 = rEString27.makeAnyChar(rEString32);
        st1920.automaton.REString rEString34 = rEString25.makeAnyChar(rEString33);
        java.lang.String str35 = rEString33.string;
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = rEString37.makeExclude(rEString39);
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = rEString44.makeExclude(rEString46);
        st1920.automaton.REString rEString48 = rEString42.makeAnyChar(rEString47);
        st1920.automaton.REString rEString49 = rEString39.makeExclude(rEString42);
        st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString56 = rEString53.makeExclude(rEString55);
        st1920.automaton.REString rEString57 = rEString51.makeAnyChar(rEString56);
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString62 = rEString59.makeExclude(rEString61);
        st1920.automaton.REString rEString63 = rEString56.makeAnyChar(rEString62);
        st1920.automaton.REString rEString64 = rEString49.makeZeroOrOne(rEString62);
        st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString71 = rEString68.makeExclude(rEString70);
        st1920.automaton.REString rEString72 = rEString66.makeAnyChar(rEString71);
        st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString77 = rEString74.makeExclude(rEString76);
        st1920.automaton.REString rEString78 = rEString71.makeAnyChar(rEString77);
        st1920.automaton.REString rEString79 = rEString49.makeOneOrMore(rEString78);
        st1920.automaton.REString rEString80 = rEString33.makeClass(rEString79);
        st1920.automaton.REString rEString81 = rEString17.makeOneOrMore(rEString33);
        st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString86 = rEString83.makeExclude(rEString85);
        st1920.automaton.REString rEString88 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString90 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString92 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString93 = rEString90.makeExclude(rEString92);
        st1920.automaton.REString rEString94 = rEString88.makeAnyChar(rEString93);
        st1920.automaton.REString rEString95 = rEString85.makeExclude(rEString88);
        st1920.automaton.REString rEString96 = rEString81.makeExcludeClass(rEString88);
        st1920.automaton.REString rEString97 = rEString14.makeOneOrMore(rEString96);
        java.lang.Class<?> wildcardClass98 = rEString14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "~." + "'", str35.equals("~."));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = rEString3.makeExclude(rEString5);
        st1920.automaton.REString rEString7 = rEString1.makeAnyChar(rEString6);
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString15 = rEString1.makeRange(rEString11, 10, 0);
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString28 = rEString25.makeExclude(rEString27);
        st1920.automaton.REString rEString29 = rEString23.makeAnyChar(rEString28);
        st1920.automaton.REString rEString30 = rEString20.makeExclude(rEString23);
        st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = rEString32.makeExclude(rEString34);
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = rEString39.makeExclude(rEString41);
        st1920.automaton.REString rEString43 = rEString37.makeAnyChar(rEString42);
        st1920.automaton.REString rEString44 = rEString34.makeExclude(rEString37);
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = rEString48.makeExclude(rEString50);
        st1920.automaton.REString rEString52 = rEString46.makeAnyChar(rEString51);
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString57 = rEString54.makeExclude(rEString56);
        st1920.automaton.REString rEString58 = rEString51.makeAnyChar(rEString57);
        st1920.automaton.REString rEString59 = rEString44.makeZeroOrOne(rEString57);
        rEString59.string = "";
        st1920.automaton.REString rEString62 = rEString20.makeOneOrMore(rEString59);
        st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString67 = rEString64.makeExclude(rEString66);
        st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString74 = rEString71.makeExclude(rEString73);
        st1920.automaton.REString rEString75 = rEString69.makeAnyChar(rEString74);
        st1920.automaton.REString rEString76 = rEString66.makeExclude(rEString69);
        st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString82 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString83 = rEString80.makeExclude(rEString82);
        st1920.automaton.REString rEString84 = rEString78.makeAnyChar(rEString83);
        st1920.automaton.REString rEString86 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString88 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString89 = rEString86.makeExclude(rEString88);
        st1920.automaton.REString rEString90 = rEString83.makeAnyChar(rEString89);
        st1920.automaton.REString rEString91 = rEString76.makeZeroOrOne(rEString89);
        st1920.automaton.REString rEString92 = rEString59.makeOneOrMore(rEString91);
        boolean boolean93 = st1920.automaton.REGEXWrapper.matches("+", rEString59);
        st1920.automaton.REString rEString96 = rEString15.makeRange(rEString59, (int) (short) 1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString96);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = rEString16.makeExclude(rEString18);
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = rEString23.makeExclude(rEString25);
        st1920.automaton.REString rEString27 = rEString21.makeAnyChar(rEString26);
        st1920.automaton.REString rEString28 = rEString18.makeExclude(rEString21);
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = rEString18.makeAlpha(rEString30);
        st1920.automaton.REString rEString32 = rEString14.makeAlpha(rEString30);
        st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = rEString34.makeExclude(rEString36);
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = rEString41.makeExclude(rEString43);
        st1920.automaton.REString rEString45 = rEString39.makeAnyChar(rEString44);
        st1920.automaton.REString rEString46 = rEString36.makeExclude(rEString39);
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString49 = rEString36.makeAlpha(rEString48);
        st1920.automaton.REString rEString52 = rEString14.makeRange(rEString36, (int) (byte) 1, (int) (byte) 100);
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString57 = rEString54.makeExclude(rEString56);
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = rEString61.makeExclude(rEString63);
        st1920.automaton.REString rEString65 = rEString59.makeAnyChar(rEString64);
        st1920.automaton.REString rEString66 = rEString56.makeExclude(rEString59);
        st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString73 = rEString70.makeExclude(rEString72);
        st1920.automaton.REString rEString74 = rEString68.makeAnyChar(rEString73);
        st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString79 = rEString76.makeExclude(rEString78);
        st1920.automaton.REString rEString80 = rEString73.makeAnyChar(rEString79);
        st1920.automaton.REString rEString81 = rEString66.makeZeroOrOne(rEString79);
        st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString87 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString88 = rEString85.makeExclude(rEString87);
        st1920.automaton.REString rEString89 = rEString83.makeAnyChar(rEString88);
        st1920.automaton.REString rEString91 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString93 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString94 = rEString91.makeExclude(rEString93);
        st1920.automaton.REString rEString95 = rEString88.makeAnyChar(rEString94);
        st1920.automaton.REString rEString96 = rEString66.makeOneOrMore(rEString95);
        st1920.automaton.REString rEString97 = rEString14.makeAnyChar(rEString96);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean98 = st1920.automaton.REGEXWrapper.matches("~?*", rEString14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString97);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = rEString6.makeExclude(rEString8);
        st1920.automaton.REString rEString10 = rEString4.makeAnyChar(rEString9);
        st1920.automaton.REString rEString11 = rEString2.makeAnyChar(rEString10);
        st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = rEString15.makeExclude(rEString17);
        st1920.automaton.REString rEString19 = rEString13.makeAnyChar(rEString18);
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString24 = rEString21.makeExclude(rEString23);
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = rEString28.makeExclude(rEString30);
        st1920.automaton.REString rEString32 = rEString26.makeAnyChar(rEString31);
        st1920.automaton.REString rEString33 = rEString23.makeExclude(rEString26);
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString36 = rEString23.makeAlpha(rEString35);
        st1920.automaton.REString rEString37 = rEString18.makeAny(rEString36);
        st1920.automaton.REString rEString38 = rEString2.makeClass(rEString36);
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString45 = rEString42.makeExclude(rEString44);
        st1920.automaton.REString rEString46 = rEString40.makeAnyChar(rEString45);
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = rEString48.makeExclude(rEString50);
        st1920.automaton.REString rEString54 = rEString40.makeRange(rEString50, 10, 0);
        st1920.automaton.REString rEString55 = rEString38.makeAny(rEString50);
        boolean boolean56 = st1920.automaton.REGEXWrapper.matches("", rEString38);
        st1920.automaton.REString rEString57 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString58 = rEString38.makeAny(rEString57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = rEString6.makeExclude(rEString8);
        st1920.automaton.REString rEString10 = rEString4.makeAnyChar(rEString9);
        st1920.automaton.REString rEString11 = rEString2.makeAnyChar(rEString10);
        st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = rEString15.makeExclude(rEString17);
        st1920.automaton.REString rEString19 = rEString13.makeAnyChar(rEString18);
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString24 = rEString21.makeExclude(rEString23);
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = rEString28.makeExclude(rEString30);
        st1920.automaton.REString rEString32 = rEString26.makeAnyChar(rEString31);
        st1920.automaton.REString rEString33 = rEString23.makeExclude(rEString26);
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString36 = rEString23.makeAlpha(rEString35);
        st1920.automaton.REString rEString37 = rEString18.makeAny(rEString36);
        st1920.automaton.REString rEString38 = rEString2.makeClass(rEString36);
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString45 = rEString42.makeExclude(rEString44);
        st1920.automaton.REString rEString46 = rEString40.makeAnyChar(rEString45);
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = rEString48.makeExclude(rEString50);
        st1920.automaton.REString rEString54 = rEString40.makeRange(rEString50, 10, 0);
        st1920.automaton.REString rEString55 = rEString38.makeAny(rEString50);
        boolean boolean56 = st1920.automaton.REGEXWrapper.matches("", rEString38);
        java.lang.String str57 = rEString38.string;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "[a]" + "'", str57.equals("[a]"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("~.+");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString7 = rEString4.makeExclude(rEString6);
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString14 = rEString11.makeExclude(rEString13);
        st1920.automaton.REString rEString15 = rEString9.makeAnyChar(rEString14);
        st1920.automaton.REString rEString16 = rEString6.makeExclude(rEString9);
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = rEString20.makeExclude(rEString22);
        st1920.automaton.REString rEString24 = rEString18.makeAnyChar(rEString23);
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString29 = rEString26.makeExclude(rEString28);
        st1920.automaton.REString rEString30 = rEString23.makeAnyChar(rEString29);
        st1920.automaton.REString rEString31 = rEString16.makeZeroOrOne(rEString29);
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = rEString35.makeExclude(rEString37);
        st1920.automaton.REString rEString39 = rEString33.makeAnyChar(rEString38);
        st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = rEString41.makeExclude(rEString43);
        st1920.automaton.REString rEString45 = rEString38.makeAnyChar(rEString44);
        st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = rEString47.makeExclude(rEString49);
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString57 = rEString54.makeExclude(rEString56);
        st1920.automaton.REString rEString58 = rEString52.makeAnyChar(rEString57);
        st1920.automaton.REString rEString59 = rEString49.makeExclude(rEString52);
        st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = rEString63.makeExclude(rEString65);
        st1920.automaton.REString rEString67 = rEString61.makeAnyChar(rEString66);
        st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = rEString69.makeExclude(rEString71);
        st1920.automaton.REString rEString73 = rEString66.makeAnyChar(rEString72);
        st1920.automaton.REString rEString74 = rEString59.makeZeroOrOne(rEString72);
        st1920.automaton.REString rEString75 = rEString44.makeZeroOrMore(rEString74);
        st1920.automaton.REString rEString76 = rEString16.makeZeroOrOne(rEString75);
        st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString82 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString83 = rEString80.makeExclude(rEString82);
        st1920.automaton.REString rEString84 = rEString78.makeAnyChar(rEString83);
        st1920.automaton.REString rEString86 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString88 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString89 = rEString86.makeExclude(rEString88);
        st1920.automaton.REString rEString90 = rEString83.makeAnyChar(rEString89);
        st1920.automaton.REString rEString91 = rEString75.makeExcludeClass(rEString83);
        st1920.automaton.REString rEString92 = rEString2.makeZeroOrOne(rEString83);
        boolean boolean93 = st1920.automaton.REGEXWrapper.matches("~.", rEString92);
        java.lang.String str94 = rEString92.string;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str94 + "' != '" + "~?" + "'", str94.equals("~?"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString22 = rEString16.makeAnyChar(rEString21);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString21.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString14.makeZeroOrOne(rEString27);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = rEString31.makeExclude(rEString33);
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = rEString38.makeExclude(rEString40);
        st1920.automaton.REString rEString42 = rEString36.makeAnyChar(rEString41);
        st1920.automaton.REString rEString43 = rEString33.makeExclude(rEString36);
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = rEString33.makeAlpha(rEString45);
        st1920.automaton.REString rEString47 = rEString14.makeClass(rEString33);
        st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = rEString49.makeExclude(rEString51);
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString59 = rEString56.makeExclude(rEString58);
        st1920.automaton.REString rEString60 = rEString54.makeAnyChar(rEString59);
        st1920.automaton.REString rEString61 = rEString51.makeExclude(rEString54);
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString68 = rEString65.makeExclude(rEString67);
        st1920.automaton.REString rEString69 = rEString63.makeAnyChar(rEString68);
        st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString74 = rEString71.makeExclude(rEString73);
        st1920.automaton.REString rEString75 = rEString68.makeAnyChar(rEString74);
        st1920.automaton.REString rEString76 = rEString51.makeOneOrMore(rEString74);
        st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString81 = rEString78.makeExclude(rEString80);
        rEString78.string = "hi!";
        st1920.automaton.REString rEString84 = rEString33.makeAnd(rEString51, rEString78);
        boolean boolean85 = st1920.automaton.REGEXWrapper.matches("~", rEString78);
        rEString78.string = "a@";
        st1920.automaton.REString rEString88 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString91 = rEString78.makeRange(rEString88, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = rEString3.makeExclude(rEString5);
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString13 = rEString10.makeExclude(rEString12);
        st1920.automaton.REString rEString14 = rEString8.makeAnyChar(rEString13);
        st1920.automaton.REString rEString15 = rEString5.makeExclude(rEString8);
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = rEString17.makeExclude(rEString19);
        st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString22.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString19.makeExclude(rEString22);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString32 = rEString19.makeAlpha(rEString31);
        st1920.automaton.REString rEString33 = rEString15.makeAlpha(rEString31);
        boolean boolean34 = st1920.automaton.REGEXWrapper.matches("~.+", rEString31);
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = rEString40.makeExclude(rEString42);
        st1920.automaton.REString rEString44 = rEString38.makeAnyChar(rEString43);
        st1920.automaton.REString rEString45 = rEString36.makeAnyChar(rEString44);
        java.lang.String str46 = rEString44.string;
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = rEString48.makeExclude(rEString50);
        st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString58 = rEString55.makeExclude(rEString57);
        st1920.automaton.REString rEString59 = rEString53.makeAnyChar(rEString58);
        st1920.automaton.REString rEString60 = rEString50.makeExclude(rEString53);
        st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString67 = rEString64.makeExclude(rEString66);
        st1920.automaton.REString rEString68 = rEString62.makeAnyChar(rEString67);
        st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString73 = rEString70.makeExclude(rEString72);
        st1920.automaton.REString rEString74 = rEString67.makeAnyChar(rEString73);
        st1920.automaton.REString rEString75 = rEString60.makeZeroOrOne(rEString73);
        st1920.automaton.REString rEString77 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString82 = rEString79.makeExclude(rEString81);
        st1920.automaton.REString rEString83 = rEString77.makeAnyChar(rEString82);
        st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString87 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString88 = rEString85.makeExclude(rEString87);
        st1920.automaton.REString rEString89 = rEString82.makeAnyChar(rEString88);
        st1920.automaton.REString rEString90 = rEString60.makeOneOrMore(rEString89);
        st1920.automaton.REString rEString91 = rEString44.makeClass(rEString90);
        st1920.automaton.REString rEString92 = rEString31.makeZeroOrOne(rEString90);
        boolean boolean93 = st1920.automaton.REGEXWrapper.matches("~?*", rEString92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "~." + "'", str46.equals("~."));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        st1920.automaton.REString rEString1 = new st1920.automaton.REString("~..1");
        java.lang.String str2 = rEString1.string;
        st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = rEString15.makeExclude(rEString17);
        st1920.automaton.REString rEString21 = rEString7.makeRange(rEString17, 10, 0);
        st1920.automaton.REString rEString24 = rEString5.makeRep(rEString7, (int) 'a', (int) '4');
        boolean boolean25 = st1920.automaton.REGEXWrapper.matches("*", rEString24);
        st1920.automaton.REString rEString26 = rEString1.makeExclude(rEString24);
        java.lang.Class<?> wildcardClass27 = rEString26.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "~..1" + "'", str2.equals("~..1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("~");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = st1920.automaton.REGEXWrapper.matches("[a]", rEString2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = rEString3.makeExclude(rEString5);
        st1920.automaton.REString rEString7 = rEString1.makeAnyChar(rEString6);
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString15 = rEString1.makeRange(rEString11, 10, 0);
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = rEString17.makeExclude(rEString19);
        st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString22.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString19.makeExclude(rEString22);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString36 = rEString33.makeExclude(rEString35);
        st1920.automaton.REString rEString37 = rEString31.makeAnyChar(rEString36);
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = rEString39.makeExclude(rEString41);
        st1920.automaton.REString rEString43 = rEString36.makeAnyChar(rEString42);
        st1920.automaton.REString rEString44 = rEString29.makeZeroOrOne(rEString42);
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = rEString48.makeExclude(rEString50);
        st1920.automaton.REString rEString52 = rEString46.makeAnyChar(rEString51);
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString57 = rEString54.makeExclude(rEString56);
        st1920.automaton.REString rEString58 = rEString51.makeAnyChar(rEString57);
        st1920.automaton.REString rEString59 = rEString29.makeOneOrMore(rEString58);
        st1920.automaton.REString rEString60 = rEString11.makeNothing(rEString29);
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString70 = rEString67.makeExclude(rEString69);
        st1920.automaton.REString rEString71 = rEString65.makeAnyChar(rEString70);
        st1920.automaton.REString rEString72 = rEString63.makeAnyChar(rEString71);
        boolean boolean73 = st1920.automaton.REGEXWrapper.matches("~.+", rEString63);
        java.lang.String str74 = rEString63.string;
        st1920.automaton.REString rEString75 = rEString60.makeZeroOrMore(rEString63);
        st1920.automaton.REString rEString77 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString84 = rEString81.makeExclude(rEString83);
        st1920.automaton.REString rEString85 = rEString79.makeAnyChar(rEString84);
        st1920.automaton.REString rEString86 = rEString77.makeAnyChar(rEString85);
        st1920.automaton.REString rEString88 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString91 = rEString85.makeRange(rEString88, (int) (short) 100, (int) (byte) 0);
        st1920.automaton.REString rEString92 = rEString60.makeZeroOrOne(rEString88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "" + "'", str74.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString92);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = rEString3.makeExclude(rEString5);
        st1920.automaton.REString rEString7 = rEString1.makeAnyChar(rEString6);
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString6.makeAnyChar(rEString12);
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = rEString15.makeExclude(rEString17);
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = rEString22.makeExclude(rEString24);
        st1920.automaton.REString rEString26 = rEString20.makeAnyChar(rEString25);
        st1920.automaton.REString rEString27 = rEString17.makeExclude(rEString20);
        st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = rEString31.makeExclude(rEString33);
        st1920.automaton.REString rEString35 = rEString29.makeAnyChar(rEString34);
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = rEString37.makeExclude(rEString39);
        st1920.automaton.REString rEString41 = rEString34.makeAnyChar(rEString40);
        st1920.automaton.REString rEString42 = rEString27.makeZeroOrOne(rEString40);
        st1920.automaton.REString rEString43 = rEString12.makeZeroOrMore(rEString42);
        rEString43.string = "~";
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = rEString52.makeExclude(rEString54);
        st1920.automaton.REString rEString56 = rEString50.makeAnyChar(rEString55);
        st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString61 = rEString58.makeExclude(rEString60);
        st1920.automaton.REString rEString64 = rEString50.makeRange(rEString60, 10, 0);
        st1920.automaton.REString rEString67 = rEString48.makeRep(rEString50, (int) 'a', (int) '4');
        boolean boolean68 = st1920.automaton.REGEXWrapper.matches("*", rEString67);
        st1920.automaton.REString rEString69 = rEString43.makeExcludeClass(rEString67);
        rEString67.string = "~|?";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString69);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString7 = rEString4.makeExclude(rEString6);
        st1920.automaton.REString rEString8 = rEString2.makeAnyChar(rEString7);
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString13 = rEString10.makeExclude(rEString12);
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = rEString17.makeExclude(rEString19);
        st1920.automaton.REString rEString21 = rEString15.makeAnyChar(rEString20);
        st1920.automaton.REString rEString22 = rEString12.makeExclude(rEString15);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = rEString12.makeAlpha(rEString24);
        st1920.automaton.REString rEString26 = rEString7.makeAny(rEString25);
        st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = rEString28.makeExclude(rEString30);
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = rEString35.makeExclude(rEString37);
        st1920.automaton.REString rEString39 = rEString33.makeAnyChar(rEString38);
        st1920.automaton.REString rEString40 = rEString30.makeExclude(rEString33);
        st1920.automaton.REString rEString41 = rEString26.makeNum(rEString40);
        st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = rEString43.makeExclude(rEString45);
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString53 = rEString50.makeExclude(rEString52);
        st1920.automaton.REString rEString54 = rEString48.makeAnyChar(rEString53);
        st1920.automaton.REString rEString55 = rEString45.makeExclude(rEString48);
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = rEString57.makeExclude(rEString59);
        st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString67 = rEString64.makeExclude(rEString66);
        st1920.automaton.REString rEString68 = rEString62.makeAnyChar(rEString67);
        st1920.automaton.REString rEString69 = rEString59.makeExclude(rEString62);
        st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = rEString59.makeAlpha(rEString71);
        st1920.automaton.REString rEString73 = rEString55.makeAlpha(rEString71);
        st1920.automaton.REString rEString74 = rEString26.makeExclude(rEString55);
        boolean boolean75 = st1920.automaton.REGEXWrapper.matches("~", rEString26);
        java.lang.Class<?> wildcardClass76 = rEString26.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        st1920.automaton.REString rEString1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = st1920.automaton.REGEXWrapper.matches("", rEString1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = rEString6.makeExclude(rEString8);
        st1920.automaton.REString rEString10 = rEString4.makeAnyChar(rEString9);
        st1920.automaton.REString rEString11 = rEString2.makeAnyChar(rEString10);
        java.lang.String str12 = rEString10.string;
        st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = rEString14.makeExclude(rEString16);
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString24 = rEString21.makeExclude(rEString23);
        st1920.automaton.REString rEString25 = rEString19.makeAnyChar(rEString24);
        st1920.automaton.REString rEString26 = rEString16.makeExclude(rEString19);
        st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = rEString30.makeExclude(rEString32);
        st1920.automaton.REString rEString34 = rEString28.makeAnyChar(rEString33);
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString39 = rEString36.makeExclude(rEString38);
        st1920.automaton.REString rEString40 = rEString33.makeAnyChar(rEString39);
        st1920.automaton.REString rEString41 = rEString26.makeZeroOrOne(rEString39);
        st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = rEString45.makeExclude(rEString47);
        st1920.automaton.REString rEString49 = rEString43.makeAnyChar(rEString48);
        st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString54 = rEString51.makeExclude(rEString53);
        st1920.automaton.REString rEString55 = rEString48.makeAnyChar(rEString54);
        st1920.automaton.REString rEString56 = rEString26.makeOneOrMore(rEString55);
        st1920.automaton.REString rEString57 = rEString10.makeClass(rEString56);
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString62 = rEString59.makeExclude(rEString61);
        st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString69 = rEString66.makeExclude(rEString68);
        st1920.automaton.REString rEString70 = rEString64.makeAnyChar(rEString69);
        st1920.automaton.REString rEString71 = rEString61.makeExclude(rEString64);
        st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString77 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString78 = rEString75.makeExclude(rEString77);
        st1920.automaton.REString rEString79 = rEString73.makeAnyChar(rEString78);
        st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString84 = rEString81.makeExclude(rEString83);
        st1920.automaton.REString rEString85 = rEString78.makeAnyChar(rEString84);
        st1920.automaton.REString rEString86 = rEString71.makeZeroOrOne(rEString84);
        st1920.automaton.REString rEString87 = rEString10.makeNum(rEString86);
        java.lang.String str88 = rEString86.string;
        boolean boolean89 = st1920.automaton.REGEXWrapper.matches("", rEString86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "~." + "'", str12.equals("~."));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str88 + "' != '" + "~?" + "'", str88.equals("~?"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString22 = rEString16.makeAnyChar(rEString21);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString21.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString14.makeZeroOrOne(rEString27);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = rEString31.makeExclude(rEString33);
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = rEString38.makeExclude(rEString40);
        st1920.automaton.REString rEString42 = rEString36.makeAnyChar(rEString41);
        st1920.automaton.REString rEString43 = rEString33.makeExclude(rEString36);
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = rEString45.makeExclude(rEString47);
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = rEString52.makeExclude(rEString54);
        st1920.automaton.REString rEString56 = rEString50.makeAnyChar(rEString55);
        st1920.automaton.REString rEString57 = rEString47.makeExclude(rEString50);
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = rEString47.makeAlpha(rEString59);
        st1920.automaton.REString rEString61 = rEString43.makeAlpha(rEString59);
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = rEString63.makeExclude(rEString65);
        st1920.automaton.REString rEString67 = rEString29.makeOr(rEString43, rEString66);
        st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = rEString69.makeExclude(rEString71);
        st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString79 = rEString76.makeExclude(rEString78);
        st1920.automaton.REString rEString80 = rEString74.makeAnyChar(rEString79);
        st1920.automaton.REString rEString81 = rEString71.makeExclude(rEString74);
        st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString87 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString88 = rEString85.makeExclude(rEString87);
        st1920.automaton.REString rEString89 = rEString83.makeAnyChar(rEString88);
        st1920.automaton.REString rEString91 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString93 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString94 = rEString91.makeExclude(rEString93);
        st1920.automaton.REString rEString95 = rEString88.makeAnyChar(rEString94);
        st1920.automaton.REString rEString96 = rEString81.makeZeroOrOne(rEString94);
        st1920.automaton.REString rEString97 = rEString29.makeAny(rEString96);
        boolean boolean98 = st1920.automaton.REGEXWrapper.matches("[a]", rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = rEString6.makeExclude(rEString8);
        st1920.automaton.REString rEString10 = rEString4.makeAnyChar(rEString9);
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString15 = rEString12.makeExclude(rEString14);
        st1920.automaton.REString rEString18 = rEString4.makeRange(rEString14, 10, 0);
        st1920.automaton.REString rEString21 = rEString2.makeRep(rEString4, (int) 'a', (int) '4');
        boolean boolean22 = st1920.automaton.REGEXWrapper.matches("~.+", rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString14 = rEString11.makeExclude(rEString13);
        st1920.automaton.REString rEString15 = rEString9.makeAnyChar(rEString14);
        st1920.automaton.REString rEString16 = rEString7.makeAnyChar(rEString15);
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = rEString22.makeExclude(rEString24);
        st1920.automaton.REString rEString26 = rEString20.makeAnyChar(rEString25);
        st1920.automaton.REString rEString27 = rEString18.makeAnyChar(rEString26);
        java.lang.String str28 = rEString26.string;
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = rEString30.makeExclude(rEString32);
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = rEString37.makeExclude(rEString39);
        st1920.automaton.REString rEString41 = rEString35.makeAnyChar(rEString40);
        st1920.automaton.REString rEString42 = rEString32.makeExclude(rEString35);
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString49 = rEString46.makeExclude(rEString48);
        st1920.automaton.REString rEString50 = rEString44.makeAnyChar(rEString49);
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = rEString52.makeExclude(rEString54);
        st1920.automaton.REString rEString56 = rEString49.makeAnyChar(rEString55);
        st1920.automaton.REString rEString57 = rEString42.makeZeroOrOne(rEString55);
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = rEString61.makeExclude(rEString63);
        st1920.automaton.REString rEString65 = rEString59.makeAnyChar(rEString64);
        st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString70 = rEString67.makeExclude(rEString69);
        st1920.automaton.REString rEString71 = rEString64.makeAnyChar(rEString70);
        st1920.automaton.REString rEString72 = rEString42.makeOneOrMore(rEString71);
        st1920.automaton.REString rEString73 = rEString26.makeClass(rEString72);
        st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString77 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString82 = rEString79.makeExclude(rEString81);
        st1920.automaton.REString rEString83 = rEString77.makeAnyChar(rEString82);
        st1920.automaton.REString rEString84 = rEString75.makeAnyChar(rEString83);
        st1920.automaton.REString rEString87 = rEString26.makeRange(rEString84, (int) (short) 100, (int) (short) 0);
        st1920.automaton.REString rEString90 = rEString16.makeRange(rEString87, (int) '#', (int) (short) 10);
        st1920.automaton.REString rEString91 = rEString4.makeNothing(rEString90);
        boolean boolean92 = st1920.automaton.REGEXWrapper.matches("~.1", rEString4);
        st1920.automaton.REString rEString93 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString94 = rEString4.makeOneOrMore(rEString93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "~." + "'", str28.equals("~."));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = rEString6.makeExclude(rEString8);
        st1920.automaton.REString rEString10 = rEString4.makeAnyChar(rEString9);
        st1920.automaton.REString rEString11 = rEString2.makeAnyChar(rEString10);
        st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = rEString15.makeExclude(rEString17);
        st1920.automaton.REString rEString19 = rEString13.makeAnyChar(rEString18);
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString24 = rEString21.makeExclude(rEString23);
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = rEString28.makeExclude(rEString30);
        st1920.automaton.REString rEString32 = rEString26.makeAnyChar(rEString31);
        st1920.automaton.REString rEString33 = rEString23.makeExclude(rEString26);
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString36 = rEString23.makeAlpha(rEString35);
        st1920.automaton.REString rEString37 = rEString18.makeAny(rEString36);
        st1920.automaton.REString rEString38 = rEString2.makeClass(rEString36);
        boolean boolean39 = st1920.automaton.REGEXWrapper.matches("~|?", rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString22 = rEString16.makeAnyChar(rEString21);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString21.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString14.makeZeroOrOne(rEString27);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = rEString31.makeExclude(rEString33);
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = rEString38.makeExclude(rEString40);
        st1920.automaton.REString rEString42 = rEString36.makeAnyChar(rEString41);
        st1920.automaton.REString rEString43 = rEString33.makeExclude(rEString36);
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = rEString47.makeExclude(rEString49);
        st1920.automaton.REString rEString51 = rEString45.makeAnyChar(rEString50);
        st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString56 = rEString53.makeExclude(rEString55);
        st1920.automaton.REString rEString57 = rEString50.makeAnyChar(rEString56);
        st1920.automaton.REString rEString58 = rEString43.makeZeroOrOne(rEString56);
        st1920.automaton.REString rEString59 = rEString27.makeExcludeClass(rEString58);
        boolean boolean60 = st1920.automaton.REGEXWrapper.matches("a@", rEString58);
        st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString67 = rEString64.makeExclude(rEString66);
        st1920.automaton.REString rEString68 = rEString62.makeAnyChar(rEString67);
        st1920.automaton.REString rEString69 = rEString58.makeClass(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString69);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = rEString1.makeExclude(rEString3);
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = rEString8.makeExclude(rEString10);
        st1920.automaton.REString rEString12 = rEString6.makeAnyChar(rEString11);
        st1920.automaton.REString rEString13 = rEString3.makeExclude(rEString6);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = rEString16.makeExclude(rEString18);
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = rEString23.makeExclude(rEString25);
        st1920.automaton.REString rEString27 = rEString21.makeAnyChar(rEString26);
        st1920.automaton.REString rEString28 = rEString18.makeExclude(rEString21);
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = rEString30.makeExclude(rEString32);
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = rEString37.makeExclude(rEString39);
        st1920.automaton.REString rEString41 = rEString35.makeAnyChar(rEString40);
        st1920.automaton.REString rEString42 = rEString32.makeExclude(rEString35);
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString45 = rEString32.makeAlpha(rEString44);
        st1920.automaton.REString rEString46 = rEString28.makeAlpha(rEString44);
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = rEString48.makeExclude(rEString50);
        st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString58 = rEString55.makeExclude(rEString57);
        st1920.automaton.REString rEString59 = rEString53.makeAnyChar(rEString58);
        st1920.automaton.REString rEString60 = rEString50.makeExclude(rEString53);
        st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString63 = rEString50.makeAlpha(rEString62);
        st1920.automaton.REString rEString66 = rEString28.makeRange(rEString50, (int) (byte) 1, (int) (byte) 100);
        boolean boolean67 = st1920.automaton.REGEXWrapper.matches("~.", rEString66);
        st1920.automaton.REString rEString70 = rEString13.makeRange(rEString66, 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString70);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        st1920.automaton.REString rEString1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = st1920.automaton.REGEXWrapper.matches("(~)", rEString1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = rEString6.makeExclude(rEString8);
        st1920.automaton.REString rEString10 = rEString4.makeAnyChar(rEString9);
        st1920.automaton.REString rEString11 = rEString2.makeAnyChar(rEString10);
        st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString16 = rEString13.makeExclude(rEString15);
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = rEString20.makeExclude(rEString22);
        st1920.automaton.REString rEString24 = rEString18.makeAnyChar(rEString23);
        st1920.automaton.REString rEString25 = rEString15.makeExclude(rEString18);
        st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString32 = rEString29.makeExclude(rEString31);
        st1920.automaton.REString rEString33 = rEString27.makeAnyChar(rEString32);
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = rEString35.makeExclude(rEString37);
        st1920.automaton.REString rEString39 = rEString32.makeAnyChar(rEString38);
        st1920.automaton.REString rEString40 = rEString25.makeZeroOrOne(rEString38);
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString45 = rEString42.makeExclude(rEString44);
        st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = rEString49.makeExclude(rEString51);
        st1920.automaton.REString rEString53 = rEString47.makeAnyChar(rEString52);
        st1920.automaton.REString rEString54 = rEString44.makeExclude(rEString47);
        st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString59 = rEString56.makeExclude(rEString58);
        st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = rEString63.makeExclude(rEString65);
        st1920.automaton.REString rEString67 = rEString61.makeAnyChar(rEString66);
        st1920.automaton.REString rEString68 = rEString58.makeExclude(rEString61);
        st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString75 = rEString72.makeExclude(rEString74);
        st1920.automaton.REString rEString76 = rEString70.makeAnyChar(rEString75);
        st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString81 = rEString78.makeExclude(rEString80);
        st1920.automaton.REString rEString82 = rEString75.makeAnyChar(rEString81);
        st1920.automaton.REString rEString83 = rEString58.makeOneOrMore(rEString81);
        st1920.automaton.REString rEString84 = rEString38.makeOr(rEString54, rEString58);
        st1920.automaton.REString rEString85 = rEString10.makeZeroOrOne(rEString84);
        boolean boolean86 = st1920.automaton.REGEXWrapper.matches("~?", rEString84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString7 = rEString4.makeExclude(rEString6);
        st1920.automaton.REString rEString8 = rEString2.makeAnyChar(rEString7);
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString13 = rEString10.makeExclude(rEString12);
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = rEString17.makeExclude(rEString19);
        st1920.automaton.REString rEString21 = rEString15.makeAnyChar(rEString20);
        st1920.automaton.REString rEString22 = rEString12.makeExclude(rEString15);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString29 = rEString26.makeExclude(rEString28);
        st1920.automaton.REString rEString30 = rEString24.makeAnyChar(rEString29);
        st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = rEString32.makeExclude(rEString34);
        st1920.automaton.REString rEString36 = rEString29.makeAnyChar(rEString35);
        st1920.automaton.REString rEString37 = rEString22.makeZeroOrOne(rEString35);
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = rEString39.makeExclude(rEString41);
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString49 = rEString46.makeExclude(rEString48);
        st1920.automaton.REString rEString50 = rEString44.makeAnyChar(rEString49);
        st1920.automaton.REString rEString51 = rEString41.makeExclude(rEString44);
        st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString58 = rEString55.makeExclude(rEString57);
        st1920.automaton.REString rEString59 = rEString53.makeAnyChar(rEString58);
        st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = rEString61.makeExclude(rEString63);
        st1920.automaton.REString rEString65 = rEString58.makeAnyChar(rEString64);
        st1920.automaton.REString rEString66 = rEString51.makeZeroOrOne(rEString64);
        st1920.automaton.REString rEString67 = rEString35.makeExcludeClass(rEString66);
        st1920.automaton.REString rEString68 = rEString8.makeOneOrMore(rEString67);
        java.lang.String str69 = rEString67.string;
        boolean boolean70 = st1920.automaton.REGEXWrapper.matches("a", rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "[^~?]" + "'", str69.equals("[^~?]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = rEString1.makeExclude(rEString3);
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = rEString8.makeExclude(rEString10);
        st1920.automaton.REString rEString12 = rEString6.makeAnyChar(rEString11);
        st1920.automaton.REString rEString13 = rEString3.makeExclude(rEString6);
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = rEString15.makeExclude(rEString17);
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = rEString22.makeExclude(rEString24);
        st1920.automaton.REString rEString26 = rEString20.makeAnyChar(rEString25);
        st1920.automaton.REString rEString27 = rEString17.makeExclude(rEString20);
        st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString30 = rEString17.makeAlpha(rEString29);
        st1920.automaton.REString rEString31 = rEString13.makeAlpha(rEString29);
        java.lang.String str32 = rEString31.string;
        st1920.automaton.REString rEString34 = new st1920.automaton.REString("~..1");
        java.lang.String str35 = rEString34.string;
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString45 = rEString42.makeExclude(rEString44);
        st1920.automaton.REString rEString46 = rEString40.makeAnyChar(rEString45);
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = rEString48.makeExclude(rEString50);
        st1920.automaton.REString rEString54 = rEString40.makeRange(rEString50, 10, 0);
        st1920.automaton.REString rEString57 = rEString38.makeRep(rEString40, (int) 'a', (int) '4');
        boolean boolean58 = st1920.automaton.REGEXWrapper.matches("*", rEString57);
        st1920.automaton.REString rEString59 = rEString34.makeExclude(rEString57);
        st1920.automaton.REString rEString60 = rEString31.makeOneOrMore(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "a" + "'", str32.equals("a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "~..1" + "'", str35.equals("~..1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        java.lang.String str15 = rEString4.string;
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString22 = rEString19.makeExclude(rEString21);
        st1920.automaton.REString rEString23 = rEString17.makeAnyChar(rEString22);
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString28 = rEString25.makeExclude(rEString27);
        st1920.automaton.REString rEString29 = rEString22.makeAnyChar(rEString28);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString36 = rEString33.makeExclude(rEString35);
        st1920.automaton.REString rEString37 = rEString31.makeAnyChar(rEString36);
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = rEString39.makeExclude(rEString41);
        st1920.automaton.REString rEString43 = rEString36.makeAnyChar(rEString42);
        st1920.automaton.REString rEString44 = rEString29.makeAny(rEString42);
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString49 = rEString46.makeExclude(rEString48);
        st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString56 = rEString53.makeExclude(rEString55);
        st1920.automaton.REString rEString57 = rEString51.makeAnyChar(rEString56);
        st1920.automaton.REString rEString58 = rEString48.makeExclude(rEString51);
        st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = rEString62.makeExclude(rEString64);
        st1920.automaton.REString rEString66 = rEString60.makeAnyChar(rEString65);
        st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString71 = rEString68.makeExclude(rEString70);
        st1920.automaton.REString rEString72 = rEString65.makeAnyChar(rEString71);
        st1920.automaton.REString rEString73 = rEString58.makeZeroOrOne(rEString71);
        st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString77 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString80 = rEString77.makeExclude(rEString79);
        st1920.automaton.REString rEString81 = rEString75.makeAnyChar(rEString80);
        st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString86 = rEString83.makeExclude(rEString85);
        st1920.automaton.REString rEString87 = rEString80.makeAnyChar(rEString86);
        st1920.automaton.REString rEString88 = rEString58.makeOneOrMore(rEString87);
        st1920.automaton.REString rEString89 = rEString29.makeExcludeClass(rEString58);
        st1920.automaton.REString rEString91 = new st1920.automaton.REString("~");
        st1920.automaton.REString rEString92 = rEString4.makeAnd(rEString29, rEString91);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean93 = st1920.automaton.REGEXWrapper.matches("~", rEString91);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString92);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = rEString1.makeExclude(rEString3);
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = rEString8.makeExclude(rEString10);
        st1920.automaton.REString rEString12 = rEString6.makeAnyChar(rEString11);
        st1920.automaton.REString rEString13 = rEString3.makeExclude(rEString6);
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString16 = rEString3.makeAlpha(rEString15);
        rEString16.string = "";
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = rEString22.makeExclude(rEString24);
        st1920.automaton.REString rEString26 = rEString20.makeAnyChar(rEString25);
        st1920.automaton.REString rEString27 = rEString16.makeZeroOrMore(rEString26);
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = rEString30.makeExclude(rEString32);
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = rEString37.makeExclude(rEString39);
        st1920.automaton.REString rEString41 = rEString35.makeAnyChar(rEString40);
        st1920.automaton.REString rEString42 = rEString32.makeExclude(rEString35);
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = rEString44.makeExclude(rEString46);
        st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString54 = rEString51.makeExclude(rEString53);
        st1920.automaton.REString rEString55 = rEString49.makeAnyChar(rEString54);
        st1920.automaton.REString rEString56 = rEString46.makeExclude(rEString49);
        st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString59 = rEString46.makeAlpha(rEString58);
        st1920.automaton.REString rEString60 = rEString42.makeAlpha(rEString58);
        boolean boolean61 = st1920.automaton.REGEXWrapper.matches("~.+", rEString58);
        st1920.automaton.REString rEString62 = rEString16.makeAlpha(rEString58);
        st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString67 = rEString64.makeExclude(rEString66);
        st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString74 = rEString71.makeExclude(rEString73);
        st1920.automaton.REString rEString75 = rEString69.makeAnyChar(rEString74);
        st1920.automaton.REString rEString76 = rEString66.makeExclude(rEString69);
        st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString81 = rEString78.makeExclude(rEString80);
        st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString87 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString88 = rEString85.makeExclude(rEString87);
        st1920.automaton.REString rEString89 = rEString83.makeAnyChar(rEString88);
        st1920.automaton.REString rEString90 = rEString80.makeExclude(rEString83);
        st1920.automaton.REString rEString92 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString93 = rEString80.makeAlpha(rEString92);
        st1920.automaton.REString rEString94 = rEString76.makeAlpha(rEString92);
        st1920.automaton.REString rEString95 = rEString16.makeClass(rEString92);
        java.lang.Class<?> wildcardClass96 = rEString92.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString8 = rEString5.makeExclude(rEString7);
        st1920.automaton.REString rEString9 = rEString3.makeAnyChar(rEString8);
        st1920.automaton.REString rEString10 = rEString1.makeAnyChar(rEString9);
        java.lang.String str11 = rEString9.string;
        st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString16 = rEString13.makeExclude(rEString15);
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = rEString20.makeExclude(rEString22);
        st1920.automaton.REString rEString24 = rEString18.makeAnyChar(rEString23);
        st1920.automaton.REString rEString25 = rEString15.makeExclude(rEString18);
        st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString32 = rEString29.makeExclude(rEString31);
        st1920.automaton.REString rEString33 = rEString27.makeAnyChar(rEString32);
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = rEString35.makeExclude(rEString37);
        st1920.automaton.REString rEString39 = rEString32.makeAnyChar(rEString38);
        st1920.automaton.REString rEString40 = rEString25.makeZeroOrOne(rEString38);
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = rEString44.makeExclude(rEString46);
        st1920.automaton.REString rEString48 = rEString42.makeAnyChar(rEString47);
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString53 = rEString50.makeExclude(rEString52);
        st1920.automaton.REString rEString54 = rEString47.makeAnyChar(rEString53);
        st1920.automaton.REString rEString55 = rEString25.makeOneOrMore(rEString54);
        st1920.automaton.REString rEString56 = rEString9.makeClass(rEString55);
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString66 = rEString63.makeExclude(rEString65);
        st1920.automaton.REString rEString67 = rEString61.makeAnyChar(rEString66);
        st1920.automaton.REString rEString68 = rEString59.makeAnyChar(rEString67);
        boolean boolean69 = st1920.automaton.REGEXWrapper.matches("~.+", rEString59);
        java.lang.String str70 = rEString59.string;
        st1920.automaton.REString rEString71 = rEString56.makeZeroOrMore(rEString59);
        rEString59.string = "*";
        java.lang.Class<?> wildcardClass74 = rEString59.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "~." + "'", str11.equals("~."));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "" + "'", str70.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("a");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = rEString6.makeExclude(rEString8);
        st1920.automaton.REString rEString10 = rEString4.makeAnyChar(rEString9);
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString15 = rEString12.makeExclude(rEString14);
        st1920.automaton.REString rEString16 = rEString9.makeAnyChar(rEString15);
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString28 = rEString25.makeExclude(rEString27);
        st1920.automaton.REString rEString29 = rEString23.makeAnyChar(rEString28);
        st1920.automaton.REString rEString30 = rEString20.makeExclude(rEString23);
        st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = rEString34.makeExclude(rEString36);
        st1920.automaton.REString rEString38 = rEString32.makeAnyChar(rEString37);
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = rEString40.makeExclude(rEString42);
        st1920.automaton.REString rEString44 = rEString37.makeAnyChar(rEString43);
        st1920.automaton.REString rEString45 = rEString30.makeZeroOrOne(rEString43);
        st1920.automaton.REString rEString46 = rEString15.makeZeroOrMore(rEString45);
        st1920.automaton.REString rEString47 = rEString2.makeNothing(rEString15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = st1920.automaton.REGEXWrapper.matches("~&#", rEString15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = rEString3.makeExclude(rEString5);
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString13 = rEString10.makeExclude(rEString12);
        st1920.automaton.REString rEString14 = rEString8.makeAnyChar(rEString13);
        st1920.automaton.REString rEString15 = rEString5.makeExclude(rEString8);
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = rEString17.makeExclude(rEString19);
        st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString22.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString19.makeExclude(rEString22);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString32 = rEString19.makeAlpha(rEString31);
        st1920.automaton.REString rEString33 = rEString15.makeAlpha(rEString31);
        boolean boolean34 = st1920.automaton.REGEXWrapper.matches("~.+", rEString31);
        boolean boolean35 = st1920.automaton.REGEXWrapper.matches("hi!", rEString31);
        st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = rEString37.makeExclude(rEString39);
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = rEString44.makeExclude(rEString46);
        st1920.automaton.REString rEString48 = rEString42.makeAnyChar(rEString47);
        st1920.automaton.REString rEString49 = rEString39.makeExclude(rEString42);
        st1920.automaton.REString rEString50 = rEString31.makeAnyChar(rEString42);
        rEString50.string = "#";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString50);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        java.lang.String str6 = rEString4.string;
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = rEString8.makeExclude(rEString10);
        st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = rEString15.makeExclude(rEString17);
        st1920.automaton.REString rEString19 = rEString13.makeAnyChar(rEString18);
        st1920.automaton.REString rEString20 = rEString10.makeExclude(rEString13);
        st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = rEString10.makeAlpha(rEString22);
        st1920.automaton.REString rEString24 = rEString4.makeExclude(rEString22);
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString29 = rEString26.makeExclude(rEString28);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString36 = rEString33.makeExclude(rEString35);
        st1920.automaton.REString rEString37 = rEString31.makeAnyChar(rEString36);
        st1920.automaton.REString rEString38 = rEString28.makeExclude(rEString31);
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = rEString40.makeExclude(rEString42);
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString50 = rEString47.makeExclude(rEString49);
        st1920.automaton.REString rEString51 = rEString45.makeAnyChar(rEString50);
        st1920.automaton.REString rEString52 = rEString42.makeExclude(rEString45);
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = rEString42.makeAlpha(rEString54);
        st1920.automaton.REString rEString56 = rEString38.makeAlpha(rEString54);
        st1920.automaton.REString rEString57 = rEString24.makeNothing(rEString38);
        st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = rEString62.makeExclude(rEString64);
        st1920.automaton.REString rEString66 = rEString60.makeAnyChar(rEString65);
        st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString71 = rEString68.makeExclude(rEString70);
        st1920.automaton.REString rEString74 = rEString60.makeRange(rEString70, 10, 0);
        boolean boolean75 = st1920.automaton.REGEXWrapper.matches("~.", rEString70);
        st1920.automaton.REString rEString76 = rEString57.makeAlpha(rEString70);
        st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString82 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString83 = rEString80.makeExclude(rEString82);
        st1920.automaton.REString rEString84 = rEString78.makeAnyChar(rEString83);
        st1920.automaton.REString rEString87 = rEString70.makeRep(rEString78, 100, 0);
        boolean boolean88 = st1920.automaton.REGEXWrapper.matches("[~..]<0-1>", rEString87);
        java.lang.String str89 = rEString87.string;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "<100-0>" + "'", str89.equals("<100-0>"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = rEString1.makeExclude(rEString3);
        java.lang.String str5 = rEString3.string;
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString10 = rEString7.makeExclude(rEString9);
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString17 = rEString14.makeExclude(rEString16);
        st1920.automaton.REString rEString18 = rEString12.makeAnyChar(rEString17);
        st1920.automaton.REString rEString19 = rEString9.makeExclude(rEString12);
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString22 = rEString9.makeAlpha(rEString21);
        st1920.automaton.REString rEString23 = rEString3.makeExclude(rEString21);
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString28 = rEString25.makeExclude(rEString27);
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString35 = rEString32.makeExclude(rEString34);
        st1920.automaton.REString rEString36 = rEString30.makeAnyChar(rEString35);
        st1920.automaton.REString rEString37 = rEString27.makeExclude(rEString30);
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = rEString39.makeExclude(rEString41);
        st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString49 = rEString46.makeExclude(rEString48);
        st1920.automaton.REString rEString50 = rEString44.makeAnyChar(rEString49);
        st1920.automaton.REString rEString51 = rEString41.makeExclude(rEString44);
        st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString54 = rEString41.makeAlpha(rEString53);
        st1920.automaton.REString rEString55 = rEString37.makeAlpha(rEString53);
        st1920.automaton.REString rEString56 = rEString23.makeNothing(rEString37);
        st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = rEString61.makeExclude(rEString63);
        st1920.automaton.REString rEString65 = rEString59.makeAnyChar(rEString64);
        st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString70 = rEString67.makeExclude(rEString69);
        st1920.automaton.REString rEString73 = rEString59.makeRange(rEString69, 10, 0);
        boolean boolean74 = st1920.automaton.REGEXWrapper.matches("~.", rEString69);
        st1920.automaton.REString rEString75 = rEString56.makeAlpha(rEString69);
        java.lang.Class<?> wildcardClass76 = rEString75.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString21 = rEString18.makeExclude(rEString20);
        st1920.automaton.REString rEString22 = rEString16.makeAnyChar(rEString21);
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString28 = rEString21.makeAnyChar(rEString27);
        st1920.automaton.REString rEString29 = rEString14.makeZeroOrOne(rEString27);
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = rEString31.makeExclude(rEString33);
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString39 = rEString36.makeExclude(rEString38);
        st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString46 = rEString43.makeExclude(rEString45);
        st1920.automaton.REString rEString47 = rEString41.makeAnyChar(rEString46);
        st1920.automaton.REString rEString48 = rEString38.makeExclude(rEString41);
        st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = rEString52.makeExclude(rEString54);
        st1920.automaton.REString rEString56 = rEString50.makeAnyChar(rEString55);
        st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString61 = rEString58.makeExclude(rEString60);
        st1920.automaton.REString rEString62 = rEString55.makeAnyChar(rEString61);
        st1920.automaton.REString rEString63 = rEString48.makeZeroOrOne(rEString61);
        st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString68 = rEString65.makeExclude(rEString67);
        st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString75 = rEString72.makeExclude(rEString74);
        st1920.automaton.REString rEString76 = rEString70.makeAnyChar(rEString75);
        st1920.automaton.REString rEString77 = rEString67.makeExclude(rEString70);
        st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString80 = rEString67.makeAlpha(rEString79);
        st1920.automaton.REString rEString81 = rEString48.makeClass(rEString67);
        st1920.automaton.REString rEString84 = rEString33.makeRep(rEString48, (int) 'a', (int) (short) 1);
        st1920.automaton.REString rEString85 = rEString29.makeZeroOrMore(rEString48);
        boolean boolean86 = st1920.automaton.REGEXWrapper.matches("~~&", rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString5 = rEString2.makeExclude(rEString4);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString12 = rEString9.makeExclude(rEString11);
        st1920.automaton.REString rEString13 = rEString7.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = rEString4.makeExclude(rEString7);
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = rEString16.makeExclude(rEString18);
        st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = rEString23.makeExclude(rEString25);
        st1920.automaton.REString rEString27 = rEString21.makeAnyChar(rEString26);
        st1920.automaton.REString rEString28 = rEString18.makeExclude(rEString21);
        st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = rEString18.makeAlpha(rEString30);
        st1920.automaton.REString rEString32 = rEString14.makeAlpha(rEString30);
        st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString37 = rEString34.makeExclude(rEString36);
        st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString44 = rEString41.makeExclude(rEString43);
        st1920.automaton.REString rEString45 = rEString39.makeAnyChar(rEString44);
        st1920.automaton.REString rEString46 = rEString36.makeExclude(rEString39);
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString49 = rEString36.makeAlpha(rEString48);
        st1920.automaton.REString rEString52 = rEString14.makeRange(rEString36, (int) (byte) 1, (int) (byte) 100);
        st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString59 = rEString56.makeExclude(rEString58);
        st1920.automaton.REString rEString60 = rEString54.makeAnyChar(rEString59);
        st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString65 = rEString62.makeExclude(rEString64);
        st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = rEString69.makeExclude(rEString71);
        st1920.automaton.REString rEString73 = rEString67.makeAnyChar(rEString72);
        st1920.automaton.REString rEString74 = rEString64.makeExclude(rEString67);
        st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString77 = rEString64.makeAlpha(rEString76);
        st1920.automaton.REString rEString78 = rEString59.makeAny(rEString77);
        st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString82 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString83 = rEString80.makeExclude(rEString82);
        st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString87 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString89 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString90 = rEString87.makeExclude(rEString89);
        st1920.automaton.REString rEString91 = rEString85.makeAnyChar(rEString90);
        st1920.automaton.REString rEString92 = rEString82.makeExclude(rEString85);
        st1920.automaton.REString rEString93 = rEString78.makeNum(rEString92);
        st1920.automaton.REString rEString94 = rEString36.makeZeroOrMore(rEString78);
        boolean boolean95 = st1920.automaton.REGEXWrapper.matches("#", rEString78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        st1920.automaton.REString rEString1 = new st1920.automaton.REString("[^~?]");
        st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString9 = rEString6.makeExclude(rEString8);
        st1920.automaton.REString rEString10 = rEString4.makeAnyChar(rEString9);
        st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString19 = rEString16.makeExclude(rEString18);
        st1920.automaton.REString rEString20 = rEString14.makeAnyChar(rEString19);
        st1920.automaton.REString rEString21 = rEString12.makeAnyChar(rEString20);
        java.lang.String str22 = rEString20.string;
        st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString27 = rEString24.makeExclude(rEString26);
        st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString34 = rEString31.makeExclude(rEString33);
        st1920.automaton.REString rEString35 = rEString29.makeAnyChar(rEString34);
        st1920.automaton.REString rEString36 = rEString26.makeExclude(rEString29);
        st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString43 = rEString40.makeExclude(rEString42);
        st1920.automaton.REString rEString44 = rEString38.makeAnyChar(rEString43);
        st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString49 = rEString46.makeExclude(rEString48);
        st1920.automaton.REString rEString50 = rEString43.makeAnyChar(rEString49);
        st1920.automaton.REString rEString51 = rEString36.makeZeroOrOne(rEString49);
        st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString58 = rEString55.makeExclude(rEString57);
        st1920.automaton.REString rEString59 = rEString53.makeAnyChar(rEString58);
        st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString64 = rEString61.makeExclude(rEString63);
        st1920.automaton.REString rEString65 = rEString58.makeAnyChar(rEString64);
        st1920.automaton.REString rEString66 = rEString36.makeOneOrMore(rEString65);
        st1920.automaton.REString rEString67 = rEString20.makeClass(rEString66);
        st1920.automaton.REString rEString68 = rEString4.makeOneOrMore(rEString20);
        st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString73 = rEString70.makeExclude(rEString72);
        st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString77 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString80 = rEString77.makeExclude(rEString79);
        st1920.automaton.REString rEString81 = rEString75.makeAnyChar(rEString80);
        st1920.automaton.REString rEString82 = rEString72.makeExclude(rEString75);
        st1920.automaton.REString rEString83 = rEString68.makeExcludeClass(rEString75);
        boolean boolean84 = st1920.automaton.REGEXWrapper.matches("", rEString75);
        st1920.automaton.REString rEString85 = rEString1.makeGroup(rEString75);
        java.lang.String str86 = rEString85.string;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "~." + "'", str22.equals("~."));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "()" + "'", str86.equals("()"));
    }
}

