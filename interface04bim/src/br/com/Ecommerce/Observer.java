package fernando;

import javax.security.auth.Subject;

public interface Observer {
	
	void update(Subject s, Object o);

}
