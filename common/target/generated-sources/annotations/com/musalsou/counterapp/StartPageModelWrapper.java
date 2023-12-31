package com.musalsou.counterapp;

import com.codename1.rad.annotations.Autogenerated;
import com.codename1.rad.models.Entity;
import com.codename1.rad.models.SimpleEntityWrapper;

@Autogenerated
public final class StartPageModelWrapper extends SimpleEntityWrapper implements StartPageModel {
  public StartPageModelWrapper(Entity entity) {
    super(entity);
  }

  public static StartPageModel wrap(Entity entity) {
    if (entity == null) return null;if (entity instanceof StartPageModel) return (StartPageModel)entity;StartPageModel wrapper = entity.getEntity().getWrapper(StartPageModel.class);if (wrapper != null) return wrapper;wrapper = new StartPageModelWrapper(entity); entity.getEntity().addWrapper(wrapper);return wrapper;
  }
}
