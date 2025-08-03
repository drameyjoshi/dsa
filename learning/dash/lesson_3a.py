"""
Lesson 3 of Dash tutorial. I made a few changes to the code available in the
official tutorial:
(1) Split the code into functions.
(2) Eliminated the need for global variables.
(3) Created a `main` function as the entry point.
"""

import io
import pandas as pd
import plotly
import plotly.express as px

import dash_bootstrap_components as dbc
from dash import (
    Dash,
    html,
    dash_table,
    dcc,
    callback,
    Input,
    Output
)


def assemble() -> dbc.Container:
    """
    Assemble the widgets
    """
    url = "https://raw.githubusercontent.com/plotly/datasets/master/gapminder_unfiltered.csv"
    df = pd.read_csv(url)
    row1 = dbc.Row([html.Div(children="Lesson 3a", style={
                   "textAlign": "center", "color": "blue", "fontSize": 30})])
    columns = ['pop', 'lifeExp', 'gdpPercap']
    options = [{"label": x.title(), "value": x} for x in columns]
    row2 = dbc.Row([
        dbc.RadioItems(options=options,
                       value='lifeExp',
                       inline=True,
                       id='choices')
    ])
    row3 = dbc.Row([
        dbc.Col([
                dash_table.DataTable(
                    data=df.to_dict('records'),
                    page_size=12,
                    style_table={
                        'overflowX': 'auto'})
                ], width=6),

        dbc.Col([
                dcc.Graph(figure={}, id='graph')
                ], width=6),
    ])
    row4 = dcc.Store(id="data")
    row4.data = df.to_json(date_format='iso', orient='split')

    return dbc.Container([row1, row2, row3, row4], fluid=True)


@callback(
    outputs=[Output(component_id="graph", component_property="figure")],
    inputs=[Input(component_id="choices", component_property="value"),
            Input(component_id="data", component_property="data")]
)
def update_graph(col_chosen: str,
                 json_df: dict) -> plotly.graph_objects.Figure:
    """
    Update the graph by selecting the chosen column.
    """
    df = pd.read_json(io.StringIO(json_df), orient="split")
    return px.histogram(df, x="continent", y=col_chosen, histfunc="avg")


def main():
    """
    The main function.
    """
    app = Dash()
    app.layout = assemble()
    app.run(debug=True)


if __name__ == "__main__":
    main()
