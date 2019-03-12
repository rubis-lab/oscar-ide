import org.eclipse.swt.widgets.Composite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

public class OSCARTextEditor {
  Display d;

  Shell s;

  OSCARTextEditor() {
    d = new Display();
    s = new Shell(d, SWT.CLOSE);
    s.setSize(500, 500);
    s.setText("OSCAR Text Editor");
    final ToolBar bar = new ToolBar(s, SWT.HORIZONTAL);
    final Text t = new Text(s, SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL
        | SWT.WRAP | SWT.BORDER);
    //          create images for toolbar buttons
    final Image saveIcon = new Image(d, "save.jpg");
    final Image openIcon = new Image(d, "open.jpg");
    final Image childIcon = new Image(d, "userH.ico");
    final Image cutIcon = new Image(d, "cut.jpg");
    final Image copyIcon = new Image(d, "copy.jpg");
    final Image pasteIcon = new Image(d, "paste.jpg");

    //create ToolBar and ToolItems
    final ToolItem openToolItem = new ToolItem(bar, SWT.PUSH);
    final ToolItem saveToolItem = new ToolItem(bar, SWT.PUSH);
    final ToolItem sep1 = new ToolItem(bar, SWT.SEPARATOR);
    final ToolItem cutToolItem = new ToolItem(bar, SWT.PUSH);
    final ToolItem copyToolItem = new ToolItem(bar, SWT.PUSH);
    final ToolItem pasteToolItem = new ToolItem(bar, SWT.PUSH);

    //          create the menu system
    final Menu m = new Menu(s, SWT.BAR);
    final MenuItem file = new MenuItem(m, SWT.CASCADE);
    final Menu filemenu = new Menu(s, SWT.DROP_DOWN);
    final MenuItem openMenuItem = new MenuItem(filemenu, SWT.PUSH);
    final MenuItem saveMenuItem = new MenuItem(filemenu, SWT.PUSH);
    final MenuItem separator = new MenuItem(filemenu, SWT.SEPARATOR);
    final MenuItem exitMenuItem = new MenuItem(filemenu, SWT.PUSH);
    final MenuItem edit = new MenuItem(m, SWT.CASCADE);
    final Menu editmenu = new Menu(s, SWT.DROP_DOWN);
    final MenuItem cutMenuItem = new MenuItem(editmenu, SWT.PUSH);
    final MenuItem copyMenuItem = new MenuItem(editmenu, SWT.PUSH);
    final MenuItem pasteMenuItem = new MenuItem(editmenu, SWT.PUSH);
    final MenuItem help = new MenuItem(m, SWT.CASCADE);
    final Menu helpmenu = new Menu(s, SWT.DROP_DOWN);
    final MenuItem aboutMenuItem = new MenuItem(helpmenu, SWT.PUSH);

    //create reusable named inner classes for SelectionListeners
    class Open extends SelectionAdapter {
      public void widgetSelected(SelectionEvent event) {
        FileDialog fileDialog = new FileDialog(s, SWT.OPEN);
        fileDialog.setText("Open");
        fileDialog.setFilterPath("C:/");
        String[] filterExt = { "*.txt", "*.*" };
        fileDialog.setFilterExtensions(filterExt);
        String selected = fileDialog.open();
        if (selected == null)
          return;
        // code here to open the file and display
        FileReader file = null;
        try {
          file = new FileReader(selected);
        } catch (FileNotFoundException e) {
          MessageBox messageBox = new MessageBox(s, SWT.ICON_ERROR
              | SWT.OK);
          messageBox.setMessage("Could not open file.");
          messageBox.setText("Error");
          messageBox.open();
          return;
        }
        BufferedReader fileInput = new BufferedReader(file);
        String text = null;
        StringBuffer sb = new StringBuffer();
        try {
          do {
            if (text != null)
              sb.append(text);
          } while ((text = fileInput.readLine()) != null);
        } catch (IOException e1) {
          MessageBox messageBox = new MessageBox(s, SWT.ICON_ERROR
              | SWT.OK);
          messageBox.setMessage("Could not write to file.");
          messageBox.setText("Error");
          messageBox.open();
          return;
        }
        t.setText(sb.toString());
      }
    }

    class Save extends SelectionAdapter {
      public void widgetSelected(SelectionEvent event) {
        FileDialog fileDialog = new FileDialog(s, SWT.SAVE);
        fileDialog.setText("Save");
        fileDialog.setFilterPath("C:/");
        String[] filterExt = { "*.txt", "*.*" };
        fileDialog.setFilterExtensions(filterExt);
        String selected = fileDialog.open();
        if (selected == null)
          return;

        File file = new File(selected);
        try {
          FileWriter fileWriter = new FileWriter(file);
          fileWriter.write(t.getText());
          fileWriter.close();
        } catch (IOException e) {
          MessageBox messageBox = new MessageBox(s, SWT.ICON_ERROR
              | SWT.OK);
          messageBox.setMessage("File I/O Error.");
          messageBox.setText("Error");
          messageBox.open();
          return;
        }
      }
    }

    class Cut extends SelectionAdapter {
      public void widgetSelected(SelectionEvent event) {
        t.cut();
      }
    }

    class Copy extends SelectionAdapter {
      public void widgetSelected(SelectionEvent event) {
        t.copy();
      }
    }

    class Paste extends SelectionAdapter {
      public void widgetSelected(SelectionEvent event) {
        t.paste();
      }
    }
    //set the size and location of the user interface widgets
    bar.setSize(500, 55);
    bar.setLocation(10, 0);
    t.setBounds(0, 56, 490, 395);

    //Configure the ToolBar
    openToolItem.setImage(openIcon);
    openToolItem.setText("Open");
    openToolItem.setToolTipText("Open File");
    saveToolItem.setImage(saveIcon);
    saveToolItem.setText("Save");
    saveToolItem.setToolTipText("Save File");
    cutToolItem.setImage(cutIcon);
    cutToolItem.setText("Cut");
    cutToolItem.setToolTipText("Cut");
    copyToolItem.setImage(copyIcon);
    copyToolItem.setText("Copy");
    copyToolItem.setToolTipText("Copy");
    pasteToolItem.setImage(pasteIcon);
    pasteToolItem.setText("Paste");
    pasteToolItem.setToolTipText("Paste");

    //add SelectionListeners to the toolbar buttons
    openToolItem.addSelectionListener(new Open());
    saveToolItem.addSelectionListener(new Save());
    cutToolItem.addSelectionListener(new Cut());
    copyToolItem.addSelectionListener(new Copy());
    pasteToolItem.addSelectionListener(new Paste());

    //Configure the menu items
    file.setText("&File");
    file.setMenu(filemenu);
    openMenuItem.setText("&Open\tCTRL+O");
    openMenuItem.setAccelerator(SWT.CTRL + 'O');
    saveMenuItem.setText("&Save\tCTRL+S");
    saveMenuItem.setAccelerator(SWT.CTRL + 'S');
    exitMenuItem.setText("E&xit");
    edit.setText("&Edit");
    edit.setMenu(editmenu);
    cutMenuItem.setText("&Cut");
    copyMenuItem.setText("Co&py");
    pasteMenuItem.setText("&Paste");
    help.setText("&Help");
    help.setMenu(helpmenu);
    aboutMenuItem.setText("&About");

    // add SelectionListeners for the menu items
    openMenuItem.addSelectionListener(new Open());
    saveMenuItem.addSelectionListener(new Save());
    exitMenuItem.addSelectionListener(new SelectionAdapter() {
      public void widgetSelected(SelectionEvent e) {
        System.exit(0);
      }
    });
    cutMenuItem.addSelectionListener(new Cut());
    copyMenuItem.addSelectionListener(new Copy());
    pasteMenuItem.addSelectionListener(new Paste());
    aboutMenuItem.addSelectionListener(new SelectionAdapter() {
      public void widgetSelected(SelectionEvent e) {
        AboutDialog ad = new AboutDialog(s);
        ad.open();
      }
    });
    s.setMenuBar(m);
    s.open();
    while (!s.isDisposed()) {
      if (!d.readAndDispatch())
        d.sleep();
    }
    d.dispose();
  }

  // include a main method to make the class executable
  public static void main(String[] args) {
    OSCARTextEditor ste = new OSCARTextEditor();
  }
}

class AboutDialog extends Dialog {
  AboutDialog(Shell parent) {
    super(parent);
  }

  public void open() {
    Shell parent = getParent();
    final Shell dialog = new Shell(parent, SWT.DIALOG_TRIM
        | SWT.APPLICATION_MODAL);
    dialog.setSize(200, 100);
    dialog.setText("About");
    final Label l = new Label(dialog, SWT.NONE);
    l.setText("An OSCAR Text Editor");
    l.setBounds(43, 20, 100, 20);
    Button b = new Button(dialog, SWT.PUSH | SWT.BORDER);
    b.setText("OK");
    b.setBounds(80, 45, 40, 25);
    b.addSelectionListener(new SelectionAdapter() {
      public void widgetSelected(SelectionEvent e) {
        dialog.dispose();
      }
    });
    dialog.open();
    Display display = parent.getDisplay();
    while (!dialog.isDisposed()) {
      if (!display.readAndDispatch())
        display.sleep();
    }
  }
}
