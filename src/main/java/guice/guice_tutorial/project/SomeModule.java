package guice.guice_tutorial.project;

import com.google.inject.AbstractModule;
import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.assistedinject.FactoryModuleBuilder;

public class SomeModule extends AbstractModule
{
	@Override
	protected void configure()
	{
		install(new FactoryModuleBuilder().implement(A.class, SomeHelper2.class).build(SomeFactory.class));
	}
}
