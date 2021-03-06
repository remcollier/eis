import java.util.LinkedList;

import eis.EIDefaultImpl;
import eis.exceptions.ActException;
import eis.exceptions.EntityException;
import eis.exceptions.ManagementException;
import eis.exceptions.NoEnvironmentException;
import eis.exceptions.PerceiveException;
import eis.iilang.Action;
import eis.iilang.EnvironmentState;
import eis.iilang.Percept;

/**
 * A test environment implementing EIDefaultImpl
 * 
 * @author Tristan
 * @modified W.Pasman 5nov14 added default entity for testing.
 *
 */
@SuppressWarnings("serial")
public class TestEnvironmentInterface extends EIDefaultImpl {
	public TestEnvironmentInterface() throws ManagementException {
		setState(EnvironmentState.PAUSED);
	}

	@Override
	protected LinkedList<Percept> getAllPerceptsFromEntity(String entity)
			throws PerceiveException, NoEnvironmentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean isSupportedByEntity(Action action, String entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean isSupportedByEnvironment(Action action) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean isSupportedByType(Action action, String type) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected Percept performEntityAction(String entity, Action action)
			throws ActException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String requiredVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	public void doAddEntity() throws EntityException {
		addEntity("entityname", "entity");
	}

}
