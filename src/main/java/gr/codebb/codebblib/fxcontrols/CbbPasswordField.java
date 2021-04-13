/*
 * copyright 2013-2021
 * codebb.gr
 * codebblib - Utilities for use in protoerp program
 * info@codebb.gr
 */
package gr.codebb.codebblib.fxcontrols;

import javafx.scene.control.PasswordField;

public class CbbPasswordField extends PasswordField {
  public CbbPasswordField() {
    getStylesheets()
        .add(
            CbbPasswordField.class
                .getResource("/gr/codebb/codebblib/fxcontrols/cbbPasswordField.css")
                .toExternalForm());
  }

  public void disableRightButton() {
    this.setStyle("-right-button-visible: false;");
  }
}
