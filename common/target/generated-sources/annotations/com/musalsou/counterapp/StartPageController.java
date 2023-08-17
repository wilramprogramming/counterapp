package com.musalsou.counterapp;
import com.codename1.rad.annotations.*;
import com.codename1.rad.controllers.FormController;
import com.codename1.rad.controllers.Controller;
import com.musalsou.counterapp.*;
import static com.codename1.rad.util.NonNull.nonNull;
import static com.codename1.rad.util.NonNull.nonNullEntries;
import com.codename1.ui.spinner.Picker;
import com.codename1.rad.schemas.*;
import com.codename1.rad.ui.builders.*;
import ca.weblite.shared.components.*;
import com.codename1.rad.models.*;
import com.codename1.rad.nodes.*;
import com.codename1.rad.ui.entityviews.*;
import com.codename1.rad.ui.beans.*;
import com.codename1.rad.propertyviews.*;
import com.codename1.ui.*;
import com.codename1.ui.plaf.*;
import com.codename1.components.*;
import static com.codename1.ui.CN.*;
import com.codename1.ui.layouts.*;
import com.codename1.rad.ui.ViewContext;
import com.codename1.rad.ui.EntityView;
public class StartPageController extends FormController implements IStartPageController, FormController.CloneableFormController<StartPageController> {
    private StartPageModel viewModel;
    public StartPageController(@Inject Controller parent) {
        super(parent);
        this.viewModel = createViewModel();
    }
    public StartPageController(@Inject Controller parent, @Inject StartPageModel viewModel) {
        super(parent);
        this.viewModel = viewModel != null ? viewModel : createViewModel();
    }
    public StartPageModel createViewModel() {
        return new com.musalsou.counterapp.StartPageModelImpl();
    }
    @Override
    public StartPageController cloneAndReplace() {
        StartPageController out = new StartPageController(getParent(), viewModel);
        out.show();
        return out;
    }
    @Override
    protected void onStartController() {
        super.onStartController();
        setView(new StartPage(new ViewContext<StartPageModel>(this, viewModel)));
    }
    @Override
    protected void onStopController() {
        super.onStopController();
    }
}
