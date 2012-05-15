#!/usr/bin/env python

import wx

class MainFrame(wx.Frame):
    def __init__(self, parent, title):
        wx.Frame.__init__(self, parent, title=title, size=(200, 100))
        self.control = wx.TextCtrl(self, style=wx.TE_MULTILINE)
        self.CreateStatusBar()

        filemenu = wx.Menu()

        menuAbout = filemenu.Append(wx.ID_ABOUT, "&About", "Information about this program")
        self.Bind(wx.EVT_MENU, self.OnAbout, menuAbout)

        filemenu.AppendSeparator()
        menuExit = filemenu.Append(wx.ID_EXIT, "E&xit", "Terminate the program")
        self.Bind(wx.EVT_MENU, self.OnExit, menuExit)

        menuBar = wx.MenuBar()
        menuBar.Append(filemenu, "&File")
        self.SetMenuBar(menuBar)
        self.Show(True)

    def OnAbout(self, e):
        dlg = wx.MessageDialog(self, "A small text editor", "About Sample Editor", wx.OK)
        dlg.ShowModal()
        dlg.Destroy()

    def OnExit(self, e):
        self.Close(True)




app = wx.App(False)
frame = MainFrame(None, 'Sample editor')
app.MainLoop()
