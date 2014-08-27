package net.pladd.DenChiefFinder.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Frame;
import com.google.gwt.user.client.ui.Label;

public class MainUI extends Composite {

	private static MainUIUiBinder uiBinder = GWT.create(MainUIUiBinder.class);
	@UiField Label headerLabel;

	@UiField ScrollPanel denChiefPanel;

	@UiField FlowPanel denChiefSearchPanel;
	@UiField TextBox denChiefSearchText;
	@UiField ListBox denChiefSearchDistance;
	@UiField Button denChiefSearchBtn;

	@UiField Frame denChiefMap;

	@UiField SplitLayoutPanel denChiefDock;
	@SuppressWarnings("rawtypes")
	@UiField CellTable denChiefCells;

	@UiField ScrollPanel denPanel;

	@UiField TextBox denSearchText;
	@UiField ListBox denSearchDistance;
	@UiField Button denSearchBtn;

	@UiField Frame denMap;

	@SuppressWarnings("rawtypes")
	@UiField CellTable denCells;

	@UiField SplitLayoutPanel denDock;

	@UiField ScrollPanel profilePanel;

	interface MainUIUiBinder extends UiBinder<Widget, MainUI> {
	}

	public MainUI() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public void setHeader(String text)
	{
		headerLabel.setText(text);
	}
}
