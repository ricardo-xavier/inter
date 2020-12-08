package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador475")
public class Somador475 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
