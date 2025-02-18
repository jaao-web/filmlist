# Filmlist

Filmlist é uma aplicação backend desenvolvida em Java com Spring Boot que gerencia listas de filmes categorizados por gênero. A aplicação permite listar filmes por gênero, alterar a ordem dos filmes dentro de cada lista e persistir essas alterações em um banco de dados.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal utilizada no desenvolvimento da aplicação.
- **Spring Boot**: Framework que simplifica a criação de aplicações Java, proporcionando uma configuração padrão para projetos Spring.
- **Maven**: Ferramenta de automação de compilação e gerenciamento de dependências.
- **Banco de Dados**: Embora o tipo específico de banco de dados não tenha sido especificado, o Spring Boot oferece suporte a diversos bancos de dados relacionais e não relacionais.

## Modelo de domínio DSList

[Uploading filmlist<mxfile host="app.diagrams.net" agent="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36" version="26.0.14">
  <diagram id="C5RBs43oDa-KdzZeNtuy" name="Page-1">
    <mxGraphModel grid="1" page="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" pageScale="1" pageWidth="827" pageHeight="1169" math="0" shadow="0">
      <root>
        <mxCell id="WIyWlLk6GJQsqaUBKTNV-0" />
        <mxCell id="WIyWlLk6GJQsqaUBKTNV-1" parent="WIyWlLk6GJQsqaUBKTNV-0" />
        <mxCell id="zkfFHV4jXpPFQw0GAbJ--13" value="Movie" style="swimlane;fontStyle=0;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeLast=0;collapsible=1;marginBottom=0;rounded=0;shadow=0;strokeWidth=1;fillColor=#fff2cc;strokeColor=#d6b656;" vertex="1" parent="WIyWlLk6GJQsqaUBKTNV-1">
          <mxGeometry x="-30" y="154" width="160" height="186" as="geometry">
            <mxRectangle x="340" y="380" width="170" height="26" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="zkfFHV4jXpPFQw0GAbJ--14" value="-&lt;&lt;pk&gt;&gt; id : Long&#xa;-title: String&#xa;-year: Integer&#xa;-genre: String&#xa;-plataforms: String&#xa;-score: Double&#xa;-imgUrl: String&#xa;-shortDescrition: String&#xa;-longDescription: String" style="text;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;" vertex="1" parent="zkfFHV4jXpPFQw0GAbJ--13">
          <mxGeometry y="26" width="160" height="144" as="geometry" />
        </mxCell>
        <mxCell id="zkfFHV4jXpPFQw0GAbJ--15" value="" style="line;html=1;strokeWidth=1;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;fillColor=#fff2cc;strokeColor=#d6b656;" vertex="1" parent="zkfFHV4jXpPFQw0GAbJ--13">
          <mxGeometry y="170" width="160" height="8" as="geometry" />
        </mxCell>
        <mxCell id="1kgxDrc3Hn19yww6TW08-11" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;endArrow=none;startFill=0;dashed=1;dashPattern=12 12;" edge="1" parent="WIyWlLk6GJQsqaUBKTNV-1" source="1kgxDrc3Hn19yww6TW08-2">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="334" y="250" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="1kgxDrc3Hn19yww6TW08-2" value="Belonging" style="swimlane;fontStyle=0;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeLast=0;collapsible=1;marginBottom=0;rounded=0;shadow=0;strokeWidth=1;fillColor=#fff2cc;strokeColor=#d6b656;" vertex="1" parent="WIyWlLk6GJQsqaUBKTNV-1">
          <mxGeometry x="254" y="320" width="160" height="70" as="geometry">
            <mxRectangle x="340" y="380" width="170" height="26" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="1kgxDrc3Hn19yww6TW08-3" value="Position: Integer" style="text;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;" vertex="1" parent="1kgxDrc3Hn19yww6TW08-2">
          <mxGeometry y="26" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="1kgxDrc3Hn19yww6TW08-4" value="" style="line;html=1;strokeWidth=1;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;fillColor=#fff2cc;strokeColor=#d6b656;" vertex="1" parent="1kgxDrc3Hn19yww6TW08-2">
          <mxGeometry y="52" width="160" height="8" as="geometry" />
        </mxCell>
        <mxCell id="1kgxDrc3Hn19yww6TW08-5" value="MovieList" style="swimlane;fontStyle=0;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeLast=0;collapsible=1;marginBottom=0;rounded=0;shadow=0;strokeWidth=1;fillColor=#fff2cc;strokeColor=#d6b656;" vertex="1" parent="WIyWlLk6GJQsqaUBKTNV-1">
          <mxGeometry x="530" y="212" width="160" height="88" as="geometry">
            <mxRectangle x="340" y="380" width="170" height="26" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="1kgxDrc3Hn19yww6TW08-6" value="-&lt;&lt;pk&gt;&gt;id: Long&#xa;-name: String" style="text;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;" vertex="1" parent="1kgxDrc3Hn19yww6TW08-5">
          <mxGeometry y="26" width="160" height="44" as="geometry" />
        </mxCell>
        <mxCell id="1kgxDrc3Hn19yww6TW08-9" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=0.004;entryY=0.33;entryDx=0;entryDy=0;entryPerimeter=0;endArrow=none;startFill=0;" edge="1" parent="WIyWlLk6GJQsqaUBKTNV-1" source="zkfFHV4jXpPFQw0GAbJ--14" target="1kgxDrc3Hn19yww6TW08-6">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="1kgxDrc3Hn19yww6TW08-10" value="" style="line;html=1;strokeWidth=1;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;fillColor=#fff2cc;strokeColor=#d6b656;" vertex="1" parent="WIyWlLk6GJQsqaUBKTNV-1">
          <mxGeometry x="530" y="280" width="160" height="20" as="geometry" />
        </mxCell>
        <mxCell id="1kgxDrc3Hn19yww6TW08-12" value="*" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" vertex="1" parent="WIyWlLk6GJQsqaUBKTNV-1">
          <mxGeometry x="130" y="250" width="30" height="30" as="geometry" />
        </mxCell>
        <mxCell id="1kgxDrc3Hn19yww6TW08-13" value="*" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" vertex="1" parent="WIyWlLk6GJQsqaUBKTNV-1">
          <mxGeometry x="500" y="250" width="30" height="30" as="geometry" />
        </mxCell>
      </root>
    </mxGraphModel>
  </diagram>
</mxfile>
.drawio…]()


## Funcionalidades

- **Listagem de Filmes por Gênero**: Recupera e exibe filmes agrupados por seus respectivos gêneros.
- **Reordenação de Filmes**: Permite alterar a ordem dos filmes dentro de cada gênero, com as mudanças sendo refletidas e armazenadas no banco de dados.

## Conhecimentos Aplicados

- **Desenvolvimento de API RESTful**: Criação de endpoints para operações de CRUD (Create, Read, Update, Delete) relacionadas às listas de filmes.
- **Persistência de Dados**: Utilização do Spring Data JPA para interagir com o banco de dados e gerenciar a persistência das informações.
- **Arquitetura em Camadas**: Implementação de uma estrutura organizada em camadas (Controller, Service, Repository) para promover a separação de responsabilidades e facilitar a manutenção do código.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

## Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo `LICENSE` para obter mais informações.
