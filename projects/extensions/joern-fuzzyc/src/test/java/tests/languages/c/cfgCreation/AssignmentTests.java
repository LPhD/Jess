package tests.languages.c.cfgCreation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import cfg.CFG;

public class AssignmentTests extends CCFGCreatorTest {
	@Test
	public void testSingleAssignmentBlockNumber() {
		String input = "x = y;";
		CFG cfg = getCFGForCode(input);
		assertEquals(3, cfg.size());
	}

	@Test
	public void testAssignmentASTLink() {
		String input = "x = 10;";
		CFG cfg = getCFGForCode(input);
		assertTrue(getNodeByCode(cfg, "x = 10") != null);
	}

	@Test
	public void testAssignmentInDecl() {
		String input = "int x = 10;";
		CFG cfg = getCFGForCode(input);
		assertEquals(3, cfg.size());
	}

}
